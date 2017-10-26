package com.sbi.hh.Entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="HHPersonDetails")
public class HHPersonDetailsEntity {

	@Id
	@GeneratedValue
	private Integer id;
	
	private String firstName;
	
	private String middleName;
	
	private String lastName;
	
	private Date dob;
	
	private Date joining;
	
	private String spouseName;
	
	@ManyToOne
	@JoinColumn(name="tid")
	private TitleEntity title;
	
	@ManyToOne
	@JoinColumn(name="gid")
	private  GenderEntity gender;
	
	@ManyToOne
	@JoinColumn(name="nid")
	private NationalityEntity nationality;
	
	@ManyToOne
	@JoinColumn(name="sid")
	private HHPassportEntity status;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Date getJoining() {
		return joining;
	}

	public void setJoining(Date joining) {
		this.joining = joining;
	}

	public String getSpouseName() {
		return spouseName;
	}

	public void setSpouseName(String spouseName) {
		this.spouseName = spouseName;
	}

	public TitleEntity getTitle() {
		return title;
	}

	public void setTitle(TitleEntity title) {
		this.title = title;
	}

	public GenderEntity getGender() {
		return gender;
	}

	public void setGender(GenderEntity gender) {
		this.gender = gender;
	}

	public NationalityEntity getNationality() {
		return nationality;
	}

	public void setNationality(NationalityEntity nationality) {
		this.nationality = nationality;
	}

	public HHPassportEntity getStatus() {
		return status;
	}

	public void setStatus(HHPassportEntity status) {
		this.status = status;
	}
	
}
