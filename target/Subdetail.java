// default package
// Generated Oct 21, 2017 10:46:30 AM by Hibernate Tools 5.2.5.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Subdetail generated by hbm2java
 */
@Entity
@Table(name = "subdetail", catalog = "aivindb")
public class Subdetail implements java.io.Serializable {

	private String subDetailId;
	private Detail detail;
	private Product product;
	private String subDetailName;
	private String modifiedBy;
	private Date modifiedTime;
	private int isActive;

	public Subdetail() {
	}

	public Subdetail(String subDetailId, Detail detail, Product product, String subDetailName, String modifiedBy,
			Date modifiedTime, int isActive) {
		this.subDetailId = subDetailId;
		this.detail = detail;
		this.product = product;
		this.subDetailName = subDetailName;
		this.modifiedBy = modifiedBy;
		this.modifiedTime = modifiedTime;
		this.isActive = isActive;
	}

	@Id

	@Column(name = "sub_detail_id", unique = true, nullable = false, length = 10)
	public String getSubDetailId() {
		return this.subDetailId;
	}

	public void setSubDetailId(String subDetailId) {
		this.subDetailId = subDetailId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "detail_id", nullable = false)
	public Detail getDetail() {
		return this.detail;
	}

	public void setDetail(Detail detail) {
		this.detail = detail;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "product_id", nullable = false)
	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Column(name = "sub_detail_name", nullable = false, length = 100)
	public String getSubDetailName() {
		return this.subDetailName;
	}

	public void setSubDetailName(String subDetailName) {
		this.subDetailName = subDetailName;
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