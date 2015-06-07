'''
Created on Jun 7, 2015

@author: ups
'''

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
        return columnHeaders==["Form","Name","Question","Type","Value","Condition"]
    
    def parseBlock(self,columnHeaders,row,column,width,height):
        return None # column headers not included in block, returns list of objects extracted from spreadsheet, or None if parse err
