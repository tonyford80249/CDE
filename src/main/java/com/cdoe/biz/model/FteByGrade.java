
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
@Table(name = "`FTE_BY_GRADE`")
public class FteByGrade implements Serializable {

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

	@Column(name = "`DATE_CHANGED`")
	private String dateChanged;

    public String getDateChanged () {
        return this.dateChanged;
    }

    public void setDateChanged (String dateChanged) {
        this.dateChanged = dateChanged;
    }

	@Column(name = "`CHANGE_TYPE`")
	private String changeType;

    public String getChangeType () {
        return this.changeType;
    }

    public void setChangeType (String changeType) {
        this.changeType = changeType;
    }

	@Column(name = "`MEMBER_PS`")
	private Double memberPs;

    public Double getMemberPs () {
        return this.memberPs;
    }

    public void setMemberPs (Double memberPs) {
        this.memberPs = memberPs;
    }

	@Column(name = "`PARTTIME_H_PS`")
	private Double parttimeHPs;

    public Double getParttimeHPs () {
        return this.parttimeHPs;
    }

    public void setParttimeHPs (Double parttimeHPs) {
        this.parttimeHPs = parttimeHPs;
    }

	@Column(name = "`PARTTIME_F_PS`")
	private Double parttimeFPs;

    public Double getParttimeFPs () {
        return this.parttimeFPs;
    }

    public void setParttimeFPs (Double parttimeFPs) {
        this.parttimeFPs = parttimeFPs;
    }

	@Column(name = "`FTE_NOT_ELIG_PS`")
	private Double fteNotEligPs;

    public Double getFteNotEligPs () {
        return this.fteNotEligPs;
    }

    public void setFteNotEligPs (Double fteNotEligPs) {
        this.fteNotEligPs = fteNotEligPs;
    }

	@Column(name = "`FTE_ELIG_PS`")
	private Double fteEligPs;

    public Double getFteEligPs () {
        return this.fteEligPs;
    }

    public void setFteEligPs (Double fteEligPs) {
        this.fteEligPs = fteEligPs;
    }

	@Column(name = "`FUNDED_COUNT_PS`")
	private Double fundedCountPs;

    public Double getFundedCountPs () {
        return this.fundedCountPs;
    }

    public void setFundedCountPs (Double fundedCountPs) {
        this.fundedCountPs = fundedCountPs;
    }

	@Column(name = "`MEMBER_CPP`")
	private Double memberCpp;

    public Double getMemberCpp () {
        return this.memberCpp;
    }

    public void setMemberCpp (Double memberCpp) {
        this.memberCpp = memberCpp;
    }

	@Column(name = "`PARTTIME_H_CPP`")
	private Double parttimeHCpp;

    public Double getParttimeHCpp () {
        return this.parttimeHCpp;
    }

    public void setParttimeHCpp (Double parttimeHCpp) {
        this.parttimeHCpp = parttimeHCpp;
    }

	@Column(name = "`PARTTIME_F_CPP`")
	private Double parttimeFCpp;

    public Double getParttimeFCpp () {
        return this.parttimeFCpp;
    }

    public void setParttimeFCpp (Double parttimeFCpp) {
        this.parttimeFCpp = parttimeFCpp;
    }

	@Column(name = "`FTE_NOT_ELIG_CPP`")
	private Double fteNotEligCpp;

    public Double getFteNotEligCpp () {
        return this.fteNotEligCpp;
    }

    public void setFteNotEligCpp (Double fteNotEligCpp) {
        this.fteNotEligCpp = fteNotEligCpp;
    }

	@Column(name = "`FTE_ELIG_CPP`")
	private Double fteEligCpp;

    public Double getFteEligCpp () {
        return this.fteEligCpp;
    }

    public void setFteEligCpp (Double fteEligCpp) {
        this.fteEligCpp = fteEligCpp;
    }

	@Column(name = "`FUNDED_COUNT_CPP`")
	private Double fundedCountCpp;

    public Double getFundedCountCpp () {
        return this.fundedCountCpp;
    }

    public void setFundedCountCpp (Double fundedCountCpp) {
        this.fundedCountCpp = fundedCountCpp;
    }

	@Column(name = "`CDE_MEMBER_K`")
	private Double cdeMemberK;

    public Double getCdeMemberK () {
        return this.cdeMemberK;
    }

    public void setCdeMemberK (Double cdeMemberK) {
        this.cdeMemberK = cdeMemberK;
    }

	@Column(name = "`MEMBER_K`")
	private Double memberK;

    public Double getMemberK () {
        return this.memberK;
    }

    public void setMemberK (Double memberK) {
        this.memberK = memberK;
    }

	@Column(name = "`PARTTIME_H_K`")
	private Double parttimeHK;

