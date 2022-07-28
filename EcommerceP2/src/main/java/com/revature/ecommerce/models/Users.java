package com.revature.ecommerce.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Users {
	private int user_id;
	private String fname;
	private String lname;
	private String email;
	private String phoneNum;
	private String userName;
	private String password;
}
