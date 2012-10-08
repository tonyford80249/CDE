
/*
 * Copyright ResQSoft, Inc. 2011
 */
package com.cdoe.ui.validator;

import org.apache.log4j.Logger;

import com.resqsoft.util.StringUtils;


import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.cdoe.ui.form.MillLevyForm;

public class MillLevyValidator implements Validator {

	private static final Logger logger = Logger.getLogger(MillLevyValidator.class);
	
	@Override
	public boolean supports(Class clazz) {
		return false;
	}

	@Override
	public void validate(Object target, Errors errors) {
		MillLevyForm form = (MillLevyForm) target;
		//if (ValidationUtils.isDecimal(form.getCalculatedOverrideMillLevy())) {
		//	errors.rejectValue("calculatedOverrideMillLevy", "float", "Value should be valid float");
		//}
		
	}

}