    public Double getParttimeHK () {
        return this.parttimeHK;
    }

    public void setParttimeHK (Double parttimeHK) {
        this.parttimeHK = parttimeHK;
    }

	@Column(name = "`PARTTIME_F_K`")
	private Double parttimeFK;

    public Double getParttimeFK () {
        return this.parttimeFK;
    }

    public void setParttimeFK (Double parttimeFK) {
        this.parttimeFK = parttimeFK;
    }

	@Column(name = "`ONLINE_K`")
	private Double onlineK;

    public Double getOnlineK () {
        return this.onlineK;
    }

    public void setOnlineK (Double onlineK) {
        this.onlineK = onlineK;
    }

	@Column(name = "`FTE_NOT_ELIG_K`")
	private Double fteNotEligK;

    public Double getFteNotEligK () {
        return this.fteNotEligK;
    }

    public void setFteNotEligK (Double fteNotEligK) {
        this.fteNotEligK = fteNotEligK;
    }

	@Column(name = "`FTE_ELIG_K`")
	private Double fteEligK;

    public Double getFteEligK () {
        return this.fteEligK;
    }

    public void setFteEligK (Double fteEligK) {
        this.fteEligK = fteEligK;
    }

	@Column(name = "`FUNDED_COUNT_K`")
	private Double fundedCountK;

    public Double getFundedCountK () {
        return this.fundedCountK;
    }

    public void setFundedCountK (Double fundedCountK) {
        this.fundedCountK = fundedCountK;
    }

	@Column(name = "`CDE_MEMBER_1`")
	private Double cdeMember1;

    public Double getCdeMember1 () {
        return this.cdeMember1;
    }

    public void setCdeMember1 (Double cdeMember1) {
        this.cdeMember1 = cdeMember1;
    }

	@Column(name = "`MEMBER_1`")
	private Double member1;

    public Double getMember1 () {
        return this.member1;
    }

    public void setMember1 (Double member1) {
        this.member1 = member1;
    }

	@Column(name = "`PARTTIME_H_1`")
	private Double parttimeH1;

    public Double getParttimeH1 () {
        return this.parttimeH1;
    }

    public void setParttimeH1 (Double parttimeH1) {
        this.parttimeH1 = parttimeH1;
    }

	@Column(name = "`PARTTIME_F_1`")
	private Double parttimeF1;

    public Double getParttimeF1 () {
        return this.parttimeF1;
    }

    public void setParttimeF1 (Double parttimeF1) {
        this.parttimeF1 = parttimeF1;
    }

	@Column(name = "`FTE_NOT_ELIG_1`")
	private Double fteNotElig1;

    public Double getFteNotElig1 () {
        return this.fteNotElig1;
    }

    public void setFteNotElig1 (Double fteNotElig1) {
        this.fteNotElig1 = fteNotElig1;
    }

	@Column(name = "`FTE_ELIG_1`")
	private Double fteElig1;

    public Double getFteElig1 () {
        return this.fteElig1;
    }

    public void setFteElig1 (Double fteElig1) {
        this.fteElig1 = fteElig1;
    }

	@Column(name = "`FUNDED_COUNT_1`")
	private Double fundedCount1;

    public Double getFundedCount1 () {
        return this.fundedCount1;
    }

    public void setFundedCount1 (Double fundedCount1) {
        this.fundedCount1 = fundedCount1;
    }

	@Column(name = "`CDE_MEMBER_2`")
	private Double cdeMember2;

    public Double getCdeMember2 () {
        return this.cdeMember2;
    }

    public void setCdeMember2 (Double cdeMember2) {
        this.cdeMember2 = cdeMember2;
    }

	@Column(name = "`MEMBER_2`")
	private Double member2;

    public Double getMember2 () {
        return this.member2;
    }

    public void setMember2 (Double member2) {
        this.member2 = member2;
    }

	@Column(name = "`PARTTIME_H_2`")
	private Double parttimeH2;

    public Double getParttimeH2 () {
        return this.parttimeH2;
    }

    public void setParttimeH2 (Double parttimeH2) {
        this.parttimeH2 = parttimeH2;
    }

	@Column(name = "`PARTTIME_F_2`")
	private Double parttimeF2;

    public Double getParttimeF2 () {
        return this.parttimeF2;
    }

    public void setParttimeF2 (Double parttimeF2) {
        this.parttimeF2 = parttimeF2;
    }

	@Column(name = "`ONLINE_2`")
	private Double online2;

    public Double getOnline2 () {
        return this.online2;
    }

    public void setOnline2 (Double online2) {
        this.online2 = online2;
    }

	@Column(name = "`OUT_OF_DIST_2`")
	private Double outOfDist2;

    public Double getOutOfDist2 () {
        return this.outOfDist2;
    }

