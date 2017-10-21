package io.virandry.maska.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "orderstatus", catalog = "aivindb")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler", "modifiedBy", "modifiedTime" })
public class Orderstatus implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer orderStatusId;
	private String orderStatusName;
	private String modifiedBy;
	private Date modifiedTime;
	private int isActive;
	
	@JsonIgnore
	private List<Order> orders;

	public Orderstatus() {
	}

	public Orderstatus(String orderStatusName, String modifiedBy, Date modifiedTime, int isActive) {
		this.orderStatusName = orderStatusName;
		this.modifiedBy = modifiedBy;
		this.modifiedTime = modifiedTime;
		this.isActive = isActive;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "order_status_id", unique = true, nullable = false)
	public Integer getOrderStatusId() {
		return this.orderStatusId;
	}

	public void setOrderStatusId(Integer orderStatusId) {
		this.orderStatusId = orderStatusId;
	}

	@Column(name = "order_status_name", nullable = false, length = 500)
	public String getOrderStatusName() {
		return this.orderStatusName;
	}

	public void setOrderStatusName(String orderStatusName) {
		this.orderStatusName = orderStatusName;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "orderstatus")
	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

}
