
/*
 * Copyright ResQSoft, Inc. 2011
 */
package com.cdoe.ui.validator;

import org.apache.log4j.Logger;

import com.resqsoft.util.StringUtils;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.cdoe.ui.form.CommentInfoForm;

public class CommentInfoValidator implements Validator {

	private static final Logger logger = Logger.getLogger(CommentInfoValidator.class);
	
	@Override
	public boolean supports(Class clazz) {
		return false;
	}

	@Override
	public void validate(Object target, Errors errors) {
		CommentInfoForm form = (CommentInfoForm) target;
		
	}

}