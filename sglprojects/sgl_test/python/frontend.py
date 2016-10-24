import SpreadParse

def read(file):
    s=SpreadParse.Spreadsheet()
    s.InitFromFile(file)
    return s

def parse(parser):
    headers = parser.getColumnHeaders()
    start_row,start_col,depth = parser.spreadsheet.FindBlockAndDepth(headers)
    return parser.parseBlock(headers, start_row, start_col, depth)
