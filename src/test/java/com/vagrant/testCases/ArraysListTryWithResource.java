package com.vagrant.testCases;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ArraysListTryWithResource {

	/*
	 * Try with resources: It was initially introduced in Java 7 the developer
	 * doesn't need to worry about resource management for resources they use only
	 * in one try-catch-finally block This is achieved by removing the need for
	 * finally blocks,
	 * 
	 * it automatically calls .close() method
	 * 
	 * If an exception is thrown from within a Java try-with-resources block, any
	 * resource opened inside the parentheses of the try block will still get closed
	 * automatically.
	 * 
	 * 
	 */
	public void tryWithResource() {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("test.txt"))) {
			writer.write("Hello World");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void tryWithoutResource() {
		BufferedReader bfrrdr = null;
		try {
			bfrrdr = new BufferedReader(new FileReader("test.txt"));
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (bfrrdr != null) {
				try {
					bfrrdr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	/*
	 * Note: They're closed in reverse declaration order, meaning that, in our
	 * example, scanner will be closed before the writer.
	 * 
	 * 
	 * 
	 */

	public void tryWithMultipleResource() {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("test.txt"));
				Scanner scanner = new Scanner(System.in)) {
			if (scanner.hasNextLine())
				writer.write(scanner.nextLine());
		} catch (IOException e) {

		}
	}

	/*
	 * Note: Since Java 9, it isn't necessary to declare the resources within the
	 * try-with-resources statement. We can do something like this instead:
	 * 
	 * 
	 * 
	 */
	/*
	 * public void tryWithResourceInJava9() {
	 * 
	 * BufferedWriter writer = new BufferedWriter(new FileWriter("test.txt")); try
	 * (writer) { writer.write("abc"); // do something with the file we've opened }
	 * catch (IOException e) { // handle the exception } }
	 */

}
