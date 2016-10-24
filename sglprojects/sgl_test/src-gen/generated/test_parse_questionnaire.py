import frontend
import Parser_Questionnaire
s=frontend.read("paperExamples.csv")
p=Parser_Questionnaire.ParseQuestionnaire(s)
print frontend.parse(p)
