package com.sbi.hh.Entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="HHPassport")
public class HHPassportEntity {

	@Id
	@GeneratedValue
	private Integer id;
	
	private  String passNo;
	
	private  Date issue;
	
	private Date expiry;
	
	private String issuedAt;
	
}