    public void setOutOfDist2 (Double outOfDist2) {
        this.outOfDist2 = outOfDist2;
    }

	@Column(name = "`FTE_NOT_ELIG_2`")
	private Double fteNotElig2;

    public Double getFteNotElig2 () {
        return this.fteNotElig2;
    }

    public void setFteNotElig2 (Double fteNotElig2) {
        this.fteNotElig2 = fteNotElig2;
    }

	@Column(name = "`FTE_ELIG_2`")
	private Double fteElig2;

    public Double getFteElig2 () {
        return this.fteElig2;
    }

    public void setFteElig2 (Double fteElig2) {
        this.fteElig2 = fteElig2;
    }

	@Column(name = "`FUNDED_COUNT_2`")
	private Double fundedCount2;

    public Double getFundedCount2 () {
        return this.fundedCount2;
    }

    public void setFundedCount2 (Double fundedCount2) {
        this.fundedCount2 = fundedCount2;
    }

	@Column(name = "`CDE_MEMBER_3`")
	private Double cdeMember3;

    public Double getCdeMember3 () {
        return this.cdeMember3;
    }

    public void setCdeMember3 (Double cdeMember3) {
        this.cdeMember3 = cdeMember3;
    }

	@Column(name = "`MEMBER_3`")
	private Double member3;

    public Double getMember3 () {
        return this.member3;
    }

    public void setMember3 (Double member3) {
        this.member3 = member3;
    }

	@Column(name = "`PARTTIME_H_3`")
	private Double parttimeH3;

    public Double getParttimeH3 () {
        return this.parttimeH3;
    }

    public void setParttimeH3 (Double parttimeH3) {
        this.parttimeH3 = parttimeH3;
    }

	@Column(name = "`PARTTIME_F_3`")
	private Double parttimeF3;

    public Double getParttimeF3 () {
        return this.parttimeF3;
    }

    public void setParttimeF3 (Double parttimeF3) {
        this.parttimeF3 = parttimeF3;
    }

	@Column(name = "`ONLINE_3`")
	private Double online3;

    public Double getOnline3 () {
        return this.online3;
    }

    public void setOnline3 (Double online3) {
        this.online3 = online3;
    }

	@Column(name = "`OUT_OF_DIST_3`")
	private Double outOfDist3;

    public Double getOutOfDist3 () {
        return this.outOfDist3;
    }

    public void setOutOfDist3 (Double outOfDist3) {
        this.outOfDist3 = outOfDist3;
    }

	@Column(name = "`FTE_NOT_ELIG_3`")
	private Double fteNotElig3;

    public Double getFteNotElig3 () {
        return this.fteNotElig3;
    }

    public void setFteNotElig3 (Double fteNotElig3) {
        this.fteNotElig3 = fteNotElig3;
    }

	@Column(name = "`FTE_ELIG_3`")
	private Double fteElig3;

    public Double getFteElig3 () {
        return this.fteElig3;
    }

    public void setFteElig3 (Double fteElig3) {
        this.fteElig3 = fteElig3;
    }

	@Column(name = "`FUNDED_COUNT_3`")
	private Double fundedCount3;

    public Double getFundedCount3 () {
        return this.fundedCount3;
    }

    public void setFundedCount3 (Double fundedCount3) {
        this.fundedCount3 = fundedCount3;
    }

	@Column(name = "`CDE_MEMBER_4`")
	private Double cdeMember4;

    public Double getCdeMember4 () {
        return this.cdeMember4;
    }

    public void setCdeMember4 (Double cdeMember4) {
        this.cdeMember4 = cdeMember4;
    }

	@Column(name = "`MEMBER_4`")
	private Double member4;

    public Double getMember4 () {
        return this.member4;
    }

    public void setMember4 (Double member4) {
        this.member4 = member4;
    }

	@Column(name = "`PARTTIME_H_4`")
	private Double parttimeH4;

    public Double getParttimeH4 () {
        return this.parttimeH4;
    }

    public void setParttimeH4 (Double parttimeH4) {
        this.parttimeH4 = parttimeH4;
    }

	@Column(name = "`PARTTIME_F_4`")
	private Double parttimeF4;

    public Double getParttimeF4 () {
        return this.parttimeF4;
    }

    public void setParttimeF4 (Double parttimeF4) {
        this.parttimeF4 = parttimeF4;
    }

	@Column(name = "`ONLINE_4`")
	private Double online4;

    public Double getOnline4 () {
        return this.online4;
    }

    public void setOnline4 (Double online4) {
        this.online4 = online4;
    }

	@Column(name = "`OUT_OF_DIST_4`")
	private Double outOfDist4;

    public Double getOutOfDist4 () {
        return this.outOfDist4;
    }

