package com.main.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dummytab")
public class DummyDto implements Serializable
{

	
	@Column(name = "ts1")
	@Id
	private int t1;
	
	@Column(name = "ts2")
	private int t2;
	
	public int getT1() {
		return t1;
	}
	public void setT1(int t1) {
		this.t1 = t1;
	}
	public int getT2() {
		return t2;
	}
	public void setT2(int t2) {
		this.t2 = t2;
	}
	@Override
	public String toString() {
		return "DummyDto [t1=" + t1 + ", t2=" + t2 + "]";
	}
	 
}
