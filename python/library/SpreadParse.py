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
        
    def FindHeaders(self,headers):
        header_size = len(headers)
        r=0
        for row in self.objCells:
            c = 0
            for obj in row:
                if ((obj.cell_type == "data") and (c < self.noOfCols - header_size)):
                    read_buffer = self.objCells[r][c:c+header_size]
                    read_data = [cell.data for cell in read_buffer]
                    if read_data == headers:
                        for cell in read_buffer:
                            cell.cell_type = "header"
                        return (r,c)
                c += 1
            r += 1
        return (-1,-1)
    
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
 

