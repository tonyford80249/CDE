
/*
 * Copyright ResQSoft, Inc. 2011
 */
package com.cdoe.ui.validator;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.cdoe.ui.form.CapitalOutlayForm;
import com.cdoe.ui.form.grid.CapitalOutlayGrid;

public class CapitalOutlayValidator implements Validator {

	private static final Logger logger = Logger.getLogger(CapitalOutlayValidator.class);
	
	@Override
	public boolean supports(Class clazz) {
		return false;
	}

	@Override
	public void validate(Object target, Errors errors) {
		CapitalOutlayForm form = (CapitalOutlayForm) target;
		List<CapitalOutlayGrid> coGridList = form.getCapitalOutlayGridList();
		
		for (CapitalOutlayGrid cogl : coGridList) {
			if ((cogl.getTotalPurchasePrice() != null && cogl.getTotalPurchasePrice().doubleValue() > 0) 
				&& (cogl.getContractorMiles() == null || cogl.getContractorMiles().doubleValue() <=0))
			errors.rejectValue("errorMessage", "String", "Contractor Miles percentage cannot be blank or less than 1 when Total Purchase Price is > 0 for year " + cogl.getRelatedYear());
			
		}
		
		
	}

}