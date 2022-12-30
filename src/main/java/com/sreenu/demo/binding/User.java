package com.sreenu.demo.binding;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="User_Details")
public class User {
	@Id
	private Integer userId;
	private String fName;
	private String lName;
	private String email;
	private Long phno;
	private String dob;
	private String gender;
	private Integer country;
	private Integer states;
	private Integer cities;
	private String userPwd;
	private String accStatus;
	

	
}
