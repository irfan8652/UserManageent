package com.user.model;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class ForgotPassword {
	private String email;
}
