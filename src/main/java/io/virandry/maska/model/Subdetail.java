package io.virandry.maska.model;


// default package
// Generated Oct 16, 2017 9:41:25 PM by Hibernate Tools 5.2.5.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Subdetail generated by hbm2java
 */
@Entity
@Table(name = "subdetail", catalog = "aivindb")
public class Subdetail implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String subDetailId;
	private String subDetailName;
	private String detailId;
	private int productId;
	private String modifiedBy;
	private Date modifiedTime;
	private int isActive;

	public Subdetail() {
	}

	public Subdetail(String subDetailId, String subDetailName, String detailId, int productId, String modifiedBy,
			Date modifiedTime, int isActive) {
		this.subDetailId = subDetailId;
		this.subDetailName = subDetailName;
		this.detailId = detailId;
		this.productId = productId;
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

	@Column(name = "sub_detail_name", nullable = false, length = 100)
	public String getSubDetailName() {
		return this.subDetailName;
	}

	public void setSubDetailName(String subDetailName) {
		this.subDetailName = subDetailName;
	}

	@Column(name = "detail_id", nullable = false, length = 10)
	public String getDetailId() {
		return this.detailId;
	}

	public void setDetailId(String detailId) {
		this.detailId = detailId;
	}

	@Column(name = "product_id", nullable = false)
	public int getProductId() {
		return this.productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
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