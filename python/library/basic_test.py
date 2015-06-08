import sys
sys.path.insert(0,'../generated')

import SpreadParse
import Parser_Questionnaire
s=SpreadParse.Spreadsheet()
s.InitFromFile("testCsvFile.csv")
s.Print
pq=Parser_Questionnaire.ParseQuestionnaire(s)
headers=['Form','Name','Question','Type','Value','Condition']
print pq.matchColumns(headers)
x=pq.parseBlock(headers,14,2,7)
hr,hc = s.FindHeaders(headers)

s.Print

x=pq.parseBlock(headers,hr+1,hc,7)
print x




