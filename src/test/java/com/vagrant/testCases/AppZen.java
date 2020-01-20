package com.vagrant.testCases;

public class AppZen {

	public static void main(String[] args) {
	
		System.out.println(compressedString("aalokkkkkkdeeghtt") );
		

	}
	
	public  static String compressedString(String message) {
		
		char charArray [] = message.toCharArray();
		String compressedString = "";
		for (int i = 0; i< charArray.length; i++) {
			
			int co = 1;
			for (int j = i; j< charArray.length-1; j++) {
				if(charArray[i] == charArray[j+1]) {
					co++;
				} else {
					break;
				}
			}
			
			if(co == 1) {
				compressedString = 	compressedString.concat(String.valueOf(charArray[i]));
			} else {
			
				compressedString = compressedString.concat(String.valueOf(charArray[i])).concat(String.valueOf(co));
				i = i + co -1;
			}
			
		}
		
		return compressedString;
	}

}
