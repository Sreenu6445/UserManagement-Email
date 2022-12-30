package com.sreenu.demo.binding;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Country_List")
public class Country {
	
	@Id
	private Integer countryId;
	private String countryName;
}
