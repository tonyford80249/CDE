
/*
 * Copyright ResQSoft, Inc. 2011
 */
package com.cdoe.ui.validator;

import org.apache.log4j.Logger;

import com.resqsoft.util.StringUtils;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.cdoe.ui.form.TransportationForm;

public class Cde40TransFormValidator implements Validator {

	private static final Logger logger = Logger.getLogger(Cde40TransFormValidator.class);
	
	@Override
	public boolean supports(Class clazz) {
		return false;
	}

	@Override
	public void validate(Object target, Errors errors) {
		TransportationForm form = (TransportationForm) target;
		
		if (form.getNamePreparerCde40() == null || "".equals(form.getNamePreparerCde40())) {
			errors.rejectValue("namePreparerCde40", "String", "Name of the person cannot be blank");
		}
		if (form.getEmailPreparerCde40() == null || "".equals(form.getEmailPreparerCde40())) {
			errors.rejectValue("emailPreparerCde40", "String", "Email address cannot be blank");
		}
		if (form.getPhonePreparerCde40() == null || "".equals(form.getPhonePreparerCde40())) {
			errors.rejectValue("phonePreparerCde40", "String", "Phone nos  cannot be blank");
		}
	
		
		if (form.getOperTran() == null || form.getOperTran() <= 0) {
			errors.rejectValue("operTran", "double", "Total Current Operating Expenditure should be greater than zero");
		}
		
		if (form.getPupilTran() == null || form.getPupilTran() <= 0) {
			errors.rejectValue("pupilTran", "integer", "Nos of Pupils transported  should be  greater than zero");
		}
		if (form.getRegDMiles() == null || form.getRegDMiles() <= 0) {
			errors.rejectValue("regDMiles", "double", "Reguler Miles value should be greater than zero");
		}
		if (form.getSchoolDays() == null || form.getSchoolDays() <= 0) {
			errors.rejectValue("schoolDays", "integer", "School days Value should be greater than zero");
		}
		
		if (form.getBoardTran() != null && form.getBoardTran() < 0) {
			errors.rejectValue("boardTran", "integer", "Boarding days cannot be less than zero");
		}
	
		if (form.getActMiles() == null || form.getActMiles() <= 0) {
			errors.rejectValue("actMiles", "double", "Actual Miles should be greater than zero");
		}
		if (form.getTotalMiles() == null || form.getTotalMiles() <= 0) {
			errors.rejectValue("totalMiles", "double", "Total Miles should be greater than zero");
		}
		
		if (form.getMigMiles() == null || form.getMigMiles() < 0) {
			errors.rejectValue("migMiles", "double", "Migrant Miles cannot be less than zero");
		}
		
	
	}

}