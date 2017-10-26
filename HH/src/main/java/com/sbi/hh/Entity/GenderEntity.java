package com.sbi.hh.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="genderM")
public class GenderEntity {

	@Id
	@GeneratedValue
	private Integer id;
	
	private String name;
	
	private String code;
}
