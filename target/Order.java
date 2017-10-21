// default package
// Generated Oct 21, 2017 10:46:30 AM by Hibernate Tools 5.2.5.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Order generated by hbm2java
 */
@Entity
@Table(name = "order", catalog = "aivindb")
public class Order implements java.io.Serializable {

	private Integer orderId;
	private String currencyId;
	private long priceTotal;
	private int shippingId;
	private String notes;
	private int orderStatusId;
	private String modifiedBy;
	private Date modifiedTime;
	private int isActive;

	public Order() {
	}

	public Order(String currencyId, long priceTotal, int shippingId, String notes, int orderStatusId, String modifiedBy,
			Date modifiedTime, int isActive) {
		this.currencyId = currencyId;
		this.priceTotal = priceTotal;
		this.shippingId = shippingId;
		this.notes = notes;
		this.orderStatusId = orderStatusId;
		this.modifiedBy = modifiedBy;
		this.modifiedTime = modifiedTime;
		this.isActive = isActive;
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

	@Column(name = "currency_id", nullable = false, length = 10)
	public String getCurrencyId() {
		return this.currencyId;
	}

	public void setCurrencyId(String currencyId) {
		this.currencyId = currencyId;
	}

	@Column(name = "price_total", nullable = false)
	public long getPriceTotal() {
		return this.priceTotal;
	}

	public void setPriceTotal(long priceTotal) {
		this.priceTotal = priceTotal;
	}

	@Column(name = "shipping_id", nullable = false)
	public int getShippingId() {
		return this.shippingId;
	}

	public void setShippingId(int shippingId) {
		this.shippingId = shippingId;
	}

	@Column(name = "notes", nullable = false, length = 500)
	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	@Column(name = "order_status_id", nullable = false)
	public int getOrderStatusId() {
		return this.orderStatusId;
	}

	public void setOrderStatusId(int orderStatusId) {
		this.orderStatusId = orderStatusId;
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

}