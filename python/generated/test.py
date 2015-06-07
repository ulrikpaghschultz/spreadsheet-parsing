from SpreadParse import *

csv_test_file = "testCsvFile.csv"

c1 = Cell(1,1,"empty","","","")
c2 = Cell(1,2,"header","Header data","string","")
E1 = Empty(2,3)
H1 = Header(3,4,"Header")
D1 = Data(4,5, "some random data","string",None)




        
S= Spreadsheet()
S.InitFromFile(csv_test_file)


print S.noOfCols
print S.noOfRows

print S.objCells[1][1].data
        
S.Print()

print S.objCells[1][1].isEmpty()

