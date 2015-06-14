from spreadsheet_parser import *
class ParseLogicTable(GenericParserHelper):

	def __init__(self, spreadsheet):
		GenericParserHelper.__init__(self,spreadsheet)

	def matchColumns(self,columnHeaders):
		return columnHeaders==["Use case #","Manual","Learn","Auto","E-stop","Bumpers & arm switch","Far obstacle","Close obstacle","Keep alive","Reverse","Forward","Stop","Green","Yellow","Red","Beep","Arm power","Decompress","State","Use case description"]

	def getColumnHeaders(self):
		return ["Use case #","Manual","Learn","Auto","E-stop","Bumpers & arm switch","Far obstacle","Close obstacle","Keep alive","Reverse","Forward","Stop","Green","Yellow","Red","Beep","Arm power","Decompress","State","Use case description"]

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
		# Column case
		current_column = column+column_offset
		value_case = self.parse_syntax_STRING(self.getCell(row,current_column))
		result_object["case"] = value_case
		column_offset += 1
		# Column table
		current_column = column+column_offset
		value_table = []
		relativeRow = 0
		while True:
			if row+relativeRow>=max_row:
				break
			increment_and_object = self.parse_Table(row+relativeRow,current_column,max_row)
			relativeRow += increment_and_object[0]
			value_table.append(increment_and_object[1])
			if not self.emptyCell(row+relativeRow,current_column-1):
				break
		result_row_increment = max(result_row_increment,relativeRow)
		result_object["table"] = value_table
		column_offset += 1
		return (result_row_increment,result_object)
	
	def parse_Table(self,row,column,max_row):
		column_offset = 0
		result_row_increment = 1
		result_object = {}
		# Column manual
		current_column = column+column_offset
		value_manual = self.parse_syntax_Bool(self.getCell(row,current_column))
		result_object["manual"] = value_manual
		column_offset += 1
		# Column learn
		current_column = column+column_offset
		value_learn = self.parse_syntax_Bool(self.getCell(row,current_column))
		result_object["learn"] = value_learn
		column_offset += 1
		# Column auto
		current_column = column+column_offset
		value_auto = self.parse_syntax_Bool(self.getCell(row,current_column))
		result_object["auto"] = value_auto
		column_offset += 1
		# Column e_stop
		current_column = column+column_offset
		value_e_stop = self.parse_syntax_BoolAny(self.getCell(row,current_column))
		result_object["e_stop"] = value_e_stop
		column_offset += 1
		# Column bump_arm
		current_column = column+column_offset
		value_bump_arm = self.parse_syntax_BoolAny(self.getCell(row,current_column))
		result_object["bump_arm"] = value_bump_arm
		column_offset += 1
		# Column far
		current_column = column+column_offset
		value_far = self.parse_syntax_BoolAny(self.getCell(row,current_column))
		result_object["far"] = value_far
		column_offset += 1
		# Column close
		current_column = column+column_offset
		value_close = self.parse_syntax_BoolAny(self.getCell(row,current_column))
		result_object["close"] = value_close
		column_offset += 1
		# Column keep_alive
		current_column = column+column_offset
		value_keep_alive = self.parse_syntax_BoolAny(self.getCell(row,current_column))
		result_object["keep_alive"] = value_keep_alive
		column_offset += 1
		# Column reverse
		current_column = column+column_offset
		value_reverse = self.parse_syntax_BoolAny(self.getCell(row,current_column))
		result_object["reverse"] = value_reverse
		column_offset += 1
		# Column forward
		current_column = column+column_offset
		value_forward = self.parse_syntax_BoolAny(self.getCell(row,current_column))
		result_object["forward"] = value_forward
		column_offset += 1
		# Column stop
		current_column = column+column_offset
		value_stop = self.parse_syntax_BoolAny(self.getCell(row,current_column))
		result_object["stop"] = value_stop
		column_offset += 1
		# Column green
		current_column = column+column_offset
		value_green = self.parse_syntax_BoolBlink(self.getCell(row,current_column))
		result_object["green"] = value_green
		column_offset += 1
		# Column yellow
		current_column = column+column_offset
		value_yellow = self.parse_syntax_BoolBlink(self.getCell(row,current_column))
		result_object["yellow"] = value_yellow
		column_offset += 1
		# Column red
		current_column = column+column_offset
		value_red = self.parse_syntax_BoolBlink(self.getCell(row,current_column))
		result_object["red"] = value_red
		column_offset += 1
		# Column beep
		current_column = column+column_offset
		value_beep = self.parse_syntax_BoolBlink(self.getCell(row,current_column))
		result_object["beep"] = value_beep
		column_offset += 1
		# Column arm_power
		current_column = column+column_offset
		value_arm_power = self.parse_syntax_Bool(self.getCell(row,current_column))
		result_object["arm_power"] = value_arm_power
		column_offset += 1
		# Column decompress
		current_column = column+column_offset
		value_decompress = self.parse_syntax_Bool(self.getCell(row,current_column))
		result_object["decompress"] = value_decompress
		column_offset += 1
		# Column state
		current_column = column+column_offset
		if self.emptyCell(row,current_column):
			value_state = None
		else:
			value_state = self.parse_syntax_STRING(self.getCell(row,current_column))
		result_object["state"] = value_state
		column_offset += 1
		# Column use_case
		current_column = column+column_offset
		value_use_case = self.parse_syntax_STRING(self.getCell(row,current_column))
		result_object["use_case"] = value_use_case
		column_offset += 1
		return (result_row_increment,result_object)
	
	def parse_syntax_Bool(self,text):
		object_and_rest = self.internal_parse_syntax_Bool(text)
		if object_and_rest==None:
			raise Exception("Failed parsing as Bool, text: "+text)
		rest_maybe = object_and_rest[1].lstrip()
		if len(rest_maybe)>0:
			raise Exception("Surplus text when parsing Bool, text: "+rest_maybe)
		return object_and_rest[0]
	
	def internal_parse_syntax_Bool(self,text):
		object_and_rest = self.parse_syntax_Bool_319(text)
		if object_and_rest!=None:
			return object_and_rest
		object_and_rest = self.parse_syntax_Bool_320(text)
		if object_and_rest!=None:
			return object_and_rest
		return None
	
	def parse_syntax_Bool_319(self,text):
		current = text
		result = []
		object_and_rest = self.internal_parse_syntax_token("0")(current)
		if object_and_rest==None:
			return None
		result.append(object_and_rest[0])
		current = object_and_rest[1]
		return ({"Bool":result},current)
	
	def parse_syntax_Bool_320(self,text):
		current = text
		result = []
		object_and_rest = self.internal_parse_syntax_token("1")(current)
		if object_and_rest==None:
			return None
		result.append(object_and_rest[0])
		current = object_and_rest[1]
		return ({"Bool":result},current)
	
	def parse_syntax_BoolAny(self,text):
		object_and_rest = self.internal_parse_syntax_BoolAny(text)
		if object_and_rest==None:
			raise Exception("Failed parsing as BoolAny, text: "+text)
		rest_maybe = object_and_rest[1].lstrip()
		if len(rest_maybe)>0:
			raise Exception("Surplus text when parsing BoolAny, text: "+rest_maybe)
		return object_and_rest[0]
	
	def internal_parse_syntax_BoolAny(self,text):
		object_and_rest = self.parse_syntax_BoolAny_321(text)
		if object_and_rest!=None:
			return object_and_rest
		return None
	
	def parse_syntax_BoolAny_321(self,text):
		current = text
		result = []
		object_and_rest = self.internal_parse_syntax_STRING(current)
		if object_and_rest==None:
			return None
		result.append(object_and_rest[0])
		current = object_and_rest[1]
		return ({"BoolAny":result},current)
	
	def parse_syntax_BoolBlink(self,text):
		object_and_rest = self.internal_parse_syntax_BoolBlink(text)
		if object_and_rest==None:
			raise Exception("Failed parsing as BoolBlink, text: "+text)
		rest_maybe = object_and_rest[1].lstrip()
		if len(rest_maybe)>0:
			raise Exception("Surplus text when parsing BoolBlink, text: "+rest_maybe)
		return object_and_rest[0]
	
	def internal_parse_syntax_BoolBlink(self,text):
		object_and_rest = self.parse_syntax_BoolBlink_322(text)
		if object_and_rest!=None:
			return object_and_rest
		object_and_rest = self.parse_syntax_BoolBlink_323(text)
		if object_and_rest!=None:
			return object_and_rest
		object_and_rest = self.parse_syntax_BoolBlink_324(text)
		if object_and_rest!=None:
			return object_and_rest
		return None
	
	def parse_syntax_BoolBlink_322(self,text):
		current = text
		result = []
		object_and_rest = self.internal_parse_syntax_token("1s")(current)
		if object_and_rest==None:
			return None
		result.append(object_and_rest[0])
		current = object_and_rest[1]
		return ({"BoolBlink":result},current)
	
	def parse_syntax_BoolBlink_323(self,text):
		current = text
		result = []
		object_and_rest = self.internal_parse_syntax_token(".5s")(current)
		if object_and_rest==None:
			return None
		result.append(object_and_rest[0])
		current = object_and_rest[1]
		return ({"BoolBlink":result},current)
	
	def parse_syntax_BoolBlink_324(self,text):
		current = text
		result = []
		object_and_rest = self.internal_parse_syntax_Bool(current)
		if object_and_rest==None:
			return None
		result.append(object_and_rest[0])
		current = object_and_rest[1]
		return ({"BoolBlink":result},current)
