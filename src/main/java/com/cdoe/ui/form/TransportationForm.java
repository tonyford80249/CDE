
/*
 * Copyright ResQSoft, Inc. 2011
 */
package com.cdoe.ui.form;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import com.cdoe.ui.form.grid.*;
import com.cdoe.util.DateUtil;

/**
 * Java bean object representing a business entity which will be used by Spring Form
 * to pass data to and from the view, controller, and service layer.
 * 
 * @author ResQSoft, Inc. (ResQSoft Engineer)
 */
public class TransportationForm {

	private long id;
	
    public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	private String districtNumber;
	
	public String getDistrictNumber () {
        return this.districtNumber;
    }

    public void setDistrictNumber (String districtNumber) {
        this.districtNumber = districtNumber;
        
    }
    
    private String districtName;
	
  	public String getDistrictName () {
          return this.districtName;
      }

      public void setDistrictName (String districtName) {
          this.districtName = districtName;
     }

	private String dateChanged;
	
	public String getDateChanged () {
        return this.dateChanged;
    }

    public void setDateChanged (String dateChanged) {
        this.dateChanged = dateChanged;
    }
	private String errors;
	
	public String getErrors () {
        return this.errors;
    }

    public void setErrors (String errors) {
        this.errors = errors;
    }
	private Long pupilTran;
	
	public Long getPupilTran () {
        return this.pupilTran;
    }

    public void setPupilTran (Long pupilTran) {
        this.pupilTran = pupilTran;
    }
	private Double operTran;
	
	public Double getOperTran () {
        return this.operTran;
    }

    public void setOperTran (Double operTran) {
        this.operTran = operTran;
    }
	private Double indCont;
	
	public Double getIndCont () {
        return this.indCont;
    }

    public void setIndCont (Double indCont) {
        this.indCont = indCont;
    }
	private Double capOutTran;
	
	public Double getCapOutTran () {
        return this.capOutTran;
    }

    public void setCapOutTran (Double capOutTran) {
        this.capOutTran = capOutTran;
    }
	private Double migMiles;
	
	public Double getMigMiles () {
        return this.migMiles;
    }

    public void setMigMiles (Double migMiles) {
        this.migMiles = migMiles;
    }
	private Double regDMiles;
	
	public Double getRegDMiles () {
        return this.regDMiles;
    }

    public void setRegDMiles (Double regDMiles) {
        this.regDMiles = regDMiles;
    }
    
    
    private Double regMiles;
	
	public Double getRegMiles () {
        return this.regMiles;
    }

    public void setRegMiles (Double regMiles) {
        this.regMiles = regMiles;
    }
    
    
    
	private Long schoolDays;
	
	public Long getSchoolDays () {
        return this.schoolDays;
    }

    public void setSchoolDays (Long schoolDays) {
        this.schoolDays = schoolDays;
    }
	private Long regDays;
	
	public Long getRegDays () {
        return this.regDays;
    }

    public void setRegDays (Long regDays) {
        this.regDays = regDays;
    }
	private Long boardTran;
	
	public Long getBoardTran () {
        return this.boardTran;
    }

    public void setBoardTran (Long boardTran) {
        this.boardTran = boardTran;
    }
	private Double exReim;
	
	public Double getExReim () {
        return this.exReim;
    }

    public void setExReim (Double exReim) {
        this.exReim = exReim;
    }
	private Double desegReim;
	
	public Double getDesegReim () {
        return this.desegReim;
    }

    public void setDesegReim (Double desegReim) {
        this.desegReim = desegReim;
    }
	private Double reimTran;
	
	public Double getReimTran () {
        return this.reimTran;
    }

    public void setReimTran (Double reimTran) {
        this.reimTran = reimTran;
    }
	private Double reimTranLy;
	
	public Double getReimTranLy () {
        return this.reimTranLy;
    }

    public void setReimTranLy (Double reimTranLy) {
        this.reimTranLy = reimTranLy;
    }
	private Double advPayLy;
	
	public Double getAdvPayLy () {
        return this.advPayLy;
    }

    public void setAdvPayLy (Double advPayLy) {
        this.advPayLy = advPayLy;
    }
	private Double reimAdvPay;
	
	public Double getReimAdvPay () {
        return this.reimAdvPay;
    }

    public void setReimAdvPay (Double reimAdvPay) {
        this.reimAdvPay = reimAdvPay;
    }
	private Double advPay;
	
	public Double getAdvPay () {
        return this.advPay;
    }

    public void setAdvPay (Double advPay) {
        this.advPay = advPay;
    }
	private Double actMiles;
	
	public Double getActMiles () {
        return this.actMiles;
    }

    public void setActMiles (Double actMiles) {
        this.actMiles = actMiles;
    }
	private Double totalMiles;
	
	public Double getTotalMiles () {
        return this.totalMiles;
    }

    public void setTotalMiles (Double totalMiles) {
        this.totalMiles = totalMiles;
    }
    
    public String getCurrentFiscalYear() {
     return DateUtil.getFiscalYear();   
    }
    
    public void setCurrentFiscalYear(String any) {        
    }
	private String fiscalYear;
	
	public String getFiscalYear () {
        return this.fiscalYear;
    }

    public void setFiscalYear (String fiscalYear) {
        this.fiscalYear = fiscalYear;
    }
    
    public String getFormattedCurrentFiscalYear() {
      return DateUtil.getFiscalYearFormattedLong();  
    }
    
    public void setFormattedCurrentFiscalYear(String any) {        
    }
    
     private String formattedFiscalYear;
	
     public String getFormattedFiscalYear () {
        return this.formattedFiscalYear;
     }

