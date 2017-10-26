package com.sbi.hh.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="titleM")
public class TitleEntity {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private String name;
	
	private String code;
	
	

}
