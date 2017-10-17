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
 * Userauth generated by hbm2java
 */
@Entity
@Table(name = "userauth", catalog = "aivindb")
public class Userauth implements java.io.Serializable {

	private int username;
	private String firstname;
	private String lastname;
	private int roleId;
	private String userPassword;
	private String modifiedBy;
	private Date modifiedTime;
	private int isActive;

	public Userauth() {
	}

	public Userauth(int username, String firstname, String lastname, int roleId, String userPassword, String modifiedBy,
			Date modifiedTime, int isActive) {
		this.username = username;
		this.firstname = firstname;
		this.lastname = lastname;
		this.roleId = roleId;
		this.userPassword = userPassword;
		this.modifiedBy = modifiedBy;
		this.modifiedTime = modifiedTime;
		this.isActive = isActive;
	}

	@Id

	@Column(name = "username", unique = true, nullable = false)
	public int getUsername() {
		return this.username;
	}

	public void setUsername(int username) {
		this.username = username;
	}

	@Column(name = "firstname", nullable = false, length = 100)
	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	@Column(name = "lastname", nullable = false, length = 100)
	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Column(name = "role_id", nullable = false)
	public int getRoleId() {
		return this.roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	@Column(name = "user_password", nullable = false, length = 500)
	public String getUserPassword() {
		return this.userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
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