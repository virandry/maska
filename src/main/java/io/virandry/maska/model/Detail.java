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
 * Detail generated by hbm2java
 */
@Entity
@Table(name = "detail", catalog = "aivindb")
public class Detail implements java.io.Serializable {

	private String detailId;
	private String detailName;
	private String modifiedBy;
	private Date modifiedTime;
	private int isActive;

	public Detail() {
	}

	public Detail(String detailId, String detailName, String modifiedBy, Date modifiedTime, int isActive) {
		this.detailId = detailId;
		this.detailName = detailName;
		this.modifiedBy = modifiedBy;
		this.modifiedTime = modifiedTime;
		this.isActive = isActive;
	}

	@Id
	@Column(name = "detail_id", unique = true, nullable = false, length = 10)
	public String getDetailId() {
		return this.detailId;
	}

	public void setDetailId(String detailId) {
		this.detailId = detailId;
	}

	@Column(name = "detail_name", nullable = false, length = 100)
	public String getDetailName() {
		return this.detailName;
	}

	public void setDetailName(String detailName) {
		this.detailName = detailName;
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