    public void setOutOfDist4 (Double outOfDist4) {
        this.outOfDist4 = outOfDist4;
    }

	@Column(name = "`FTE_NOT_ELIG_4`")
	private Double fteNotElig4;

    public Double getFteNotElig4 () {
        return this.fteNotElig4;
    }

    public void setFteNotElig4 (Double fteNotElig4) {
        this.fteNotElig4 = fteNotElig4;
    }

	@Column(name = "`FTE_ELIG_4`")
	private Double fteElig4;

    public Double getFteElig4 () {
        return this.fteElig4;
    }

    public void setFteElig4 (Double fteElig4) {
        this.fteElig4 = fteElig4;
    }

	@Column(name = "`FUNDED_COUNT_4`")
	private Double fundedCount4;

    public Double getFundedCount4 () {
        return this.fundedCount4;
    }

    public void setFundedCount4 (Double fundedCount4) {
        this.fundedCount4 = fundedCount4;
    }

	@Column(name = "`CDE_MEMBER_5`")
	private Double cdeMember5;

    public Double getCdeMember5 () {
        return this.cdeMember5;
    }

    public void setCdeMember5 (Double cdeMember5) {
        this.cdeMember5 = cdeMember5;
    }

	@Column(name = "`MEMBER_5`")
	private Double member5;

    public Double getMember5 () {
        return this.member5;
    }

    public void setMember5 (Double member5) {
        this.member5 = member5;
    }

	@Column(name = "`PARTTIME_H_5`")
	private Double parttimeH5;

    public Double getParttimeH5 () {
        return this.parttimeH5;
    }

    public void setParttimeH5 (Double parttimeH5) {
        this.parttimeH5 = parttimeH5;
    }

	@Column(name = "`PARTTIME_F_5`")
	private Double parttimeF5;

    public Double getParttimeF5 () {
        return this.parttimeF5;
    }

    public void setParttimeF5 (Double parttimeF5) {
        this.parttimeF5 = parttimeF5;
    }

	@Column(name = "`ONLINE_5`")
	private Double online5;

    public Double getOnline5 () {
        return this.online5;
    }

    public void setOnline5 (Double online5) {
        this.online5 = online5;
    }

	@Column(name = "`OUT_OF_DIST_5`")
	private Double outOfDist5;

    public Double getOutOfDist5 () {
        return this.outOfDist5;
    }

    public void setOutOfDist5 (Double outOfDist5) {
        this.outOfDist5 = outOfDist5;
    }

	@Column(name = "`FTE_NOT_ELIG_5`")
	private Double fteNotElig5;

    public Double getFteNotElig5 () {
        return this.fteNotElig5;
    }

    public void setFteNotElig5 (Double fteNotElig5) {
        this.fteNotElig5 = fteNotElig5;
    }

	@Column(name = "`FTE_ELIG_5`")
	private Double fteElig5;

    public Double getFteElig5 () {
        return this.fteElig5;
    }

    public void setFteElig5 (Double fteElig5) {
        this.fteElig5 = fteElig5;
    }

	@Column(name = "`FUNDED_COUNT_5`")
	private Double fundedCount5;

    public Double getFundedCount5 () {
        return this.fundedCount5;
    }

    public void setFundedCount5 (Double fundedCount5) {
        this.fundedCount5 = fundedCount5;
    }

	@Column(name = "`CDE_MEMBER_6`")
	private Double cdeMember6;

    public Double getCdeMember6 () {
        return this.cdeMember6;
    }

    public void setCdeMember6 (Double cdeMember6) {
        this.cdeMember6 = cdeMember6;
    }

	@Column(name = "`MEMBER_6`")
	private Double member6;

    public Double getMember6 () {
        return this.member6;
    }

    public void setMember6 (Double member6) {
        this.member6 = member6;
    }

	@Column(name = "`PARTTIME_H_6`")
	private Double parttimeH6;

    public Double getParttimeH6 () {
        return this.parttimeH6;
    }

    public void setParttimeH6 (Double parttimeH6) {
        this.parttimeH6 = parttimeH6;
    }

	@Column(name = "`PARTTIME_F_6`")
	private Double parttimeF6;

    public Double getParttimeF6 () {
        return this.parttimeF6;
    }

    public void setParttimeF6 (Double parttimeF6) {
        this.parttimeF6 = parttimeF6;
    }

	@Column(name = "`ONLINE_6`")
	private Double online6;

    public Double getOnline6 () {
        return this.online6;
    }

    public void setOnline6 (Double online6) {
        this.online6 = online6;
    }

	@Column(name = "`OUT_OF_DIST_6`")
	private Double outOfDist6;

    public Double getOutOfDist6 () {
        return this.outOfDist6;
    }

    public void setOutOfDist6 (Double outOfDist6) {
        this.outOfDist6 = outOfDist6;
    }

