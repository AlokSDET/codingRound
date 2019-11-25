package com.vagrant.testCases;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.util.Arrays;


public class ProgramTest {
	
    static boolean isAnagram(String a, String b) {
        char charA [] = a.toCharArray();
         char charB [] = b.toCharArray();

        Arrays.sort(charA);
        Arrays.sort(charB);

        if(charA.length != charB.length) {
                return false;
        } else {
            for(int i =0; i<a.length(); i++) {
                if(charA[i] != charB[i]) {
                   return false; 
                }
            }
            return true;
        }
    }

	public static void main(String[] args) {

		ProgramTest obj1 = new ProgramTest();

		List<Integer> inputList = new ArrayList<>();
		inputList.add(3);
		inputList.add(15);

		List<Object> listOfOutPut = new ArrayList<>();

		for (int i = 0; i < inputList.size(); i++) {
			int input = inputList.get(i);
			listOfOutPut.addAll(obj1.createOutPutList(input));
		}

		for (Object output : listOfOutPut) {
			System.out.println(output);
		}
		
		
		  Scanner scan = new Scanner(System.in);
	        String a = scan.next();
	        String b = scan.next();
	        scan.close();
	        boolean ret = isAnagram(a, b);
	        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	}

	private List<Object> createOutPutList(int n) {
		List<Object> listOfOutPut = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 && i % 5 != 0) {
				listOfOutPut.add("Fizz");
			} else if (i % 5 == 0 && i % 3 != 0) {
				listOfOutPut.add("Buzz");
			} else if (i % 3 == 0 && i % 5 == 0) {
				listOfOutPut.add("FizzBuzz");
			} else {
				listOfOutPut.add(i);
			}
		}
		return listOfOutPut;
	}
	
	

}
