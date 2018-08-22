package com.example.demo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity(name = "INCOME")
public class Income implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "PAYER_NAME")
	private String payerName;
	
	@Column(name = "PAY_DATE")
	private Date payDate;

	@Column(name = "INCOME_DESCRIPTION")
	private IncomeType description;

	@Column(name = "AMOUNT")
	private int amount;

	public enum IncomeType {
		CUSTOMER_PURCHASE, COMPANY_NEW_COUPON, COMPANY_UPDATE_COUPON
	}
	
	public Income() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPayerName() {
		return payerName;
	}

	public void setPayerName(String companyName) {
		this.payerName = companyName;
	}

	public Date getPayDate() {
		return payDate;
	}

	public void setPayDate(Date payDate) {
		this.payDate = payDate;
	}

	public IncomeType getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = IncomeType.valueOf(description);
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	

}
