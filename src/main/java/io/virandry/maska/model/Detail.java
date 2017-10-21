package io.virandry.maska.model;


// default package
// Generated Oct 16, 2017 9:41:25 PM by Hibernate Tools 5.2.5.Final

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Detail generated by hbm2java
 */
@Entity
@Table(name = "detail", catalog = "aivindb")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler", "modifiedBy", "modifiedTime" })
public class Detail implements java.io.Serializable {

	private String detailId;
	private String detailName;
	private String modifiedBy;
	private Date modifiedTime;
	private int isActive;
	@JsonIgnore
	private List<Subdetail> subdetails;

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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "detail")
	public List<Subdetail> getSubdetails() {
		return subdetails;
	}

	public void setSubdetails(List<Subdetail> subdetails) {
		this.subdetails = subdetails;
	}

}
