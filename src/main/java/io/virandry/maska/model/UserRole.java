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

/**
 * UserRole generated by hbm2java
 */
@Entity
@Table(name = "user_role", catalog = "aivindb")
public class UserRole implements java.io.Serializable {

	private int roleId;
	private String roleName;
	private String roleScope;
	private String modifiedBy;
	private Date modifiedTime;
	private int isActive;
	@JsonIgnore
	private List<Userauth> userAuths;

	public UserRole() {
	}

	public UserRole(int roleId, String roleName, String roleScope, String modifiedBy, Date modifiedTime, int isActive) {
		this.roleId = roleId;
		this.roleName = roleName;
		this.roleScope = roleScope;
		this.modifiedBy = modifiedBy;
		this.modifiedTime = modifiedTime;
		this.isActive = isActive;
	}

	@Id

	@Column(name = "role_id", unique = true, nullable = false)
	public int getRoleId() {
		return this.roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	@Column(name = "role_name", nullable = false, length = 100)
	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	@Column(name = "role_scope", nullable = false, length = 100)
	public String getRoleScope() {
		return this.roleScope;
	}

	public void setRoleScope(String roleScope) {
		this.roleScope = roleScope;
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
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userRole")
	public List<Userauth> getUserAuths() {
		return userAuths;
	}

	public void setUserAuths(List<Userauth> userAuths) {
		this.userAuths = userAuths;
	}

}