	@Column(name = "`FTE_NOT_ELIG_6`")
	private Double fteNotElig6;

    public Double getFteNotElig6 () {
        return this.fteNotElig6;
    }

    public void setFteNotElig6 (Double fteNotElig6) {
        this.fteNotElig6 = fteNotElig6;
    }

	@Column(name = "`FTE_ELIG_6`")
	private Double fteElig6;

    public Double getFteElig6 () {
        return this.fteElig6;
    }

    public void setFteElig6 (Double fteElig6) {
        this.fteElig6 = fteElig6;
    }

	@Column(name = "`FUNDED_COUNT_6`")
	private Double fundedCount6;

    public Double getFundedCount6 () {
        return this.fundedCount6;
    }

    public void setFundedCount6 (Double fundedCount6) {
        this.fundedCount6 = fundedCount6;
    }

	@Column(name = "`CDE_MEMBER_7`")
	private Double cdeMember7;

    public Double getCdeMember7 () {
        return this.cdeMember7;
    }

    public void setCdeMember7 (Double cdeMember7) {
        this.cdeMember7 = cdeMember7;
    }

	@Column(name = "`MEMBER_7`")
	private Double member7;

    public Double getMember7 () {
        return this.member7;
    }

    public void setMember7 (Double member7) {
        this.member7 = member7;
    }

	@Column(name = "`PARTTIME_H_7`")
	private Double parttimeH7;

    public Double getParttimeH7 () {
        return this.parttimeH7;
    }

    public void setParttimeH7 (Double parttimeH7) {
        this.parttimeH7 = parttimeH7;
    }

	@Column(name = "`PARTTIME_F_7`")
	private Double parttimeF7;

    public Double getParttimeF7 () {
        return this.parttimeF7;
    }

    public void setParttimeF7 (Double parttimeF7) {
        this.parttimeF7 = parttimeF7;
    }

	@Column(name = "`ONLINE_7`")
	private Double online7;

    public Double getOnline7 () {
        return this.online7;
    }

    public void setOnline7 (Double online7) {
        this.online7 = online7;
    }

	@Column(name = "`OUT_OF_DIST_7`")
	private Double outOfDist7;

    public Double getOutOfDist7 () {
        return this.outOfDist7;
    }

    public void setOutOfDist7 (Double outOfDist7) {
        this.outOfDist7 = outOfDist7;
    }

	@Column(name = "`FTE_NOT_ELIG_7`")
	private Double fteNotElig7;

    public Double getFteNotElig7 () {
        return this.fteNotElig7;
    }

    public void setFteNotElig7 (Double fteNotElig7) {
        this.fteNotElig7 = fteNotElig7;
    }

	@Column(name = "`FTE_ELIG_7`")
	private Double fteElig7;

    public Double getFteElig7 () {
        return this.fteElig7;
    }

    public void setFteElig7 (Double fteElig7) {
        this.fteElig7 = fteElig7;
    }

	@Column(name = "`FUNDED_COUNT_7`")
	private Double fundedCount7;

    public Double getFundedCount7 () {
        return this.fundedCount7;
    }

    public void setFundedCount7 (Double fundedCount7) {
        this.fundedCount7 = fundedCount7;
    }

	@Column(name = "`CDE_MEMBER_8`")
	private Double cdeMember8;

    public Double getCdeMember8 () {
        return this.cdeMember8;
    }

    public void setCdeMember8 (Double cdeMember8) {
        this.cdeMember8 = cdeMember8;
    }

	@Column(name = "`MEMBER_8`")
	private Double member8;

    public Double getMember8 () {
        return this.member8;
    }

    public void setMember8 (Double member8) {
        this.member8 = member8;
    }

	@Column(name = "`PARTTIME_H_8`")
	private Double parttimeH8;

    public Double getParttimeH8 () {
        return this.parttimeH8;
    }

    public void setParttimeH8 (Double parttimeH8) {
        this.parttimeH8 = parttimeH8;
    }

	@Column(name = "`PARTTIME_F_8`")
	private Double parttimeF8;

    public Double getParttimeF8 () {
        return this.parttimeF8;
    }

    public void setParttimeF8 (Double parttimeF8) {
        this.parttimeF8 = parttimeF8;
    }

	@Column(name = "`ONLINE_8`")
	private Double online8;

    public Double getOnline8 () {
        return this.online8;
    }

    public void setOnline8 (Double online8) {
        this.online8 = online8;
    }

	@Column(name = "`OUT_OF_DIST_8`")
	private Double outOfDist8;

    public Double getOutOfDist8 () {
        return this.outOfDist8;
    }

    public void setOutOfDist8 (Double outOfDist8) {
        this.outOfDist8 = outOfDist8;
    }

