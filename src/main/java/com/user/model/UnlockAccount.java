package com.user.model;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class UnlockAccount {
	private String temPassword;
	private String chooseNewPassword;
	private String confirmedPassword;
}
