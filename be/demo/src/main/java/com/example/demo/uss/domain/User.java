package com.example.demo.uss.domain;

import javax.persistence.*;


@Entity
@Table(name="users")
public class User {
	
	@Id
	@GeneratedValue
	@Column(name="user_no")
	private long userNo;
	
	@Column(name="user_id")
	private String userId;
	
	@Column(name="password")
	private String password;
	
	@Column(name="user_name")
	private String userName;
	
	@Column(name="email")
	private String email;
}