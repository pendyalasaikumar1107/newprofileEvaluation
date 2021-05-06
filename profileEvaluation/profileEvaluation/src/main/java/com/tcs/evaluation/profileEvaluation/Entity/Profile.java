package com.tcs.evaluation.profileEvaluation.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Profile {
	@Id
	private Long id;
	private String profileOrigin;
	private String Name;
	private String mobileNo;
	private String Location;
	private Float Experience;
	public Float getExperience() {
		return Experience;
	}
	public void setExperience(Float experience) {
		Experience = experience;
	}
	private String skill1;
	private String skill2;
	private String skill3;
	
	public String getSkill1() {
		return skill1;
	}
	public void setSkill1(String skill1) {
		this.skill1 = skill1;
	}
	public String getSkill2() {
		return skill2;
	}
	public void setSkill2(String skill2) {
		this.skill2 = skill2;
	}
	public String getSkill3() {
		return skill3;
	}
	public void setSkill3(String skill3) {
		this.skill3 = skill3;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	
	
	public String getProfileOrigin() {
		return profileOrigin;
	}
	public void setProfileOrigin(String profileOrigin) {
		this.profileOrigin = profileOrigin;
	}
}
