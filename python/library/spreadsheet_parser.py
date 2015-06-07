'''
Created on Jun 7, 2015

@author: ups
'''
import re
class GenericParserHelper(object):
    '''
    classdocs
    '''
    regexp_parse_identifier = re.compile('[A-Za-z_][A-Za-z_0-9]*')
    def __init__(self, spreadsheet):
        self.spreadsheet = spreadsheet
    def getCell(self,row,column):
        return self.spreadsheet.objCells[row][column].data
    def emptyCell(self,row,column):
        return self.spreadsheet.objCells[row][column].isEmpty()
    def parse_syntax_IDENTIFIER(self,text):
        if self.regexp_parse_identifier.match(text):
            return text
        raise Exception('parse error: illegal identifier '+text)
    def parse_syntax_STRING(self,text):
        return text
    def parse_syntax_INTEGER(self,text):
        return int(text)
    def parse_syntax_token(self,string):
        return lambda text: (text if text==string else self.signalTokenError(string,text))
    def signalTokenError(self,string,text):
        raise Exception('parse error: expected token '+string+' but got '+text)
