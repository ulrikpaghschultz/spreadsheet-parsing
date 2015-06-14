'''
Created on Jun 7, 2015

@author: sorin
'''
import csv
#csv_test_file = "testCsvFile.csv"


class Cell:
    def __init__(self, row, column, cell_type, data, data_type, fn):
        self.row = row
        self.column = column
        self.cell_type = cell_type
        self.data = data
        self.data_type = data_type
        self.fn = fn
    
    def isEmpty(self):
        if  self.cell_type == "empty":
            return True
        else:
            return False
    
    def isHeader(self):
        if  self.cell_type == "header":
            return True
        else:
            return False
    
    def isData(self):
        if  self.cell_type == "data":
            return True
        else:
            return False
 
class Empty(Cell):
    def __init__(self,row,column):
        Cell.__init__(self, row, column, "empty", None, None, None)
  
        
class Header(Cell):
    def __init__(self,row,column, data):
        Cell.__init__(self, row, column, "header", data, None, None)
         
class Data(Cell):
    def __init__(self,row,column, data, data_type="string", fn=None):
        Cell.__init__(self, row, column, "data", data, data_type, fn)

class Spreadsheet:
    def __init__(self):
        self.csv_file_name = None
        self.noOfRows = 0
        self.noOfCols = 0
        self.objCells = []
        
    def InitFromFile(self, csv_file_name):
        self.csv_file_name = csv_file_name
        with open(csv_file_name) as f:
            i=0
            for row in csv.reader(f): 
                self.objCells.append([]) 
                j=0         
                for col in row:
                    if col == "":
                        self.objCells[i].append(Empty(i,j)) 
                    else:
                        self.objCells[i].append(Data(i,j,col))
                    j=j+1
                i=i+1
        self.noOfRows = i
        self.noOfCols = j
        
    def __FindHeaders(self,headers):
        headers_len = len(headers)
        r=0
        for row in self.objCells:
            c = 0
            for obj in row:
                if ((obj.cell_type == "data") and (c < self.noOfCols - headers_len)):
                    read_buffer = self.objCells[r][c:c+headers_len]
                    read_data = [cell.data for cell in read_buffer]
                    if read_data == headers:
                        for cell in read_buffer:
                            cell.cell_type = "header"
                        return (r,c)
                c += 1
            r += 1
        return (-1,-1)
    
    def FindBlockAndDepth(self,headers):
        hr,hc = self.__FindHeaders(headers)
        #print "row", hr, "col",hc
        headers_len = len(headers)
        max_depth = -1
        if(hr != -1 and hc != -1):
            hr +=1 #the block starts one row below header's row
            for i in range(0,headers_len):
                depth = self.getColDepth(hr,hc+i)
                if max_depth < depth:
                    max_depth = depth
        return hr,hc,max_depth
     
    def getColDepth(self, row, col):
        i = 0   
        while (i < self.noOfRows - row) and (self.objCells[row+i][col].isEmpty() == False):
            i += 1
        return i
    
    #debugging functionality
    
    def checkHeaders(self,headers):
        for i in range(0,len(headers)):
            print '______________',headers[i:i+1]
            hr,hc = self.__FindHeaders(headers[i:i+1])
            if(hr == -1 or hc == -1):
                print "Not found: ", headers[i], " (row:", hr, "col:", hc, ")"                
    
    def printCsvFile(self):
        for row in self.objCells:
            for obj in row:
                print obj.data
            print "++++++++++++++++++++++++"

    
    def Print(self):
        for row in self.objCells:
            for obj in row:
                if obj.cell_type == "empty":
                    print "O",
                elif obj.cell_type == "data":
                    print "X",
                elif obj.cell_type == "header":
                    print "*",
                else:
                    print "?",
            print ""
 

