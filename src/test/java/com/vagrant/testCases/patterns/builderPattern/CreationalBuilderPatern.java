package com.vagrant.testCases.patterns.builderPattern;

import com.vagrant.testCases.patterns.builderPattern.PhoneBuilder;

import com.vagrant.testCases.patterns.builderPattern.Phone;

public class CreationalBuilderPatern {

	public static void main(String args[]) {

		Phone asusPhone = new PhoneBuilder().setRam(8).setCompany("Asus").getPhone();
		System.out.println(asusPhone.toString());

		Phone samsungPhone = new PhoneBuilder().setRam(2).setCompany("Samsung").setBattery(1500).setOs("Android")
				.getPhone();
		System.out.println(samsungPhone.toString());

		Phone miPhone = new PhoneBuilder().setRam(4).setCompany("MI").setProcessor("MediaTeck").getPhone();
		System.out.println(miPhone.toString());

		Phone applePhone = new PhoneBuilder().setRam(16).setCompany("Apple").setBattery(15000).setOs("MAC")
				.setProcessor("QualComm").getPhone();
		System.out.println(applePhone.toString());

	}
}