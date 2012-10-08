
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
@Table(name = "`AUDIT_SASID_EXCEPTIONS`")
public class AuditSasidException implements Serializable {

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
	

	@Column(name = "`AT_RISK_EXCEPTION`")
	private String atRiskException;

    public String getAtRiskException () {
        return this.atRiskException;
    }

    public void setAtRiskException (String atRiskException) {
        this.atRiskException = atRiskException;
    }

	@Column(name = "`PUPIL_EXCEPTION`")
	private String pupilException;

    public String getPupilException () {
        return this.pupilException;
    }

    public void setPupilException (String pupilException) {
        this.pupilException = pupilException;
    }

	@Column(name = "`POST_SECONDARY`")
	private String postSecondary;

    public String getPostSecondary () {
        return this.postSecondary;
    }

    public void setPostSecondary (String postSecondary) {
        this.postSecondary = postSecondary;
    }

	@Column(name = "`ADJUSTED_FREE_LUNCH`")
	private String adjustedFreeLunch;

    public String getAdjustedFreeLunch () {
        return this.adjustedFreeLunch;
    }

    public void setAdjustedFreeLunch (String adjustedFreeLunch) {
        this.adjustedFreeLunch = adjustedFreeLunch;
    }

	@Column(name = "`ADJUSTED_FUNDING_CODE`")
	private String adjustedFundingCode;

    public String getAdjustedFundingCode () {
        return this.adjustedFundingCode;
    }

    public void setAdjustedFundingCode (String adjustedFundingCode) {
        this.adjustedFundingCode = adjustedFundingCode;
    }

	@Column(name = "`SASID_EXCEPTION`")
	private String sasidException;

    public String getSasidException () {
        return this.sasidException;
    }

    public void setSasidException (String sasidException) {
        this.sasidException = sasidException;
    }

	@Column(name = "`PARENT_DISTRICT_RESIDENCE`")
	private String parentDistrictResidence;

    public String getParentDistrictResidence () {
        return this.parentDistrictResidence;
    }

    public void setParentDistrictResidence (String parentDistrictResidence) {
        this.parentDistrictResidence = parentDistrictResidence;
    }

	@Column(name = "`ATTENDANCE_CODE`")
	private String attendanceCode;

    public String getAttendanceCode () {
        return this.attendanceCode;
    }

    public void setAttendanceCode (String attendanceCode) {
        this.attendanceCode = attendanceCode;
    }

	@Column(name = "`STUD_OCT_FREE_LUNCH`")
	private String studOctFreeLunch;

    public String getStudOctFreeLunch () {
        return this.studOctFreeLunch;
    }

    public void setStudOctFreeLunch (String studOctFreeLunch) {
        this.studOctFreeLunch = studOctFreeLunch;
    }

	@Column(name = "`STUD_OCT_FUNDING_CODE`")
	private String studOctFundingCode;

    public String getStudOctFundingCode () {
        return this.studOctFundingCode;
    }

    public void setStudOctFundingCode (String studOctFundingCode) {
        this.studOctFundingCode = studOctFundingCode;
    }

	@Column(name = "`STUDENT_GRADE`")
	private String studentGrade;

    public String getStudentGrade () {
        return this.studentGrade;
    }

    public void setStudentGrade (String studentGrade) {
        this.studentGrade = studentGrade;
    }

	@Column(name = "`STUDENT_MIDDLE_INITIAL`")
	private String studentMiddleInitial;

    public String getStudentMiddleInitial () {
        return this.studentMiddleInitial;
    }

    public void setStudentMiddleInitial (String studentMiddleInitial) {
        this.studentMiddleInitial = studentMiddleInitial;
    }

	@Column(name = "`STUDENT_FIRST_NAME`")
	private String studentFirstName;

    public String getStudentFirstName () {
        return this.studentFirstName;
    }

    public void setStudentFirstName (String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

	@Column(name = "`STUDENT_LAST_NAME`")
	private String studentLastName;

    public String getStudentLastName () {
        return this.studentLastName;
    }

    public void setStudentLastName (String studentLastName) {
        this.studentLastName = studentLastName;
    }

	@Column(name = "`STUD_OCT_SCHOOL`")
	private String studOctSchool;

    public String getStudOctSchool () {
        return this.studOctSchool;
    }

    public void setStudOctSchool (String studOctSchool) {
        this.studOctSchool = studOctSchool;
    }

	@Column(name = "`STUD_OCT_DISTRICT`")
	private String studOctDistrict;

    public String getStudOctDistrict () {
        return this.studOctDistrict;
    }

    public void setStudOctDistrict (String studOctDistrict) {
        this.studOctDistrict = studOctDistrict;
    }

	@Column(name = "`SASID`")
	private String sasid;

    public String getSasid () {
        return this.sasid;
    }

    public void setSasid (String sasid) {
        this.sasid = sasid;
    }

	@Column(name = "`FISCAL_YEAR`")
	private String fiscalYear;

    public String getFiscalYear () {
        return this.fiscalYear;
    }

    public void setFiscalYear (String fiscalYear) {
        this.fiscalYear = fiscalYear;
    }

	@Column(name = "`AUDIT_ID`")
	private Integer auditId;

    public Integer getAuditId () {
        return this.auditId;
    }

    public void setAuditId (Integer auditId) {
        this.auditId = auditId;
    }

}