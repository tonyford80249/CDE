/**
 * 
 */
package com.cdoe.ui.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.cdoe.ui.form.AuditRepaymentAdjustmentForm;

/**
 * @author dyn-8
 *
 */
public class AuditRepaymentAdjustmentValidator implements Validator {

	/**
	 * Default Constructor
	 */
	public AuditRepaymentAdjustmentValidator() {
		super();
	}

	/* (non-Javadoc)
	 * @see org.springframework.validation.Validator#supports(java.lang.Class)
	 */
	@Override
	public boolean supports(Class<?> clazz) {
		return AuditRepaymentAdjustmentForm.class.equals(clazz);
	}

	/* (non-Javadoc)
	 * @see org.springframework.validation.Validator#validate(java.lang.Object, org.springframework.validation.Errors)
	 */
	@Override
	public void validate(Object target, Errors errors) {
		AuditRepaymentAdjustmentForm form = (AuditRepaymentAdjustmentForm) target;
		if (form.getDistrictNumber() == null || form.getDistrictNumber().length() == 0) {
			errors.rejectValue("districtNumber", "District Code cannot be null");
		}
		if (form.getBeginFiscalYear() == null || form.getBeginFiscalYear().length() == 0) {
			errors.rejectValue("beginFiscalYear", "Begin Fiscal Year cannot be null");
		}
		if (form.getBeginFiscalMonth() == null || form.getBeginFiscalMonth().length() == 0) {
			errors.rejectValue("beginFiscalMonth", "Begin Fiscal Month cannot be null");
		}
		if (form.getEndFiscalYear() == null || form.getEndFiscalYear().length() == 0) {
			errors.rejectValue("endFiscalYear", "End Fiscal Year cannot be null");
		}
		if (form.getEndFiscalMonth() == null || form.getEndFiscalMonth().length() == 0) {
			errors.rejectValue("endFiscalMonth", "End Fiscal Month cannot be null");
		}
		if (form.getFrequency() == null || form.getFrequency().length() == 0) {
			errors.rejectValue("frequency", "Frequency cannot be null");
		}
		if (form.getAmount() == null || form.getAmount() <= 0) {
			errors.rejectValue("amount", "Must enter an amount greater than 0");
		}
	}

}
