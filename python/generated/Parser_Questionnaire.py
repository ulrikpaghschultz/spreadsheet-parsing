from spreadsheet_parser import *
class ParseQuestionnaire(GenericParserHelper):

	def __init__(self, spreadsheet):
		GenericParserHelper.__init__(self,spreadsheet)

	def matchColumns(self,columnHeaders):
		return columnHeaders==["Form","Name","Question","Type","Value","Condition"]

	def parseBlock(self,columnHeaders,row,column,height):
		results = []
		relativeRow = 0
		while relativeRow<height:
			increment_and_object = self.parse_Forms(row+relativeRow,column,row+height)
			results.append(increment_and_object[1])
			relativeRow += increment_and_object[0]
		return results
	
	def parse_Forms(self,row,column,max_row):
		column_offset = 0
		result_row_increment = 1
		result_object = {}
		# Column name
		current_column = column+column_offset
		value_name = self.parse_syntax_IDENTIFIER(self.getCell(row,current_column))
		result_object["name"] = value_name
		column_offset += 1
		# Column questions
		current_column = column+column_offset
		value_questions = []
		relativeRow = 0
		while True:
			if row+relativeRow>=max_row:
				break
			increment_and_object = self.parse_Question(row+relativeRow,current_column,max_row)
			relativeRow += increment_and_object[0]
			value_questions.append(increment_and_object[1])
			if not self.emptyCell(row+relativeRow,current_column-1):
				break
		result_row_increment = max(result_row_increment,relativeRow)
		result_object["questions"] = value_questions
		column_offset += 1
		return (result_row_increment,result_object)
	
	def parse_Question(self,row,column,max_row):
		column_offset = 0
		result_row_increment = 1
		result_object = {}
		# Column name
		current_column = column+column_offset
		value_name = self.parse_syntax_IDENTIFIER(self.getCell(row,current_column))
		result_object["name"] = value_name
		column_offset += 1
		# Column question
		current_column = column+column_offset
		value_question = self.parse_syntax_STRING(self.getCell(row,current_column))
		result_object["question"] = value_question
		column_offset += 1
		# Column type
		current_column = column+column_offset
		value_type = self.parse_syntax_Datatype(self.getCell(row,current_column))
		result_object["type"] = value_type
		column_offset += 1
		# Column value
		current_column = column+column_offset
		if self.emptyCell(row,current_column):
			value_value = None
		else:
			value_value = self.parse_syntax_AExp(self.getCell(row,current_column))
		result_object["value"] = value_value
		column_offset += 1
		# Column condition
		current_column = column+column_offset
		if self.emptyCell(row,current_column):
			value_condition = None
		else:
			value_condition = self.parse_syntax_BExp(self.getCell(row,current_column))
		result_object["condition"] = value_condition
		column_offset += 1
		return (result_row_increment,result_object)
	
	def parse_syntax_Datatype(self,text):
		object_and_rest = self.internal_parse_syntax_Datatype(text)
		if object_and_rest==None:
			raise Exception("Failed parsing as Datatype, text: "+text)
		rest_maybe = object_and_rest[1].lstrip()
		if len(rest_maybe)>0:
			raise Exception("Surplus text when parsing Datatype, text: "+rest_maybe)
		return object_and_rest[0]
	
	def internal_parse_syntax_Datatype(self,text):
		object_and_rest = self.parse_syntax_Datatype_0(text)
		if object_and_rest!=None:
			return object_and_rest
		object_and_rest = self.parse_syntax_Datatype_1(text)
		if object_and_rest!=None:
			return object_and_rest
		object_and_rest = self.parse_syntax_Datatype_2(text)
		if object_and_rest!=None:
			return object_and_rest
		return None
	
	def parse_syntax_Datatype_0(self,text):
		current = text
		result = []
		object_and_rest = self.internal_parse_syntax_token("boolean")(current)
		if object_and_rest==None:
			return None
		result.append(object_and_rest[0])
		current = object_and_rest[1]
		return ({"Datatype":result},current)
	
	def parse_syntax_Datatype_1(self,text):
		current = text
		result = []
		object_and_rest = self.internal_parse_syntax_token("money")(current)
		if object_and_rest==None:
			return None
		result.append(object_and_rest[0])
		current = object_and_rest[1]
		return ({"Datatype":result},current)
	
	def parse_syntax_Datatype_2(self,text):
		current = text
		result = []
		object_and_rest = self.internal_parse_syntax_token("int")(current)
		if object_and_rest==None:
			return None
		result.append(object_and_rest[0])
		current = object_and_rest[1]
		return ({"Datatype":result},current)
	
	def parse_syntax_AExp(self,text):
		object_and_rest = self.internal_parse_syntax_AExp(text)
		if object_and_rest==None:
			raise Exception("Failed parsing as AExp, text: "+text)
		rest_maybe = object_and_rest[1].lstrip()
		if len(rest_maybe)>0:
			raise Exception("Surplus text when parsing AExp, text: "+rest_maybe)
		return object_and_rest[0]
	
	def internal_parse_syntax_AExp(self,text):
		object_and_rest = self.parse_syntax_AExp_3(text)
		if object_and_rest!=None:
			return object_and_rest
		object_and_rest = self.parse_syntax_AExp_4(text)
		if object_and_rest!=None:
			return object_and_rest
		object_and_rest = self.parse_syntax_AExp_5(text)
		if object_and_rest!=None:
			return object_and_rest
		object_and_rest = self.parse_syntax_AExp_6(text)
		if object_and_rest!=None:
			return object_and_rest
		return None
	
	def parse_syntax_AExp_3(self,text):
		current = text
		result = []
		object_and_rest = self.internal_parse_syntax_Add(current)
		if object_and_rest==None:
			return None
		result.append(object_and_rest[0])
		current = object_and_rest[1]
		return ({"AExp":result},current)
	
	def parse_syntax_AExp_4(self,text):
		current = text
		result = []
		object_and_rest = self.internal_parse_syntax_Sub(current)
		if object_and_rest==None:
			return None
		result.append(object_and_rest[0])
		current = object_and_rest[1]
		return ({"AExp":result},current)
	
	def parse_syntax_AExp_5(self,text):
		current = text
		result = []
		object_and_rest = self.internal_parse_syntax_INTEGER(current)
		if object_and_rest==None:
			return None
		result.append(object_and_rest[0])
		current = object_and_rest[1]
		return ({"AExp":result},current)
	
	def parse_syntax_AExp_6(self,text):
		current = text
		result = []
		object_and_rest = self.internal_parse_syntax_IDENTIFIER(current)
		if object_and_rest==None:
			return None
		result.append(object_and_rest[0])
		current = object_and_rest[1]
		return ({"AExp":result},current)
	
	def parse_syntax_Add(self,text):
		object_and_rest = self.internal_parse_syntax_Add(text)
		if object_and_rest==None:
			raise Exception("Failed parsing as Add, text: "+text)
		rest_maybe = object_and_rest[1].lstrip()
		if len(rest_maybe)>0:
			raise Exception("Surplus text when parsing Add, text: "+rest_maybe)
		return object_and_rest[0]
	
	def internal_parse_syntax_Add(self,text):
		object_and_rest = self.parse_syntax_Add_7(text)
		if object_and_rest!=None:
			return object_and_rest
		return None
	
	def parse_syntax_Add_7(self,text):
		current = text
		result = []
		object_and_rest = self.internal_parse_syntax_token("(")(current)
		if object_and_rest==None:
			return None
		result.append(object_and_rest[0])
		current = object_and_rest[1]
		object_and_rest = self.internal_parse_syntax_AExp(current)
		if object_and_rest==None:
			return None
		result.append(object_and_rest[0])
		current = object_and_rest[1]
		object_and_rest = self.internal_parse_syntax_token("+")(current)
		if object_and_rest==None:
			return None
		result.append(object_and_rest[0])
		current = object_and_rest[1]
		object_and_rest = self.internal_parse_syntax_AExp(current)
		if object_and_rest==None:
			return None
		result.append(object_and_rest[0])
		current = object_and_rest[1]
		object_and_rest = self.internal_parse_syntax_token(")")(current)
		if object_and_rest==None:
			return None
		result.append(object_and_rest[0])
		current = object_and_rest[1]
		return ({"Add":result},current)
	
	def parse_syntax_Sub(self,text):
		object_and_rest = self.internal_parse_syntax_Sub(text)
		if object_and_rest==None:
			raise Exception("Failed parsing as Sub, text: "+text)
		rest_maybe = object_and_rest[1].lstrip()
		if len(rest_maybe)>0:
			raise Exception("Surplus text when parsing Sub, text: "+rest_maybe)
		return object_and_rest[0]
	
	def internal_parse_syntax_Sub(self,text):
		object_and_rest = self.parse_syntax_Sub_8(text)
		if object_and_rest!=None:
			return object_and_rest
		return None
	
	def parse_syntax_Sub_8(self,text):
		current = text
		result = []
		object_and_rest = self.internal_parse_syntax_token("(")(current)
		if object_and_rest==None:
			return None
		result.append(object_and_rest[0])
		current = object_and_rest[1]
		object_and_rest = self.internal_parse_syntax_AExp(current)
		if object_and_rest==None:
			return None
		result.append(object_and_rest[0])
		current = object_and_rest[1]
		object_and_rest = self.internal_parse_syntax_token("-")(current)
		if object_and_rest==None:
			return None
		result.append(object_and_rest[0])
		current = object_and_rest[1]
		object_and_rest = self.internal_parse_syntax_AExp(current)
		if object_and_rest==None:
			return None
		result.append(object_and_rest[0])
		current = object_and_rest[1]
		object_and_rest = self.internal_parse_syntax_token(")")(current)
		if object_and_rest==None:
			return None
		result.append(object_and_rest[0])
		current = object_and_rest[1]
		return ({"Sub":result},current)
	
	def parse_syntax_BExp(self,text):
		object_and_rest = self.internal_parse_syntax_BExp(text)
		if object_and_rest==None:
			raise Exception("Failed parsing as BExp, text: "+text)
		rest_maybe = object_and_rest[1].lstrip()
		if len(rest_maybe)>0:
			raise Exception("Surplus text when parsing BExp, text: "+rest_maybe)
		return object_and_rest[0]
	
	def internal_parse_syntax_BExp(self,text):
		object_and_rest = self.parse_syntax_BExp_9(text)
		if object_and_rest!=None:
			return object_and_rest
		object_and_rest = self.parse_syntax_BExp_10(text)
		if object_and_rest!=None:
			return object_and_rest
		object_and_rest = self.parse_syntax_BExp_11(text)
		if object_and_rest!=None:
			return object_and_rest
		return None
	
	def parse_syntax_BExp_9(self,text):
		current = text
		result = []
		object_and_rest = self.internal_parse_syntax_And(current)
		if object_and_rest==None:
			return None
		result.append(object_and_rest[0])
		current = object_and_rest[1]
		return ({"BExp":result},current)
	
	def parse_syntax_BExp_10(self,text):
		current = text
		result = []
		object_and_rest = self.internal_parse_syntax_Or(current)
		if object_and_rest==None:
			return None
		result.append(object_and_rest[0])
		current = object_and_rest[1]
		return ({"BExp":result},current)
	
	def parse_syntax_BExp_11(self,text):
		current = text
		result = []
		object_and_rest = self.internal_parse_syntax_IDENTIFIER(current)
		if object_and_rest==None:
			return None
		result.append(object_and_rest[0])
		current = object_and_rest[1]
		return ({"BExp":result},current)
	
	def parse_syntax_And(self,text):
		object_and_rest = self.internal_parse_syntax_And(text)
		if object_and_rest==None:
			raise Exception("Failed parsing as And, text: "+text)
		rest_maybe = object_and_rest[1].lstrip()
		if len(rest_maybe)>0:
			raise Exception("Surplus text when parsing And, text: "+rest_maybe)
		return object_and_rest[0]
	
	def internal_parse_syntax_And(self,text):
		object_and_rest = self.parse_syntax_And_12(text)
		if object_and_rest!=None:
			return object_and_rest
		return None
	
	def parse_syntax_And_12(self,text):
		current = text
		result = []
		object_and_rest = self.internal_parse_syntax_token("(")(current)
		if object_and_rest==None:
			return None
		result.append(object_and_rest[0])
		current = object_and_rest[1]
		object_and_rest = self.internal_parse_syntax_BExp(current)
		if object_and_rest==None:
			return None
		result.append(object_and_rest[0])
		current = object_and_rest[1]
		object_and_rest = self.internal_parse_syntax_token("and")(current)
		if object_and_rest==None:
			return None
		result.append(object_and_rest[0])
		current = object_and_rest[1]
		object_and_rest = self.internal_parse_syntax_BExp(current)
		if object_and_rest==None:
			return None
		result.append(object_and_rest[0])
		current = object_and_rest[1]
		object_and_rest = self.internal_parse_syntax_token(")")(current)
		if object_and_rest==None:
			return None
		result.append(object_and_rest[0])
		current = object_and_rest[1]
		return ({"And":result},current)
	
	def parse_syntax_Or(self,text):
		object_and_rest = self.internal_parse_syntax_Or(text)
		if object_and_rest==None:
			raise Exception("Failed parsing as Or, text: "+text)
		rest_maybe = object_and_rest[1].lstrip()
		if len(rest_maybe)>0:
			raise Exception("Surplus text when parsing Or, text: "+rest_maybe)
		return object_and_rest[0]
	
	def internal_parse_syntax_Or(self,text):
		object_and_rest = self.parse_syntax_Or_13(text)
		if object_and_rest!=None:
			return object_and_rest
		return None
	
	def parse_syntax_Or_13(self,text):
		current = text
		result = []
		object_and_rest = self.internal_parse_syntax_token("(")(current)
		if object_and_rest==None:
			return None
		result.append(object_and_rest[0])
		current = object_and_rest[1]
		object_and_rest = self.internal_parse_syntax_BExp(current)
		if object_and_rest==None:
			return None
		result.append(object_and_rest[0])
		current = object_and_rest[1]
		object_and_rest = self.internal_parse_syntax_token("or")(current)
		if object_and_rest==None:
			return None
		result.append(object_and_rest[0])
		current = object_and_rest[1]
		object_and_rest = self.internal_parse_syntax_BExp(current)
		if object_and_rest==None:
			return None
		result.append(object_and_rest[0])
		current = object_and_rest[1]
		object_and_rest = self.internal_parse_syntax_token(")")(current)
		if object_and_rest==None:
			return None
		result.append(object_and_rest[0])
		current = object_and_rest[1]
		return ({"Or":result},current)
