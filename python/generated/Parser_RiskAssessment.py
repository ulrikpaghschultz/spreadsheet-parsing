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
		value_likelihood = self.parse_syntax_number(self.getCell(row,current_column))
		result_object["likelihood"] = value_likelihood
		column_offset += 1
		# Column severity
		current_column = column+column_offset
		value_severity = self.parse_syntax_number(self.getCell(row,current_column))
		result_object["severity"] = value_severity
		column_offset += 1
		# Column result
		current_column = column+column_offset
		value_result = self.parse_syntax_number(self.getCell(row,current_column))
		result_object["result"] = value_result
		column_offset += 1
		# Column action
		current_column = column+column_offset
		if self.emptyCell(row,current_column):
			value_action = None
		else:
			value_action = self.parse_syntax_yes_no(self.getCell(row,current_column))
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
			value_res_likelihood = self.parse_syntax_number(self.getCell(row,current_column))
		result_object["res_likelihood"] = value_res_likelihood
		column_offset += 1
		# Column res_severity
		current_column = column+column_offset
		if self.emptyCell(row,current_column):
			value_res_severity = None
		else:
			value_res_severity = self.parse_syntax_number(self.getCell(row,current_column))
		result_object["res_severity"] = value_res_severity
		column_offset += 1
		# Column res_result
		current_column = column+column_offset
		if self.emptyCell(row,current_column):
			value_res_result = None
		else:
			value_res_result = self.parse_syntax_number(self.getCell(row,current_column))
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
	
	def parse_syntax_number(self,text):
		object_and_rest = self.internal_parse_syntax_number(text)
		if object_and_rest==None:
			raise Exception("Failed parsing as number, text: "+text)
		rest_maybe = object_and_rest[1].lstrip()
		if len(rest_maybe)>0:
			raise Exception("Surplus text when parsing number, text: "+rest_maybe)
		return object_and_rest[0]
	
	def internal_parse_syntax_number(self,text):
		object_and_rest = self.parse_syntax_number_114(text)
		if object_and_rest!=None:
			return object_and_rest
		return None
	
	def parse_syntax_number_114(self,text):
		current = text
		result = []
		object_and_rest = self.internal_parse_syntax_INTEGER(current)
		if object_and_rest==None:
			return None
		result.append(object_and_rest[0])
		current = object_and_rest[1]
		return ({"number":result},current)
	
	def parse_syntax_yes_no(self,text):
		object_and_rest = self.internal_parse_syntax_yes_no(text)
		if object_and_rest==None:
			raise Exception("Failed parsing as yes_no, text: "+text)
		rest_maybe = object_and_rest[1].lstrip()
		if len(rest_maybe)>0:
			raise Exception("Surplus text when parsing yes_no, text: "+rest_maybe)
		return object_and_rest[0]
	
	def internal_parse_syntax_yes_no(self,text):
		object_and_rest = self.parse_syntax_yes_no_115(text)
		if object_and_rest!=None:
			return object_and_rest
		object_and_rest = self.parse_syntax_yes_no_116(text)
		if object_and_rest!=None:
			return object_and_rest
		return None
	
	def parse_syntax_yes_no_115(self,text):
		current = text
		result = []
		object_and_rest = self.internal_parse_syntax_token("yes")(current)
		if object_and_rest==None:
			return None
		result.append(object_and_rest[0])
		current = object_and_rest[1]
		return ({"yes_no":result},current)
	
	def parse_syntax_yes_no_116(self,text):
		current = text
		result = []
		object_and_rest = self.internal_parse_syntax_token("no")(current)
		if object_and_rest==None:
			return None
		result.append(object_and_rest[0])
		current = object_and_rest[1]
		return ({"yes_no":result},current)
