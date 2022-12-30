package com.sreenu.demo.binding;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="States_List")
public class States {

	@Id
	private Integer statesId;
	private String statesName;
	private Integer countryId;
}
