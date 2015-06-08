import sys
sys.path.insert(0,'../generated')

import SpreadParse
import Parser_Questionnaire
s=SpreadParse.Spreadsheet()
s.InitFromFile("testCsvFile.csv")
s.Print
pq=Parser_Questionnaire.ParseQuestionnaire(s)
headers = pq.getColumnHeaders()
#print pq.matchColumns(headers)

start_row,start_col, depth =s.FindBlockAndDepth(headers)
print start_row,start_col, depth

#x=pq.parseBlock(headers,14,2,7)
x=pq.parseBlock(headers,start_row,start_col, depth)
print x




