package org.letsupgrade.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="user_info")
public class User {

	@Id
	@Column(name="user_id")
	private Long userId;
	private String fullName;
	private LocalDate dob;
	private String mobile;
	private String email;
	private String password;
	private LocalDateTime createDate;
	private LocalDateTime updateDate;
	
	
	
	public User() {
		super();
	}
	public User(Long id, String fullName, LocalDate dob, String mobile, String email, String password,
			LocalDateTime createDate, LocalDateTime updateDate) {
		super();
		this.userId = id;
		this.fullName = fullName;
		this.dob = dob;
		this.mobile = mobile;
		this.email = email;
		this.password = password;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}
	
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LocalDateTime getCreateDate() {
		return createDate;
	}
	public void setCreateDate(LocalDateTime createDate) {
		this.createDate = createDate;
	}
	public LocalDateTime getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(LocalDateTime updateDate) {
		this.updateDate = updateDate;
	}

}
