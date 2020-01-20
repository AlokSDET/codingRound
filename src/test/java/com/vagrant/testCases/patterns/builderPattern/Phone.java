package com.vagrant.testCases.patterns.builderPattern;

public class Phone {

	private int ram;
	
	private String os;
	
	private double battery;
	
	private String processor;
	
	private String company;
	
	public Phone(int ram, String os, double battery, String processor, String company) {
		super();
		this.ram = ram;
		this.os = os;
		this.battery = battery;
		this.processor = processor;
		this.company = company;
	}

	@Override
	public String toString() {
		return "Phone [ram=" + ram + ", os=" + os + ", battery=" + battery + ", processor=" + processor + ", company="
				+ company + "]";
	}


	
	
}
