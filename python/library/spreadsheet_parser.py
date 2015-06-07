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
        value = self.spreadsheet.objCells[row][column].data
        if value==None:
            raise Exception("None value not exprected when reading cell "+str(row)+","+str(column))
        return value
    def emptyCell(self,row,column):
        return self.spreadsheet.objCells[row][column].isEmpty()
    def parse_syntax_IDENTIFIER(self,text):
        result = self.internal_parse_syntax_IDENTIFIER(text)
        if result!=None and len(result[1])==0:
            return result[0]
        raise Exception('parse error: illegal identifier '+text)
    def parse_syntax_STRING(self,text):
        return self.internal_parse_syntax_STRING(text)[0]
    def parse_syntax_INTEGER(self,text):
        result = self.internal_parse_syntax_INTEGER(text)[0]
        if result!=None:
            return result[0]
        raise Exception('parse error: illegal integer '+text)
    def parse_syntax_token(self,token):
        return lambda text: self.parse_syntax_token_helper(token,text)
    def parse_syntax_token_helper(self,token,string):
        result = self.internal_parse_syntax_token(token)
        if result!=None:
            return result[0]
        raise Exception('parse error: expected token '+token+' but got '+string)
    def internal_parse_syntax_IDENTIFIER(self,text):
        m=self.regexp_parse_identifier.match(text)
        if m:
            value=m.group(0)
            return ({'IDENTIFIER':value},text[len(value):])
        return None
    def internal_parse_syntax_STRING(self,text):
        return ({'STRING':text},'')
    def internal_parse_syntax_INTEGER(self,text):
        try:
            return ({'INTEGER':int(text)},'')
        except ValueError:
            return None
    def internal_parse_syntax_token(self,token):
        return lambda text: self.internal_parse_syntax_token_helper(token,text)
    def internal_parse_syntax_token_helper(self,token,string):
        text = string.lstrip()
        if text.startswith(token):
            return ({'TOKEN':token},text[len(token):])
        return None

        
