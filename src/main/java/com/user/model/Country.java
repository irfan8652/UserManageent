package com.user.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="COUNTRY_MASTER")
public class Country {
	@Id
	@GeneratedValue
	private Integer countryId;
	private String countryName;
}