	@Column(name = "`FTE_NOT_ELIG_8`")
	private Double fteNotElig8;

    public Double getFteNotElig8 () {
        return this.fteNotElig8;
    }

    public void setFteNotElig8 (Double fteNotElig8) {
        this.fteNotElig8 = fteNotElig8;
    }

	@Column(name = "`FTE_ELIG_8`")
	private Double fteElig8;

    public Double getFteElig8 () {
        return this.fteElig8;
    }

    public void setFteElig8 (Double fteElig8) {
        this.fteElig8 = fteElig8;
    }

	@Column(name = "`FUNDED_COUNT_8`")
	private Double fundedCount8;

    public Double getFundedCount8 () {
        return this.fundedCount8;
    }

    public void setFundedCount8 (Double fundedCount8) {
        this.fundedCount8 = fundedCount8;
    }

	@Column(name = "`CDE_MEMBER_9`")
	private Double cdeMember9;

    public Double getCdeMember9 () {
        return this.cdeMember9;
    }

    public void setCdeMember9 (Double cdeMember9) {
        this.cdeMember9 = cdeMember9;
    }

	@Column(name = "`MEMBER_9`")
	private Double member9;

    public Double getMember9 () {
        return this.member9;
    }

    public void setMember9 (Double member9) {
        this.member9 = member9;
    }

	@Column(name = "`PARTTIME_H_9`")
	private Double parttimeH9;

    public Double getParttimeH9 () {
        return this.parttimeH9;
    }

    public void setParttimeH9 (Double parttimeH9) {
        this.parttimeH9 = parttimeH9;
    }

	@Column(name = "`PARTTIME_F_9`")
	private Double parttimeF9;

    public Double getParttimeF9 () {
        return this.parttimeF9;
    }

    public void setParttimeF9 (Double parttimeF9) {
        this.parttimeF9 = parttimeF9;
    }

	@Column(name = "`ONLINE_9`")
	private Double online9;

    public Double getOnline9 () {
        return this.online9;
    }

    public void setOnline9 (Double online9) {
        this.online9 = online9;
    }

	@Column(name = "`OUT_OF_DIST_9`")
	private Double outOfDist9;

    public Double getOutOfDist9 () {
        return this.outOfDist9;
    }

    public void setOutOfDist9 (Double outOfDist9) {
        this.outOfDist9 = outOfDist9;
    }

	@Column(name = "`FTE_NOT_ELIG_9`")
	private Double fteNotElig9;

    public Double getFteNotElig9 () {
        return this.fteNotElig9;
    }

    public void setFteNotElig9 (Double fteNotElig9) {
        this.fteNotElig9 = fteNotElig9;
    }

	@Column(name = "`FTE_ELIG_9`")
	private Double fteElig9;

    public Double getFteElig9 () {
        return this.fteElig9;
    }

    public void setFteElig9 (Double fteElig9) {
        this.fteElig9 = fteElig9;
    }

	@Column(name = "`FUNDED_COUNT_9`")
	private Double fundedCount9;

    public Double getFundedCount9 () {
        return this.fundedCount9;
    }

    public void setFundedCount9 (Double fundedCount9) {
        this.fundedCount9 = fundedCount9;
    }

	@Column(name = "`CDE_MEMBER_10`")
	private Double cdeMember10;

    public Double getCdeMember10 () {
        return this.cdeMember10;
    }

    public void setCdeMember10 (Double cdeMember10) {
        this.cdeMember10 = cdeMember10;
    }

	@Column(name = "`MEMBER_10`")
	private Double member10;

    public Double getMember10 () {
        return this.member10;
    }

    public void setMember10 (Double member10) {
        this.member10 = member10;
    }

	@Column(name = "`PARTTIME_H_10`")
	private Double parttimeH10;

    public Double getParttimeH10 () {
        return this.parttimeH10;
    }

    public void setParttimeH10 (Double parttimeH10) {
        this.parttimeH10 = parttimeH10;
    }

	@Column(name = "`PARTTIME_F_10`")
	private Double parttimeF10;

    public Double getParttimeF10 () {
        return this.parttimeF10;
    }

    public void setParttimeF10 (Double parttimeF10) {
        this.parttimeF10 = parttimeF10;
    }

	@Column(name = "`ONLINE_10`")
	private Double online10;

    public Double getOnline10 () {
        return this.online10;
    }

    public void setOnline10 (Double online10) {
        this.online10 = online10;
    }

	@Column(name = "`OUT_OF_DIST_10`")
	private Double outOfDist10;

    public Double getOutOfDist10 () {
        return this.outOfDist10;
    }

    public void setOutOfDist10 (Double outOfDist10) {
        this.outOfDist10 = outOfDist10;
    }

