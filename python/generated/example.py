'''
Created on Jun 7, 2015

@author: ups
'''
import re

regexp_parse_identifier = re.compile('[A-Za-z_][A-Za-z_0-9]*')
def parse_identifier(cell):
    if regexp_parse_identifier.match(cell):
        return cell
    raise Exception('parse error: illegal identifier '+cell)

def parse_string(cell):
    return cell


class ExampleParser(object):
    '''
    example of code that would be generated
    '''

    def __init__(self, spreadsheet):
        '''
        Constructor
        '''
        self.spreadsheet = spreadsheet

    def matchColumns(self,columnHeaders):
        '''Generated API: can be used for scanning the spreadsheet to find columns that identify blocks that can be parsed by the object'''
        return columnHeaders==["Form","Name","Question","Type","Value","Condition"]
    
    def parseBlock(self,columnHeaders,row,column,height):
        '''Generated API: parses data at a given point, provided the list of inherited column headers'''
        results = []
        relativeRow = 0
        while relativeRow<height:
            increment_and_object = self.parseObject(row+relativeRow,column,columnHeaders)
            results.append(increment_and_object[1])
            relativeRow += increment_and_object[0]
        return results
    

    def parseObject(self,row,column,headers):
        value_Form_name = parse_identifier(self.spreadsheet.cell(row,column))
        value_Form_questions = []
        relativeRow = 0
        while True:
            value_Form_questions.append(self.parseObject_question(row+relativeRow,column+1))
            relativeRow += 1
            if not self.spreadsheet.empty(row+relativeRow,column):
                break
        return (relativeRow,{"name": value_Form_name, "questions": value_Form_questions})
    
    def parseObject_question(self, row, column):
        value_Question_name = parse_identifier(self.spreadsheet.cell(row,column))
        value_Question_question = parse_string(self.spreadhseet.cell(row,column+1))
        return {"name": value_Question_name, "question": value_Question_question}
    
    
