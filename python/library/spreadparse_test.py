from SpreadParse import *

#csv_test_file = "testCsvFile.csv"
csv_test_file = "RiskAssessmentCSV.csv"

c1 = Cell(1,1,"empty","","","")
c2 = Cell(1,2,"header","Header data","string","")
E1 = Empty(2,3)
H1 = Header(3,4,"Header")
D1 = Data(4,5, "some random data","string",None)


#headers=['Form','Name','Question','Type','Value','Condition']
#headers=['Main Components', 'Operation Activity  Equipment or Component under consideration', 'Responsible person (Risk identified by)', 'Aspect Under Consideration', 'Significant Hazards', 'Who is at risk ?', 'Likelihood 1-5', 'Severity 1-5', 'Result', 'Action Required', 'Mitigation measure taken by Designer.       (1) Remove     2)Reduce       (3)Protection (4)Information', 'Software', 'Mechanical/hardware', 'User manual', 'Other', 'Reason why not actioned at higher mitigation / elimination level ?', 'Residual Likelihood', 'Residual Severity', 'Result', 'Notes to assist recipient in further reducing the residual hazard risk', 'Standards / legislation', 'Description by department/contacts']
headers=['Main Components', ' Operation, Activity,  Equipment or Component under consideration', 'Responsible person (Risk identified by)', 'Aspect Under Consideration', 'Significant Hazards', 'Who is at risk ?', 'Likelihood 1-5', 'Severity 1-5', 'Result', 'Action Required', 'Mitigation measure taken by Designer.       (1) Remove,     2)Reduce,       (3)Protection, (4)Information', 'Software', 'Mechanical/hardware', 'User manual', 'Other', 'Reason why not actioned at higher mitigation / elimination level ?', 'Residual Likelihood', 'Residual Severity', 'Result', 'Notes to assist recipient in further reducing the residual hazard risk', 'Standards / legislation', 'Description by department/contacts']       
S= Spreadsheet()
S.InitFromFile(csv_test_file)


print S.noOfCols
print S.noOfRows

print S.objCells[1][1].data
        
#S.Print()

#print S.objCells[1][1].isEmpty()

      

#S.checkHeaders(headers)

hr,hc,depth = S.FindBlockAndDepth(headers)

print hr,hc,depth 

S.Print()
S.printCsvFile()