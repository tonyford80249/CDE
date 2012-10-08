
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
@Table(name = "`FREE_LUNCH_CNT`")
public class FreeLunchCnt implements Serializable {

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
	

	@Column(name = "`District_Number`")
	private String districtNumber;

    public String getDistrictNumber () {
        return this.districtNumber;
    }

    public void setDistrictNumber (String districtNumber) {
        this.districtNumber = districtNumber;
    }

	@Column(name = "`FISCAL_YEAR`")
	private String fiscalYear;

    public String getFiscalYear () {
        return this.fiscalYear;
    }

    public void setFiscalYear (String fiscalYear) {
        this.fiscalYear = fiscalYear;
    }

	@Column(name = "`DATE_CHANGE`")
	private String dateChange;

    public String getDateChange () {
        return this.dateChange;
    }

    public void setDateChange (String dateChange) {
        this.dateChange = dateChange;
    }

	@Column(name = "`CHANGE_TYPE`")
	private String changeType;

    public String getChangeType () {
        return this.changeType;
    }

    public void setChangeType (String changeType) {
        this.changeType = changeType;
    }

	@Column(name = "`LUNCH_F_CPP`")
	private Double lunchFCpp;

    public Double getLunchFCpp () {
        return this.lunchFCpp;
    }

    public void setLunchFCpp (Double lunchFCpp) {
        this.lunchFCpp = lunchFCpp;
    }

	@Column(name = "`LUNCH_F_K`")
	private Double lunchFK;

    public Double getLunchFK () {
        return this.lunchFK;
    }

    public void setLunchFK (Double lunchFK) {
        this.lunchFK = lunchFK;
    }

	@Column(name = "`FULL_K_F_LUNCH`")
	private Double fullKFLunch;

    public Double getFullKFLunch () {
        return this.fullKFLunch;
    }

    public void setFullKFLunch (Double fullKFLunch) {
        this.fullKFLunch = fullKFLunch;
    }

	@Column(name = "`LUNCH_F_1`")
	private Double lunchF1;

    public Double getLunchF1 () {
        return this.lunchF1;
    }

    public void setLunchF1 (Double lunchF1) {
        this.lunchF1 = lunchF1;
    }

	@Column(name = "`LUNCH_F_2`")
	private Double lunchF2;

    public Double getLunchF2 () {
        return this.lunchF2;
    }

    public void setLunchF2 (Double lunchF2) {
        this.lunchF2 = lunchF2;
    }

	@Column(name = "`LUNCH_F_3`")
	private Double lunchF3;

    public Double getLunchF3 () {
        return this.lunchF3;
    }

    public void setLunchF3 (Double lunchF3) {
        this.lunchF3 = lunchF3;
    }

	@Column(name = "`LUNCH_F_4`")
	private Double lunchF4;

    public Double getLunchF4 () {
        return this.lunchF4;
    }

    public void setLunchF4 (Double lunchF4) {
        this.lunchF4 = lunchF4;
    }

	@Column(name = "`LUNCH_F_5`")
	private Double lunchF5;

    public Double getLunchF5 () {
        return this.lunchF5;
    }

    public void setLunchF5 (Double lunchF5) {
        this.lunchF5 = lunchF5;
    }

	@Column(name = "`LUNCH_F_6`")
	private Double lunchF6;

    public Double getLunchF6 () {
        return this.lunchF6;
    }

    public void setLunchF6 (Double lunchF6) {
        this.lunchF6 = lunchF6;
    }

	@Column(name = "`LUNCH_F_7`")
	private Double lunchF7;

    public Double getLunchF7 () {
        return this.lunchF7;
    }

    public void setLunchF7 (Double lunchF7) {
        this.lunchF7 = lunchF7;
    }

	@Column(name = "`LUNCH_F_8`")
	private Double lunchF8;

    public Double getLunchF8 () {
        return this.lunchF8;
    }

    public void setLunchF8 (Double lunchF8) {
        this.lunchF8 = lunchF8;
    }

	@Column(name = "`LUNCH_F_9`")
	private Double lunchF9;

    public Double getLunchF9 () {
        return this.lunchF9;
    }

    public void setLunchF9 (Double lunchF9) {
        this.lunchF9 = lunchF9;
    }

	@Column(name = "`LUNCH_F_10`")
	private Double lunchF10;

    public Double getLunchF10 () {
        return this.lunchF10;
    }

    public void setLunchF10 (Double lunchF10) {
        this.lunchF10 = lunchF10;
    }

	@Column(name = "`LUNCH_F_11`")
	private Double lunchF11;

    public Double getLunchF11 () {
        return this.lunchF11;
    }

    public void setLunchF11 (Double lunchF11) {
        this.lunchF11 = lunchF11;
    }

	@Column(name = "`LUNCH_F_12`")
	private Double lunchF12;

    public Double getLunchF12 () {
        return this.lunchF12;
    }

    public void setLunchF12 (Double lunchF12) {
        this.lunchF12 = lunchF12;
    }

	@Column(name = "`SP_7_12_F_LUNCH`")
	private Double sp712FLunch;

    public Double getSp712FLunch () {
        return this.sp712FLunch;
    }

    public void setSp712FLunch (Double sp712FLunch) {
        this.sp712FLunch = sp712FLunch;
    }

	@Column(name = "`UN_F_LUNCH`")
	private Double unFLunch;

    public Double getUnFLunch () {
        return this.unFLunch;
    }

    public void setUnFLunch (Double unFLunch) {
        this.unFLunch = unFLunch;
    }

	@Column(name = "`LUNCH_F_TOT`")
	private Double lunchFTot;

    public Double getLunchFTot () {
        return this.lunchFTot;
    }

    public void setLunchFTot (Double lunchFTot) {
        this.lunchFTot = lunchFTot;
    }

	@Column(name = "`SP_K6_F_LUNCH`")
	private Double spK6FLunch;

    public Double getSpK6FLunch () {
        return this.spK6FLunch;
    }

    public void setSpK6FLunch (Double spK6FLunch) {
        this.spK6FLunch = spK6FLunch;
    }

}