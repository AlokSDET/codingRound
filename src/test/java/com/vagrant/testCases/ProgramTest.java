package com.vagrant.testCases;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramTest {

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
