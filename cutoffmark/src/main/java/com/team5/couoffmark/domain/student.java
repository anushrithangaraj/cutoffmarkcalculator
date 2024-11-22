package com.team5.couoffmark.domain;

public class student {

	private float m1;
	private float m2;
	private float m3;
	public float getM1() {
		return m1;
	}
	public void setM1(float m1) {
		this.m1 = m1;
	}
	public float getM2() {
		return m2;
	}
	public void setM2(float m2) {
		this.m2 = m2;
	}
	public float getM3() {
		return m3;
	}
	public void setM3(float m3) {
		this.m3 = m3;
	}
	
	public float getTotal() {
		return m1+(m2/2)+(m3/2);
	}
	
}