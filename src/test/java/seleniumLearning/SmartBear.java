package seleniumLearning;

import java.io.IOException;

public class SmartBear {

	/*
	 * it has many product like test complete for functional testing.
	 * 
	 * API : FUNCTION TEST : SOAPUI PRO API : Performance Test: LoadUI pro
	 * 
	 */

	public static void main(String args[]) {

		exceptionhandling();

	}

	public static void exceptionhandling() {

		String s = null;
		int a = 10, b = 0;

		int array[] = { 1, 2 };

		try {
			System.out.println(s.charAt(0));

			System.out.println(a / b);

			System.out.println(array[10]);

		} catch (NullPointerException e) {
			System.out.print(e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.print(e.getMessage());
		} catch (ArithmeticException e) {
			System.out.print(e.getMessage());
		}

	}
}
