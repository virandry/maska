package io.virandry.maska.model;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "order", catalog = "aivindb")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler", "modifiedBy", "modifiedTime" })
public class Order implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer orderId;

	private Currency currency;
	private BigInteger priceTotal;
	private Shipping shipping;
	private String notes;
	private Orderstatus orderstatus;
	private String modifiedBy;
	private Date modifiedTime;
	private int isActive;

	@JsonIgnore
	private List<Orderdetail> orderdetails;

	public Order() {
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "order_id", unique = true, nullable = false)
	public Integer getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	@Column(name = "price_total", nullable = false)
	public BigInteger getPriceTotal() {
		return this.priceTotal;
	}

	public void setPriceTotal(BigInteger priceTotal) {
		this.priceTotal = priceTotal;
	}

	@Column(name = "notes", nullable = false, length = 500)
	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	@Column(name = "modified_by", nullable = false, length = 100)
	public String getModifiedBy() {
		return this.modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "modified_time", nullable = false, length = 19)
	public Date getModifiedTime() {
		return this.modifiedTime;
	}

	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	@Column(name = "is_active", nullable = false)
	public int getIsActive() {
		return this.isActive;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "currency_id", nullable = false)
	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "order_status_id", nullable = false)
	public Orderstatus getOrderstatus() {
		return orderstatus;
	}

	public void setOrderstatus(Orderstatus orderstatus) {
		this.orderstatus = orderstatus;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "order")
	public List<Orderdetail> getOrderdetails() {
		return orderdetails;
	}

	public void setOrderdetails(List<Orderdetail> orderdetails) {
		this.orderdetails = orderdetails;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "shipping_id", nullable = false)
	public Shipping getShipping() {
		return shipping;
	}

	public void setShipping(Shipping shipping) {
		this.shipping = shipping;
	}

}
