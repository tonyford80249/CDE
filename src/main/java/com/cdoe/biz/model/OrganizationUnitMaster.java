
package com.cdoe.biz.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.Immutable;
import org.hibernate.annotations.Where;

@XmlRootElement
@Entity
@Table(name = "ORGANIZATION_UNIT_MASTER", schema="DEVDETAILMGR")
@Immutable
@Where(clause="organization_unit_type = 'DISTRICT'")
public class OrganizationUnitMaster implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "ORGANIZATION_CODE")
	private String organizationCode;
	@Column(name = "ORGANIZATION_NAME")
	private String organizationName;
	@Column(name = "ORGANIZATION_UNIT_TYPE")
	private String organizationUnitType;

    public OrganizationUnitMaster() {
		super();
	}

	public String getOrganizationCode () {
        return this.organizationCode;
    }

    public void setOrganizationCode (String organizationCode) {
        this.organizationCode = organizationCode;
    }

    public String getOrganizationName () {
        return this.organizationName;
    }

    public void setOrganizationName (String organizationName) {
        this.organizationName = organizationName;
    }

	public String getOrganizationUnitType() {
		return organizationUnitType;
	}

	public void setOrganizationUnitType(String organizationUnitType) {
		this.organizationUnitType = organizationUnitType;
	}

}