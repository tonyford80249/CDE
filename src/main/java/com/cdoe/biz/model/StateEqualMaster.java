/**
 * 
 */
package com.cdoe.biz.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * This class maps to the STATE_EQUAL_MASTER table
 * 
 * @author dyn-8
 *
 */
@Entity
@Table(name="STATE_EQUAL_MASTER")
public class StateEqualMaster implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column(name="ELEMENT_NAME")
	private String elementName;
	@Column(name="ELEMENT_VALUE")
	private String elementValue;
	@Column(name="GROUP_NAME")
	private String groupName;
	private String active;
	private Long version;

	/**
	 * Default constructor
	 */
	public StateEqualMaster() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getElementName() {
		return elementName;
	}

	public void setElementName(String elementName) {
		this.elementName = elementName;
	}

	public String getElementValue() {
		return elementValue;
	}

	public void setElementValue(String elementValue) {
		this.elementValue = elementValue;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	
}
