import sys
sys.path.insert(0,'../generated')

import SpreadParse
from Parser_RiskAssessment import *
s=SpreadParse.Spreadsheet()
s.InitFromFile("RiskAssessmentCSV.csv")
s.Print
pq=ParseRiskAssessment(s)
headers = pq.getColumnHeaders()
#print headers
#print ['Main Components', ' Operation Activity  Equipment or Component under consideration','Responsible person (Risk identified by)','Aspect Under Consideration','Significant Hazards','Who is at risk ?','Likelihood 1-5','Severity 1-5','Result','Action Required','Mitigation measure taken by Designer.       (1) Remove     2)Reduce       (3)Protection (4)Information','Software','Mechanical/hardware','User manual','Other','Reason why not actioned at higher mitigation / elimination level ?','Residual Likelihood','Residual Severity','Result','Notes to assist recipient in further reducing the residual hazard risk','Standards / legislation','Description by department/contacts']
#print pq.matchColumns(headers)

start_row,start_col, depth =s.FindBlockAndDepth(headers)
#print start_row,start_col, depth

#x=pq.parseBlock(headers,14,2,7)
x=pq.parseBlock(headers,start_row,start_col, depth)
print x




