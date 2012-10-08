
package com.cdoe.biz.model;

import java.util.Date;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * A persistable business object which is a part of the application's domain
 * model. Normally, but not necessarily a business object represents a mapping
 * to a database table in Web applications generated by ResQSoft Engineer.
 * 
 * @author ResQSoft, Inc. (ResQSoft Engineer)
 * @version $Revision: $
 */
@XmlRootElement
@Entity
@Table(name = "`NEW_CAPITAL_OUTLAY`")
public class NewCapitalOutlay implements Serializable {

	/**
	 * Explicit serialVersionUID is considered a best practice, but may not
	 * matter to developers in many cases. Explicit serialVersionUID generated
	 * to guard against risk of "unexpected InvalidClassExceptions during
	 * deserialization" due to variations in compiler implementations. Should be
	 * changed when definition (i.e. serializable attributes) of class changes
	 * _if_ there is any chance that an instance of this class has been
	 * serialized and will be deserialized later. This value should not be
	 * changed if the class definition has not changed.
	 * 
	 * References:
	 * http://java.sun.com/j2se/1.5.0/docs/api/java/io/Serializable.html
	 * http://www.javaworld.com/javaworld/javaqa/2003-06/02-qa-0627-mythser.html
	 * http://www.javapractices.com/Topic45.cjp
	 */
	private static final long serialVersionUID = 1L;
	
	/*
	 * Autogenerated field
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private Long id;
	
	/**
	 * Hibernate provides optimistic locking through a version property on this persistent 
	 * object which is automatically managed by Hibernate. This version number will be used 
	 * by Hibernate to check that the row has not been updated since the last time it was 
	 * retrieved when updating the persistent object. 
	 * */
	@Version
	private Long version;
	
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}
	

	@Column(name = "`RELATED_YEAR`")
	private Long relatedYear;

    public Long getRelatedYear () {
        return this.relatedYear;
    }

    public void setRelatedYear (Long relatedYear) {
        this.relatedYear = relatedYear;
    }

	@Column(name = "`BASE_YEAR`")
	private Long baseYear;

    public Long getBaseYear () {
        return this.baseYear;
    }

    public void setBaseYear (Long baseYear) {
        this.baseYear = baseYear;
    }

	@Column(name = "`CAPITAL_OUTLAY_TOTAL_FUNDING`")
	private Long capitalOutlayTotalFunding;

    public Long getCapitalOutlayTotalFunding () {
        return this.capitalOutlayTotalFunding;
    }

    public void setCapitalOutlayTotalFunding (Long capitalOutlayTotalFunding) {
        this.capitalOutlayTotalFunding = capitalOutlayTotalFunding;
    }

	@Column(name = "`OUTLAY_EXCLUSION`")
	private Long outlayExclusion;

    public Long getOutlayExclusion () {
        return this.outlayExclusion;
    }

    public void setOutlayExclusion (Long outlayExclusion) {
        this.outlayExclusion = outlayExclusion;
    }

	@Column(name = "`CONTRACTOR_MILES`")
	private Long contractorMiles;

    public Long getContractorMiles () {
        return this.contractorMiles;
    }

    public void setContractorMiles (Long contractorMiles) {
        this.contractorMiles = contractorMiles;
    }

	@Column(name = "`DEPRECIATION_PY`")
	private Long depreciationPy;

    public Long getDepreciationPy () {
        return this.depreciationPy;
    }

    public void setDepreciationPy (Long depreciationPy) {
        this.depreciationPy = depreciationPy;
    }

	@Column(name = "`REMAINING_AMT`")
	private Long remainingAmt;

    public Long getRemainingAmt () {
        return this.remainingAmt;
    }

    public void setRemainingAmt (Long remainingAmt) {
        this.remainingAmt = remainingAmt;
    }

	@Column(name = "`PREV_DEPRECIATED_AMT`")
	private Long prevDepreciatedAmt;

    public Long getPrevDepreciatedAmt () {
        return this.prevDepreciatedAmt;
    }

    public void setPrevDepreciatedAmt (Long prevDepreciatedAmt) {
        this.prevDepreciatedAmt = prevDepreciatedAmt;
    }

	@Column(name = "`DEPRECIATION_CYCLE`")
	private Long depreciationCycle;

    public Long getDepreciationCycle () {
        return this.depreciationCycle;
    }

    public void setDepreciationCycle (Long depreciationCycle) {
        this.depreciationCycle = depreciationCycle;
    }

	@Column(name = "`TOTAL_PURCHASE_PRICE`")
	private Long totalPurchasePrice;

    public Long getTotalPurchasePrice () {
        return this.totalPurchasePrice;
    }

    public void setTotalPurchasePrice (Long totalPurchasePrice) {
        this.totalPurchasePrice = totalPurchasePrice;
    }

	@Column(name = "`FISCAL_YEAR`")
	private String fiscalYear;

    public String getFiscalYear () {
        return this.fiscalYear;
    }

    public void setFiscalYear (String fiscalYear) {
        this.fiscalYear = fiscalYear;
    }

	@Column(name = "`DISTRICT_NUMBER`")
	private String districtNumber;

    public String getDistrictNumber () {
        return this.districtNumber;
    }

    public void setDistrictNumber (String districtNumber) {
        this.districtNumber = districtNumber;
    }

}