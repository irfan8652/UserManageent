package com.user.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
@Entity
@Table(name="REGISTRATION_INFO")
public class UserManagement {
	@Id
	@GeneratedValue
	private Integer id;
	@NotEmpty
	@Column(name="FIRST_NAME")
	private String fName;
	@NotEmpty
	@Column(name="LAST_NAME")
	private String lName;
	@Email
	@Column(name = "EMAIL", nullable = false, unique = true)
	@NotEmpty
	private String email;
	@Column(name = "PHONE", nullable = false, unique = true)
	@NotEmpty
	private Long phone;
	@NotEmpty
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name="DATE_OF_BIRTH")
	private Date birthDate;
	@NotEmpty
	@Column(name="GENDER")
	private String gender;
	@NotEmpty
	@Column(name="COUNTRY")
	private Integer country;
	@NotEmpty
	@Column(name="STATE")
	private Integer state;
	@Column(name="CITY")
	@NotEmpty
	private  Integer city;
	@Column(name="password")
	@NotEmpty
	private String password;
	@Column(name="status")
	private String status;
	
}