	@Column(name = "`FTE_NOT_ELIG_10`")
	private Double fteNotElig10;

    public Double getFteNotElig10 () {
        return this.fteNotElig10;
    }

    public void setFteNotElig10 (Double fteNotElig10) {
        this.fteNotElig10 = fteNotElig10;
    }

	@Column(name = "`FTE_ELIG_10`")
	private Double fteElig10;

    public Double getFteElig10 () {
        return this.fteElig10;
    }

    public void setFteElig10 (Double fteElig10) {
        this.fteElig10 = fteElig10;
    }

	@Column(name = "`FUNDED_COUNT_10`")
	private Double fundedCount10;

    public Double getFundedCount10 () {
        return this.fundedCount10;
    }

    public void setFundedCount10 (Double fundedCount10) {
        this.fundedCount10 = fundedCount10;
    }

	@Column(name = "`CDE_MEMBER_11`")
	private Double cdeMember11;

    public Double getCdeMember11 () {
        return this.cdeMember11;
    }

    public void setCdeMember11 (Double cdeMember11) {
        this.cdeMember11 = cdeMember11;
    }

	@Column(name = "`MEMBER_11`")
	private Double member11;

    public Double getMember11 () {
        return this.member11;
    }

    public void setMember11 (Double member11) {
        this.member11 = member11;
    }

	@Column(name = "`PARTTIME_H_11`")
	private Double parttimeH11;

    public Double getParttimeH11 () {
        return this.parttimeH11;
    }

    public void setParttimeH11 (Double parttimeH11) {
        this.parttimeH11 = parttimeH11;
    }

	@Column(name = "`PARTTIME_F_11`")
	private Double parttimeF11;

    public Double getParttimeF11 () {
        return this.parttimeF11;
    }

    public void setParttimeF11 (Double parttimeF11) {
        this.parttimeF11 = parttimeF11;
    }

	@Column(name = "`ONLINE_11`")
	private Double online11;

    public Double getOnline11 () {
        return this.online11;
    }

    public void setOnline11 (Double online11) {
        this.online11 = online11;
    }

	@Column(name = "`OUT_OF_DIST_11`")
	private Double outOfDist11;

    public Double getOutOfDist11 () {
        return this.outOfDist11;
    }

    public void setOutOfDist11 (Double outOfDist11) {
        this.outOfDist11 = outOfDist11;
    }

	@Column(name = "`FTE_NOT_ELIG_11`")
	private Double fteNotElig11;

    public Double getFteNotElig11 () {
        return this.fteNotElig11;
    }

    public void setFteNotElig11 (Double fteNotElig11) {
        this.fteNotElig11 = fteNotElig11;
    }

	@Column(name = "`FTE_ELIG_11`")
	private Double fteElig11;

    public Double getFteElig11 () {
        return this.fteElig11;
    }

    public void setFteElig11 (Double fteElig11) {
        this.fteElig11 = fteElig11;
    }

	@Column(name = "`FUNDED_COUNT_11`")
	private Double fundedCount11;

    public Double getFundedCount11 () {
        return this.fundedCount11;
    }

    public void setFundedCount11 (Double fundedCount11) {
        this.fundedCount11 = fundedCount11;
    }

	@Column(name = "`CDE_MEMBER_12`")
	private Double cdeMember12;

    public Double getCdeMember12 () {
        return this.cdeMember12;
    }

    public void setCdeMember12 (Double cdeMember12) {
        this.cdeMember12 = cdeMember12;
    }

	@Column(name = "`MEMBER_12`")
	private Double member12;

    public Double getMember12 () {
        return this.member12;
    }

    public void setMember12 (Double member12) {
        this.member12 = member12;
    }

	@Column(name = "`PARTTIME_H_12`")
	private Double parttimeH12;

    public Double getParttimeH12 () {
        return this.parttimeH12;
    }

    public void setParttimeH12 (Double parttimeH12) {
        this.parttimeH12 = parttimeH12;
    }

	@Column(name = "`PARTTIME_F_12`")
	private Double parttimeF12;

    public Double getParttimeF12 () {
        return this.parttimeF12;
    }

    public void setParttimeF12 (Double parttimeF12) {
        this.parttimeF12 = parttimeF12;
    }

	@Column(name = "`ONLINE_12`")
	private Double online12;

    public Double getOnline12 () {
        return this.online12;
    }

    public void setOnline12 (Double online12) {
        this.online12 = online12;
    }

	@Column(name = "`OUT_OF_DIST_12`")
	private Double outOfDist12;

    public Double getOutOfDist12 () {
        return this.outOfDist12;
    }

    public void setOutOfDist12 (Double outOfDist12) {
        this.outOfDist12 = outOfDist12;
    }

	@Column(name = "`FTE_NOT_ELIG_12`")
	private Double fteNotElig12;

