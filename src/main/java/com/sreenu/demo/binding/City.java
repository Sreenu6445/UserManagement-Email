package com.sreenu.demo.binding;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="City_List")
public class City {
	@Id
	private Integer cityId;
	private String cityName;
	private Integer statesId;

}
