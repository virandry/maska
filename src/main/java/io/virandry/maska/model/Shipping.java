package io.virandry.maska.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "shipping", catalog = "aivindb")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler", "modifiedBy", "modifiedTime" })
public class Shipping implements java.io.Serializable {

	private Integer shippingId;
	private String addressLineOne;
	private String addressLineTwo;
	private String city;
	private String stateProvinceRegion;
	private String postcode;
	private Country country;
	private String phoneNo;
	private String modifiedBy;
	private Date modifiedTime;
	private int isActive;

	public Shipping() {
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "shipping_id", unique = true, nullable = false)
	public Integer getShippingId() {
		return this.shippingId;
	}

	public void setShippingId(Integer shippingId) {
		this.shippingId = shippingId;
	}

	@Column(name = "address_line_one", nullable = false, length = 500)
	public String getAddressLineOne() {
		return this.addressLineOne;
	}

	public void setAddressLineOne(String addressLineOne) {
		this.addressLineOne = addressLineOne;
	}

	@Column(name = "address_line_two", length = 500)
	public String getAddressLineTwo() {
		return this.addressLineTwo;
	}

	public void setAddressLineTwo(String addressLineTwo) {
		this.addressLineTwo = addressLineTwo;
	}

	@Column(name = "city", length = 100)
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "state_province_region", length = 100)
	public String getStateProvinceRegion() {
		return this.stateProvinceRegion;
	}

	public void setStateProvinceRegion(String stateProvinceRegion) {
		this.stateProvinceRegion = stateProvinceRegion;
	}

	@Column(name = "postcode", nullable = false, length = 10)
	public String getPostcode() {
		return this.postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	@Column(name = "phone_no", nullable = false, length = 20)
	public String getPhoneNo() {
		return this.phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
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
	@JoinColumn(name = "country_id", nullable = false)
	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

}
