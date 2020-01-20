package com.vagrant.testCases.patterns.builderPattern;

public class PhoneBuilder {

	
	private int ram;
	
	private String os;
	
	private double battery;
	
	private String processor;
	
	private String company;


	public PhoneBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}


	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}

	public PhoneBuilder setBattery(double battery) {
		this.battery = battery;
		return this;
	}


	public PhoneBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}

	public PhoneBuilder setCompany(String company) {
		this.company = company;
		return this;
	}
	
	
	public Phone getPhone() {
		return new Phone(ram, os, battery, processor, company);
	}
	
	
}
