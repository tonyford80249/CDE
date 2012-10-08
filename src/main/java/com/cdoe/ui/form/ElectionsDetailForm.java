
/*
 * Copyright ResQSoft, Inc. 2011
 */
package com.cdoe.ui.form;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import com.cdoe.ui.form.grid.*;

/**
 * Java bean object representing a business entity which will be used by Spring Form
 * to pass data to and from the view, controller, and service layer.
 * 
 * @author ResQSoft, Inc. (ResQSoft Engineer)
 */
public class ElectionsDetailForm {

	private long id;
	
    public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	private Long districtCode;
	
	public Long getDistrictCode () {
        return this.districtCode;
    }
	
	private String districtName;
	

    public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public void setDistrictCode (Long districtCode) {
        this.districtCode = districtCode;
    }
	private String electionType;
	
	public String getElectionType () {
        return this.electionType;
    }

    public void setElectionType (String electionType) {
        this.electionType = electionType;
    }
	private String electionHeldStatus;
	
	public String getElectionHeldStatus () {
        return this.electionHeldStatus;
    }

    public void setElectionHeldStatus (String electionHeldStatus) {
        this.electionHeldStatus = electionHeldStatus;
    }
	private String for0;
	
	public String getFor0 () {
        return this.for0;
    }

    public void setFor0 (String for0) {
        this.for0 = for0;
    }
	private String against;
	
	public String getAgainst () {
        return this.against;
    }

    public void setAgainst (String against) {
        this.against = against;
    }
}