    public Double getFteNotElig12 () {
        return this.fteNotElig12;
    }

    public void setFteNotElig12 (Double fteNotElig12) {
        this.fteNotElig12 = fteNotElig12;
    }

	@Column(name = "`FTE_ELIG_12`")
	private Double fteElig12;

    public Double getFteElig12 () {
        return this.fteElig12;
    }

    public void setFteElig12 (Double fteElig12) {
        this.fteElig12 = fteElig12;
    }

	@Column(name = "`FUNDED_COUNT_12`")
	private Double fundedCount12;

    public Double getFundedCount12 () {
        return this.fundedCount12;
    }

    public void setFundedCount12 (Double fundedCount12) {
        this.fundedCount12 = fundedCount12;
    }

	@Column(name = "`CDE_MEMBER_TOT`")
	private Double cdeMemberTot;

    public Double getCdeMemberTot () {
        return this.cdeMemberTot;
    }

    public void setCdeMemberTot (Double cdeMemberTot) {
        this.cdeMemberTot = cdeMemberTot;
    }

	@Column(name = "`MEMBER_TOT`")
	private Double memberTot;

    public Double getMemberTot () {
        return this.memberTot;
    }

    public void setMemberTot (Double memberTot) {
        this.memberTot = memberTot;
    }

	@Column(name = "`PARTTIME_H_TOT`")
	private Double parttimeHTot;

    public Double getParttimeHTot () {
        return this.parttimeHTot;
    }

    public void setParttimeHTot (Double parttimeHTot) {
        this.parttimeHTot = parttimeHTot;
    }

	@Column(name = "`PARTTIME_F_TOT`")
	private Double parttimeFTot;

    public Double getParttimeFTot () {
        return this.parttimeFTot;
    }

    public void setParttimeFTot (Double parttimeFTot) {
        this.parttimeFTot = parttimeFTot;
    }

	@Column(name = "`OUT_OF_DIST_TOT`")
	private Double outOfDistTot;

    public Double getOutOfDistTot () {
        return this.outOfDistTot;
    }

    public void setOutOfDistTot (Double outOfDistTot) {
        this.outOfDistTot = outOfDistTot;
    }

	@Column(name = "`ONLINE_TOT`")
	private Double onlineTot;

    public Double getOnlineTot () {
        return this.onlineTot;
    }

    public void setOnlineTot (Double onlineTot) {
        this.onlineTot = onlineTot;
    }

	@Column(name = "`FTE_NOT_ELIG_TOT`")
	private Double fteNotEligTot;

    public Double getFteNotEligTot () {
        return this.fteNotEligTot;
    }

    public void setFteNotEligTot (Double fteNotEligTot) {
        this.fteNotEligTot = fteNotEligTot;
    }

	@Column(name = "`FTE_ELIG_TOT`")
	private Double fteEligTot;

    public Double getFteEligTot () {
        return this.fteEligTot;
    }

    public void setFteEligTot (Double fteEligTot) {
        this.fteEligTot = fteEligTot;
    }

	@Column(name = "`FUNDED_COUNT_TOT`")
	private Double fundedCountTot;

    public Double getFundedCountTot () {
        return this.fundedCountTot;
    }

    public void setFundedCountTot (Double fundedCountTot) {
        this.fundedCountTot = fundedCountTot;
    }

	@Column(name = "`ASCENT_TOT`")
	private Double ascentTot;

    public Double getAscentTot () {
        return this.ascentTot;
    }

    public void setAscentTot (Double ascentTot) {
        this.ascentTot = ascentTot;
    }

	@Column(name = "`FISCAL_YEAR`")
	private String fiscalYear;

    public String getFiscalYear () {
        return this.fiscalYear;
    }

    public void setFiscalYear (String fiscalYear) {
        this.fiscalYear = fiscalYear;
    }

	@Column(name = "`OUT_OF_DIST_K`")
	private Double outOfDistK;

    public Double getOutOfDistK () {
        return this.outOfDistK;
    }

    public void setOutOfDistK (Double outOfDistK) {
        this.outOfDistK = outOfDistK;
    }

	@Column(name = "`OUT_OF_DIST_CPP`")
	private Double outOfDistCpp;

    public Double getOutOfDistCpp () {
        return this.outOfDistCpp;
    }

    public void setOutOfDistCpp (Double outOfDistCpp) {
        this.outOfDistCpp = outOfDistCpp;
    }

	@Column(name = "`OUT_OF_DIST_PS`")
	private Double outOfDistPs;

    public Double getOutOfDistPs () {
        return this.outOfDistPs;
    }

    public void setOutOfDistPs (Double outOfDistPs) {
        this.outOfDistPs = outOfDistPs;
    }

}