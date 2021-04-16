package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Student {

	@Id
	@GeneratedValue
	private Integer stdId;
	
	@NotBlank(message = "Please enter your name")
	private String stdName;
	private Double stdFee;
	private String stdCourse;
	private Double stdFeeDisc;
	private Double stdFeeGst;
	public Integer getStdId() {
		return stdId;
	}
	public void setStdId(Integer stdId) {
		this.stdId = stdId;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public Double getStdFee() {
		return stdFee;
	}
	public void setStdFee(Double stdFee) {
		this.stdFee = stdFee;
	}
	public String getStdCourse() {
		return stdCourse;
	}
	public void setStdCourse(String stdCourse) {
		this.stdCourse = stdCourse;
	}
	public Double getStdFeeDisc() {
		return stdFeeDisc;
	}
	public void setStdFeeDisc(Double stdFeeDisc) {
		this.stdFeeDisc = stdFeeDisc;
	}
	public Double getStdFeeGst() {
		return stdFeeGst;
	}
	public void setStdFeeGst(Double stdFeeGst) {
		this.stdFeeGst = stdFeeGst;
	}
	
}
