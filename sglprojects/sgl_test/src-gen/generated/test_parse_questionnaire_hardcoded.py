import SpreadParse
import Parser_Questionnaire
s=SpreadParse.Spreadsheet()
s.InitFromFile("paperExamples.csv")
pq=Parser_Questionnaire.ParseQuestionnaire(s)
headers=['Form','Name','Question','Type','Value','Condition']
pq.matchColumns(headers)
#for row in range(7,15):
#    for col in range(14,20):
#        print "cell",row,col,s.objCells[row][col].data
#pq.setDebugTrace(True)
x=pq.parseBlock(headers,8,14,6)
print "Result:",x
print "Result[0].name",x[0]["name"]
