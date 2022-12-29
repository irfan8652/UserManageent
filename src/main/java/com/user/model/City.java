package com.user.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="CITIES_MASTER")
public class City {	
	@Id
	@GeneratedValue
	private Integer cityId;
	private String cityName;
	private Integer stateId;
}
