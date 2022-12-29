package com.user.model;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class LoginForm {
	private String email;
	private String password;
}
