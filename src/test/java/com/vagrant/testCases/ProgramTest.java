package com.vagrant.testCases;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.util.Arrays;

public class ProgramTest {

	static boolean isAnagram(String a, String b) {
		char charA[] = a.toCharArray();
		char charB[] = b.toCharArray();

		Arrays.sort(charA);
		Arrays.sort(charB);

		if (charA.length != charB.length) {
			return false;
		} else {
			for (int i = 0; i < a.length(); i++) {
				if (charA[i] != charB[i]) {
					return false;
				}
			}
			return true;
		}
	}

	public static void main(String[] args) {

		ProgramTest obj1 = new ProgramTest();
		
		for (int i = 1; i <=100; i++) {
			Object n = obj1.checkDivisibilityForNoAndReturnValue(i);
			System.out.println(n);
			
		}
	
		/*
		 * List<Integer> inputList = new ArrayList<>(); inputList.add(3);
		 * inputList.add(15);
		 * 
		 * List<Object> listOfOutPut = new ArrayList<>();
		 * 
		 * for (int i = 0; i < inputList.size(); i++) { int input = inputList.get(i);
		 * listOfOutPut.addAll(obj1.createOutPutList(input)); }
		 * 
		 * for (Object output : listOfOutPut) { System.out.println(output); }
		 * 
		 * 
		 * Scanner scan = new Scanner(System.in); String a = scan.next(); String b =
		 * scan.next(); scan.close(); boolean ret = isAnagram(a, b); System.out.println(
		 * (ret) ? "Anagrams" : "Not Anagrams" );
		 */

		/*
		 * String str = "[[{{}()]}]"; boolean b = obj1.validateBalanceParenthesis(str);
		 * if (b) { System.out.println("paranthesis is balanced"); } else {
		 * System.out.println("paranthesis is not balanced"); }
		 */
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

	public boolean validateBalanceParenthesis(String str) {

		char[] ch = str.toCharArray();

		Stack<Character> st = new Stack<Character>();

		char c;
		for (int i = 0; i < ch.length; i++) {

			// pushing in stack if opening braces
			if (ch[i] == '{' || ch[i] == '(' || ch[i] == '[') {
				st.push(ch[i]);
			}
			// poping from stack if closing braces
			if (ch[i] == '}' || ch[i] == ')' || ch[i] == ']') {
				if (st.isEmpty()) {
					return false;
				} else {
					// Character.compare(c, ch[i]);
					c = st.pop();
					if (!isMatchingPair(c, ch[i])) {
						return false;
					}
				}
			}
		}

		if (st.isEmpty()) {
			return true;
		} else {
			return false;
		}

	}

	public boolean isMatchingPair(char c1, char c2) {
		if (c1 == '[' && c2 == ']') {
			return true;
		} else if (c1 == '{' || c2 == '}') {
			return true;
		} else if (c1 == '(' || c2 == ')') {
			return true;
		} else {
			return false;
		}
	}

	private Object checkDivisibilityForNoAndReturnValue(int i) {

			if (i % 3 == 0 && i % 5 == 0) {
				return "AC";
			} else if (i % 3 != 0 && i % 5 != 0) {
				return i;
			} else if (i % 3 == 0 && i % 5 != 0) {
				return "A";
			} else if (i % 5 == 0 && i % 3 != 0) {
				return "C";
			}
			return i;

	}

}
