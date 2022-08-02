package com.revature.ecommerce.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Users {
	@Id
	@GeneratedValue
	private int user_id;
	private String fName;
	private String lName;
	private String email;
	private String phoneNum;
	private String userName;
	private String password;
	
	public Users(String fName, String lName, String email, String phoneNum, String userName,
			String password) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.phoneNum = phoneNum;
		this.userName = userName;
		this.password = password;
	}
	
	
	
}
