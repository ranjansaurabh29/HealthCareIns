package com.healthcare.curd.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Applicant_Details")
public class Applicant implements Serializable{
 @Id
 @GeneratedValue
 private int id;
 private String provider;
 public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getProvider() {
	return provider;
}
public void setProvider(String provider) {
	this.provider = provider;
}
public Date getJoinedDate() {
	return joinedDate;
}
public void setJoinedDate(Date joinedDate) {
	this.joinedDate = joinedDate;
}
public String getCurrinsType() {
	return currinsType;
}
public void setCurrinsType(String currinsType) {
	this.currinsType = currinsType;
}
public String getReqInsType() {
	return reqInsType;
}
public void setReqInsType(String reqInsType) {
	this.reqInsType = reqInsType;
}
public String getIncome() {
	return income;
}
public void setIncome(String income) {
	this.income = income;
}
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}
public Applicant() {
	super();
	// TODO Auto-generated constructor stub
}
public Applicant(String Provider,Date JoinedDate,String currIns,String reqInsType) {
	super();
	this.provider = Provider;
	this.joinedDate = JoinedDate;
	this.currinsType = currIns;
	this.reqInsType=reqInsType;
	
	
	// TODO Auto-generated constructor stub
}
private Date joinedDate;
 private String currinsType;
 private String reqInsType;
 private String income;
 private String age;
 
}
