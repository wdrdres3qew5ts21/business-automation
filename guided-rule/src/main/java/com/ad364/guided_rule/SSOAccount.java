package com.ad364.guided_rule;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class SSOAccount implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String id;
	private java.lang.Boolean isNew;

	public SSOAccount() {
	}

	public java.lang.String getId() {
		return this.id;
	}

	public void setId(java.lang.String id) {
		this.id = id;
	}

	public java.lang.Boolean getIsNew() {
		return this.isNew;
	}

	public void setIsNew(java.lang.Boolean isNew) {
		this.isNew = isNew;
	}

	public SSOAccount(java.lang.String id, java.lang.Boolean isNew) {
		this.id = id;
		this.isNew = isNew;
	}

}