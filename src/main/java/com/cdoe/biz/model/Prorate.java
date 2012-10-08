
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
@Table(name = "`PRORATE`")
public class Prorate implements Serializable {

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
	

	@Column(name = "`FISCAL_YEAR`")
	private String fiscalYear;

    public String getFiscalYear () {
        return this.fiscalYear;
    }

    public void setFiscalYear (String fiscalYear) {
        this.fiscalYear = fiscalYear;
    }

	@Column(name = "`PRORATE_FACTOR_1ST_PAYMENT`")
	private Double prorateFactor1stPayment;

    public Double getProrateFactor1stPayment () {
        return this.prorateFactor1stPayment;
    }

    public void setProrateFactor1stPayment (Double prorateFactor1stPayment) {
        this.prorateFactor1stPayment = prorateFactor1stPayment;
    }

	@Column(name = "`PRORATE_FACTOR_2ND_PAYMENT`")
	private Double prorateFactor2ndPayment;

    public Double getProrateFactor2ndPayment () {
        return this.prorateFactor2ndPayment;
    }

    public void setProrateFactor2ndPayment (Double prorateFactor2ndPayment) {
        this.prorateFactor2ndPayment = prorateFactor2ndPayment;
    }

	@Column(name = "`FUNDING_SOURCES`")
	private String fundingSources;

    public String getFundingSources () {
        return this.fundingSources;
    }

    public void setFundingSources (String fundingSources) {
        this.fundingSources = fundingSources;
    }

	@Column(name = "`TOTAL_FIRST_PAYMENT`")
	private Double totalFirstPayment;

    public Double getTotalFirstPayment () {
        return this.totalFirstPayment;
    }

    public void setTotalFirstPayment (Double totalFirstPayment) {
        this.totalFirstPayment = totalFirstPayment;
    }

	@Column(name = "`TOTAL_SECOND_PAYMENT`")
	private Double totalSecondPayment;

    public Double getTotalSecondPayment () {
        return this.totalSecondPayment;
    }

    public void setTotalSecondPayment (Double totalSecondPayment) {
        this.totalSecondPayment = totalSecondPayment;
    }

	@Column(name = "`TOTAL_DISTRIBUTION`")
	private Double totalDistribution;

    public Double getTotalDistribution () {
        return this.totalDistribution;
    }

    public void setTotalDistribution (Double totalDistribution) {
        this.totalDistribution = totalDistribution;
    }

}