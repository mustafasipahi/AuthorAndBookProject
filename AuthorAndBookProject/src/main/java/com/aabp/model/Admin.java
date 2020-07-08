package com.aabp.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Admin {

	@Column(name = "admin_name")
	private String adminName;
	
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	
	public String getAdminName() {
		return adminName;
	}
}
