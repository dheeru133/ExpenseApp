/**
 * @Author MY
 * @version: 1.0
 * @project: springBootDefaultTemplate
 * @description : Spring Template project.
 * 
 * @file: ExpenseEntity.java
 * @Date : Jul 12, 2018:2018:6:12:32 PM
 * @Updates : Jul 12, 2018:2018:6:12:32 PM
 **/
package com.myApp.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Table;

import com.myApp.entity.EntityListener.Trim;

// TODO: Auto-generated Javadoc
/*** The Class CC_DETAILS_EXCEP_Entity. */

@Entity
@EntityListeners({EntityListeners.class})
@Table(name = "ExpenseEntity")
public class ExpenseEntity implements Serializable {

	/** Serial ID. */
	private static final long	serialVersionUID	= 1L;

	/** The last maint ts. */
	@Id
	@Column(name = "LAST_MAINT_TS", columnDefinition = "TIMESTAMP")
	private Timestamp			last_maint_ts;

	/** The invoices num. */
	@Column(name = "Amount", columnDefinition = "DECIMAL")
	private BigDecimal			amount;

	@Column(name = "Date", columnDefinition = "TIMESTAMP")
	private Timestamp			Date;

	@Trim
	@Column(name = "Description", columnDefinition = "CHAR")
	private String				description;

	/** The item description. */
	@Trim
	@Column(name = "ItemDescription", columnDefinition = "CHAR")
	private String				itemDescription;

	/**
	 * @return the last_maint_ts
	 */
	public Timestamp getLast_maint_ts() {
		return last_maint_ts;
	}

	/**
	 * @param last_maint_ts
	 *        the last_maint_ts to set
	 */
	public void setLast_maint_ts(Timestamp last_maint_ts) {
		this.last_maint_ts = last_maint_ts;
	}

	/**
	 * @return the amount
	 */
	public BigDecimal getAmount() {
		return amount;
	}

	/**
	 * @param amount
	 *        the amount to set
	 */
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	/**
	 * @return the date
	 */
	public Timestamp getDate() {
		return Date;
	}

	/**
	 * @param date
	 *        the date to set
	 */
	public void setDate(Timestamp date) {
		Date = date;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *        the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the itemDescription
	 */
	public String getItemDescription() {
		return itemDescription;
	}

	/**
	 * @param itemDescription
	 *        the itemDescription to set
	 */
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	/**
	 * Gets the serialversionuid.
	 *
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
