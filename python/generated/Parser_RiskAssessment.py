from spreadsheet_parser import *
class ParseRiskAssessment(GenericParserHelper):

	def __init__(self, spreadsheet):
		GenericParserHelper.__init__(self,spreadsheet)

	def matchColumns(self,columnHeaders):
		return columnHeaders==[" Operation, Activity,  Equipment or Component under consideration","Responsible person (Risk identified by)","Aspect Under Consideration","Significant Hazards","Who is at risk ?","Likelihood 1-5","Severity 1-5","Result","Action Required","Mitigation measure taken by Designer.       (1) Remove,     2)Reduce,       (3)Protection, (4)Information","Software","Mechanical/hardware","User manual","Other","Reason why not actioned at higher mitigation / elimination level ?","Residual Likelihood","Residual Severity","Result","Notes to assist recipient in further reducing the residual hazard risk","Standards / legislation","Description by department/contacts"]

	def getColumnHeaders(self):
		return [" Operation, Activity,  Equipment or Component under consideration","Responsible person (Risk identified by)","Aspect Under Consideration","Significant Hazards","Who is at risk ?","Likelihood 1-5","Severity 1-5","Result","Action Required","Mitigation measure taken by Designer.       (1) Remove,     2)Reduce,       (3)Protection, (4)Information","Software","Mechanical/hardware","User manual","Other","Reason why not actioned at higher mitigation / elimination level ?","Residual Likelihood","Residual Severity","Result","Notes to assist recipient in further reducing the residual hazard risk","Standards / legislation","Description by department/contacts"]

	def parseBlock(self,columnHeaders,row,column,height):
		results = []
		relativeRow = 0
		while relativeRow<height:
			increment_and_object = self.parse_RiskAssessment(row+relativeRow,column,row+height)
			results.append(increment_and_object[1])
			relativeRow += increment_and_object[0]
		return results
	
	def parse_RiskAssessment(self,row,column,max_row):
		column_offset = 0
		result_row_increment = 1
		result_object = {}
		# Column opperation
		current_column = column+column_offset
		value_opperation = self.parse_syntax_STRING(self.getCell(row,current_column))
		result_object["opperation"] = value_opperation
		column_offset += 1
		# Column risks
		current_column = column+column_offset
		value_risks = []
		relativeRow = 0
		while True:
			if row+relativeRow>=max_row:
				break
			increment_and_object = self.parse_Risks(row+relativeRow,current_column,max_row)
			relativeRow += increment_and_object[0]
			value_risks.append(increment_and_object[1])
			if not self.emptyCell(row+relativeRow,current_column-1):
				break
		result_row_increment = max(result_row_increment,relativeRow)
		result_object["risks"] = value_risks
		column_offset += 1
		return (result_row_increment,result_object)
	
	def parse_Risks(self,row,column,max_row):
		column_offset = 0
		result_row_increment = 1
		result_object = {}
		# Column responsible
		current_column = column+column_offset
		value_responsible = self.parse_syntax_STRING(self.getCell(row,current_column))
		result_object["responsible"] = value_responsible
		column_offset += 1
		# Column aspect
		current_column = column+column_offset
		if self.emptyCell(row,current_column):
			value_aspect = None
		else:
			value_aspect = self.parse_syntax_STRING(self.getCell(row,current_column))
		result_object["aspect"] = value_aspect
		column_offset += 1
		# Column hazards
		current_column = column+column_offset
		value_hazards = self.parse_syntax_STRING(self.getCell(row,current_column))
		result_object["hazards"] = value_hazards
		column_offset += 1
		# Column risk
		current_column = column+column_offset
		value_risk = self.parse_syntax_STRING(self.getCell(row,current_column))
		result_object["risk"] = value_risk
		column_offset += 1
		# Column likelihood
		current_column = column+column_offset
		value_likelihood = self.parse_syntax_STRING(self.getCell(row,current_column))
		result_object["likelihood"] = value_likelihood
		column_offset += 1
		# Column severity
		current_column = column+column_offset
		value_severity = self.parse_syntax_STRING(self.getCell(row,current_column))
		result_object["severity"] = value_severity
		column_offset += 1
		# Column result
		current_column = column+column_offset
		value_result = self.parse_syntax_STRING(self.getCell(row,current_column))
		result_object["result"] = value_result
		column_offset += 1
		# Column action
		current_column = column+column_offset
		if self.emptyCell(row,current_column):
			value_action = None
		else:
			value_action = self.parse_syntax_STRING(self.getCell(row,current_column))
		result_object["action"] = value_action
		column_offset += 1
		# Column mitigation
		current_column = column+column_offset
		if self.emptyCell(row,current_column):
			value_mitigation = None
		else:
			value_mitigation = self.parse_syntax_STRING(self.getCell(row,current_column))
		result_object["mitigation"] = value_mitigation
		column_offset += 1
		# Column software
		current_column = column+column_offset
		if self.emptyCell(row,current_column):
			value_software = None
		else:
			value_software = self.parse_syntax_STRING(self.getCell(row,current_column))
		result_object["software"] = value_software
		column_offset += 1
		# Column mech_hw
		current_column = column+column_offset
		if self.emptyCell(row,current_column):
			value_mech_hw = None
		else:
			value_mech_hw = self.parse_syntax_STRING(self.getCell(row,current_column))
		result_object["mech_hw"] = value_mech_hw
		column_offset += 1
		# Column manual
		current_column = column+column_offset
		if self.emptyCell(row,current_column):
			value_manual = None
		else:
			value_manual = self.parse_syntax_STRING(self.getCell(row,current_column))
		result_object["manual"] = value_manual
		column_offset += 1
		# Column other
		current_column = column+column_offset
		if self.emptyCell(row,current_column):
			value_other = None
		else:
			value_other = self.parse_syntax_STRING(self.getCell(row,current_column))
		result_object["other"] = value_other
		column_offset += 1
		# Column reason
		current_column = column+column_offset
		if self.emptyCell(row,current_column):
			value_reason = None
		else:
			value_reason = self.parse_syntax_STRING(self.getCell(row,current_column))
		result_object["reason"] = value_reason
		column_offset += 1
		# Column res_likelihood
		current_column = column+column_offset
		if self.emptyCell(row,current_column):
			value_res_likelihood = None
		else:
			value_res_likelihood = self.parse_syntax_STRING(self.getCell(row,current_column))
		result_object["res_likelihood"] = value_res_likelihood
		column_offset += 1
		# Column res_severity
		current_column = column+column_offset
		if self.emptyCell(row,current_column):
			value_res_severity = None
		else:
			value_res_severity = self.parse_syntax_STRING(self.getCell(row,current_column))
		result_object["res_severity"] = value_res_severity
		column_offset += 1
		# Column res_result
		current_column = column+column_offset
		if self.emptyCell(row,current_column):
			value_res_result = None
		else:
			value_res_result = self.parse_syntax_STRING(self.getCell(row,current_column))
		result_object["res_result"] = value_res_result
		column_offset += 1
		# Column notes
		current_column = column+column_offset
		if self.emptyCell(row,current_column):
			value_notes = None
		else:
			value_notes = self.parse_syntax_STRING(self.getCell(row,current_column))
		result_object["notes"] = value_notes
		column_offset += 1
		# Column standards
		current_column = column+column_offset
		if self.emptyCell(row,current_column):
			value_standards = None
		else:
			value_standards = self.parse_syntax_STRING(self.getCell(row,current_column))
		result_object["standards"] = value_standards
		column_offset += 1
		# Column description
		current_column = column+column_offset
		if self.emptyCell(row,current_column):
			value_description = None
		else:
			value_description = self.parse_syntax_STRING(self.getCell(row,current_column))
		result_object["description"] = value_description
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
		object_and_rest = self.parse_syntax_Datatype_85(text)
		if object_and_rest!=None:
			return object_and_rest
		object_and_rest = self.parse_syntax_Datatype_86(text)
		if object_and_rest!=None:
			return object_and_rest
		object_and_rest = self.parse_syntax_Datatype_87(text)
		if object_and_rest!=None:
			return object_and_rest
		return None
	
	def parse_syntax_Datatype_85(self,text):
		current = text
		result = []
		object_and_rest = self.internal_parse_syntax_token("boolean")(current)
		if object_and_rest==None:
			return None
		result.append(object_and_rest[0])
		current = object_and_rest[1]
		return ({"Datatype":result},current)
	
	def parse_syntax_Datatype_86(self,text):
		current = text
		result = []
		object_and_rest = self.internal_parse_syntax_token("money")(current)
		if object_and_rest==None:
			return None
		result.append(object_and_rest[0])
		current = object_and_rest[1]
		return ({"Datatype":result},current)
	
	def parse_syntax_Datatype_87(self,text):
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
		object_and_rest = self.parse_syntax_AExp_88(text)
		if object_and_rest!=None:
			return object_and_rest
		object_and_rest = self.parse_syntax_AExp_89(text)
		if object_and_rest!=None:
			return object_and_rest
		object_and_rest = self.parse_syntax_AExp_90(text)
		if object_and_rest!=None:
			return object_and_rest
		object_and_rest = self.parse_syntax_AExp_91(text)
		if object_and_rest!=None:
			return object_and_rest
		return None
	
	def parse_syntax_AExp_88(self,text):
		current = text
		result = []
		object_and_rest = self.internal_parse_syntax_Add(current)
		if object_and_rest==None:
			return None
		result.append(object_and_rest[0])
		current = object_and_rest[1]
		return ({"AExp":result},current)
	
	def parse_syntax_AExp_89(self,text):
		current = text
		result = []
		object_and_rest = self.internal_parse_syntax_Sub(current)
		if object_and_rest==None:
			return None
		result.append(object_and_rest[0])
		current = object_and_rest[1]
		return ({"AExp":result},current)
	
	def parse_syntax_AExp_90(self,text):
		current = text
		result = []
		object_and_rest = self.internal_parse_syntax_INTEGER(current)
		if object_and_rest==None:
			return None
		result.append(object_and_rest[0])
		current = object_and_rest[1]
		return ({"AExp":result},current)
	
	def parse_syntax_AExp_91(self,text):
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
		object_and_rest = self.parse_syntax_Add_92(text)
		if object_and_rest!=None:
			return object_and_rest
		return None
	
	def parse_syntax_Add_92(self,text):
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
		object_and_rest = self.parse_syntax_Sub_93(text)
		if object_and_rest!=None:
			return object_and_rest
		return None
	
	def parse_syntax_Sub_93(self,text):
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
		object_and_rest = self.parse_syntax_BExp_94(text)
		if object_and_rest!=None:
			return object_and_rest
		object_and_rest = self.parse_syntax_BExp_95(text)
		if object_and_rest!=None:
			return object_and_rest
		object_and_rest = self.parse_syntax_BExp_96(text)
		if object_and_rest!=None:
			return object_and_rest
		return None
	
	def parse_syntax_BExp_94(self,text):
		current = text
		result = []
		object_and_rest = self.internal_parse_syntax_And(current)
		if object_and_rest==None:
			return None
		result.append(object_and_rest[0])
		current = object_and_rest[1]
		return ({"BExp":result},current)
	
	def parse_syntax_BExp_95(self,text):
		current = text
		result = []
		object_and_rest = self.internal_parse_syntax_Or(current)
		if object_and_rest==None:
			return None
		result.append(object_and_rest[0])
		current = object_and_rest[1]
		return ({"BExp":result},current)
	
	def parse_syntax_BExp_96(self,text):
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
		object_and_rest = self.parse_syntax_And_97(text)
		if object_and_rest!=None:
			return object_and_rest
		return None
	
	def parse_syntax_And_97(self,text):
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
		object_and_rest = self.parse_syntax_Or_98(text)
		if object_and_rest!=None:
			return object_and_rest
		return None
	
	def parse_syntax_Or_98(self,text):
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
