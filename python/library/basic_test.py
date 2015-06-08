import sys
sys.path.insert(0,'../generated')
import SpreadParse
import Parser_Questionnaire
s=SpreadParse.Spreadsheet()
s.InitFromFile("testCsvFile.csv")
pq=Parser_Questionnaire.ParseQuestionnaire(s)
headers=['Form','Name','Question','Type','Value','Condition']
pq.matchColumns(headers)
x=pq.parseBlock(headers,14,2,7)
print x
