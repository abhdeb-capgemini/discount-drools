package com.drools.droolpoc;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class InitialInputs implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String cardBankName;
	private java.lang.Double productPrice;

	public InitialInputs() {
	}

	public java.lang.String getCardBankName() {
		return this.cardBankName;
	}

	public void setCardBankName(java.lang.String cardBankName) {
		this.cardBankName = cardBankName;
	}

	public java.lang.Double getProductPrice() {
		return this.productPrice;
	}

	public void setProductPrice(java.lang.Double productPrice) {
		this.productPrice = productPrice;
	}

	public InitialInputs(java.lang.String cardBankName,
			java.lang.Double productPrice) {
		this.cardBankName = cardBankName;
		this.productPrice = productPrice;
	}

}