    public void setFormattedFiscalYear (String fiscalYear) {
       this.formattedFiscalYear = fiscalYear;
    }
	private String cdeComments;
	
	public String getCdeComments () {
        return this.cdeComments;
    }

    public void setCdeComments (String cdeComments) {
        this.cdeComments = cdeComments;
    }
	private Double firstPayment;
	
	public Double getFirstPayment () {
        return this.firstPayment;
    }

    public void setFirstPayment (Double firstPayment) {
        this.firstPayment = firstPayment;
    }
	private Double secondPayment;
	
	public Double getSecondPayment () {
        return this.secondPayment;
    }

    public void setSecondPayment (Double secondPayment) {
        this.secondPayment = secondPayment;
    }
	private Double districtDistribution;
	
	public Double getDistrictDistribution () {
        return this.districtDistribution;
    }

    public void setDistrictDistribution (Double districtDistribution) {
        this.districtDistribution = districtDistribution;
    }
	private Double cofrsBatchNumber;
	
	public Double getCofrsBatchNumber () {
        return this.cofrsBatchNumber;
    }

    public void setCofrsBatchNumber (Double cofrsBatchNumber) {
        this.cofrsBatchNumber = cofrsBatchNumber;
    }
	private Date cofrsDatePaid;
	
	public Date getCofrsDatePaid () {
        return this.cofrsDatePaid;
    }

    public void setCofrsDatePaid (Date cofrsDatePaid) {
        this.cofrsDatePaid = cofrsDatePaid;
    }
	private String namePreparerCde40;
	
	public String getNamePreparerCde40 () {
        return this.namePreparerCde40;
    }

    public void setNamePreparerCde40 (String namePreparerCde40) {
        this.namePreparerCde40 = namePreparerCde40;
    }
	private String phonePreparerCde40;
	
	public String getPhonePreparerCde40 () {
        return this.phonePreparerCde40;
    }

    public void setPhonePreparerCde40 (String phonePreparerCde40) {
        this.phonePreparerCde40 = phonePreparerCde40;
    }
	private String emailPreparerCde40;
	
	public String getEmailPreparerCde40 () {
        return this.emailPreparerCde40;
    }

    public void setEmailPreparerCde40 (String emailPreparerCde40) {
        this.emailPreparerCde40 = emailPreparerCde40;
    }
	private Double feesCollected;
	
	public Double getFeesCollected () {
        return this.feesCollected;
    }

    public void setFeesCollected (Double feesCollected) {
        this.feesCollected = feesCollected;
    }
	private Double otherRevenue;
	
	public Double getOtherRevenue () {
        return this.otherRevenue;
    }

    public void setOtherRevenue (Double otherRevenue) {
        this.otherRevenue = otherRevenue;
    }
	private Double netCurrentOperExpend;
	
	public Double getNetCurrentOperExpend () {
        return this.netCurrentOperExpend;
    }

    public void setNetCurrentOperExpend (Double netCurrentOperExpend) {
        this.netCurrentOperExpend = netCurrentOperExpend;
    }
	private Double totalReimMileage;
	
	public Double getTotalReimMileage () {
        return this.totalReimMileage;
    }

    public void setTotalReimMileage (Double totalReimMileage) {
        this.totalReimMileage = totalReimMileage;
    }
	private Double mileageEntitlement;
	
	public Double getMileageEntitlement () {
        return this.mileageEntitlement;
    }

    public void setMileageEntitlement (Double mileageEntitlement) {
        this.mileageEntitlement = mileageEntitlement;
    }
	private Double exCosts;
	
	public Double getExCosts () {
        return this.exCosts;
    }

    public void setExCosts (Double exCosts) {
        this.exCosts = exCosts;
    }
	private Double maxReimEntitlement;
	
	public Double getMaxReimEntitlement () {
        return this.maxReimEntitlement;
    }

    public void setMaxReimEntitlement (Double maxReimEntitlement) {
        this.maxReimEntitlement = maxReimEntitlement;
    }
	private Double reimEntitlement;
	
	public Double getReimEntitlement () {
        return this.reimEntitlement;
    }

    public void setReimEntitlement (Double reimEntitlement) {
        this.reimEntitlement = reimEntitlement;
    }
	private Double totalReimEntitlement;
	
	public Double getTotalReimEntitlement () {
        return this.totalReimEntitlement;
    }

    public void setTotalReimEntitlement (Double totalReimEntitlement) {
        this.totalReimEntitlement = totalReimEntitlement;
    }
	private Double finalReimEntitlement;
	
	public Double getFinalReimEntitlement () {
        return this.finalReimEntitlement;
    }

    public void setFinalReimEntitlement (Double finalReimEntitlement) {
        this.finalReimEntitlement = finalReimEntitlement;
    }
	private Double finalReimProrated;
	
	public Double getFinalReimProrated () {
        return this.finalReimProrated;
    }

    public void setFinalReimProrated (Double finalReimProrated) {
        this.finalReimProrated = finalReimProrated;
    }
    
	private List<TransportationGrid> transportationGridList = new ArrayList<TransportationGrid>();
	
	public List<TransportationGrid> getTransportationGridList() {
	    return this.transportationGridList;
	}
	
	private boolean isCapitalOutLay;

	public boolean getIsCapitalOutLay() {
		return this.isCapitalOutLay;
	}

	public void setCapitalOutLay(boolean isCapitalOutLay) {
		this.isCapitalOutLay = isCapitalOutLay;
	}
        
        private boolean valid;

	public boolean getValid() {
		return this.valid;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}

	private String message;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	
		

}