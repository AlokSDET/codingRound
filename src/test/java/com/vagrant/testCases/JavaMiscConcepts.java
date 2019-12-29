package com.vagrant.testCases;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.vagrant.baseClass.BaseClass;

public class JavaMiscConcepts extends BaseClass {

	static Node head;

	static class Node {

		int data;
		Node next_node;

		Node(int d) {
			data = d;
			next_node = null;
		}
	}
		
	public static void main(String[] args) throws IOException, InterruptedException {
		
		Runtime runtime = Runtime.getRuntime();
		//Process batch = runtime.exec("C:\\Users\\P10484475\\Desktop\\mybatchfile.bat");

		//batch.waitFor();
		
		/*
		 * ProcessBuilder pb = new ProcessBuilder();
		 * pb.command("C:\\Users\\P10484475\\Desktop\\mybatchfile.bat");
		 * 
		 * Process process = Runtime.getRuntime().exec( "cmd /c mybatchfile.bat", null,
		 * new File("C:\\Users\\P10484475\\Desktop\\"));
		 */
		
		/*
		 * Runtime runtime = Runtime.getRuntime(); Process batch =
		 * runtime.exec("C:\\Users\\P10484475\\Desktop\\mybatchfile.bat");
		 * 
		 * batch.waitFor();
		 */
		List<Integer> ll = new LinkedList<Integer>();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		
	//	reverseLinkedList(ll);
		
		
		/// sum of first 1000 prime number 
		
	    int number = 2;
        int count = 0;
        long sum = 0;
        while(count < 1000){
            if(isPrimeNumber(number)){
                sum += number;
                count++;
            }
            number++;
        }
     //   System.out.println(sum);
        
        checkJavaConcepts();
    }
     
    private static boolean isPrimeNumber(int number){
         
        for(int i=2; i<=number/2; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
	
	}
	
	
	@Test(description = "ifClickedOnListOfELements then it clicks on first element")
	public void ifClickedOnListOfELements() {
		driver.get("https://www.browserstack.com/selenium");
		driver.findElement(By.xpath("//a")).click();
		System.out.println("clicked on first anchor tag");
	}
	
	
	@Test
	public void dataBaseConnectivity() throws ClassNotFoundException, SQLException {
		
		// before connecting java with mysql database we need to download 
		//mysqlconnector.jar and set class path C:>set classpath=c:\folder\mysql-connector-java-5.0.8-bin.jar;.;  
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo","root","root");
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery("select * from emp");
		
		while(rs.next()) {
			rs.getString(1);
		}
		
		con.close();
		
	}
	
	public static List<Integer> reverseLinkedList(List<Integer> ll) {
		
		// code to reverse a linked list 
		
		

		
		List<Integer> rl = new LinkedList<Integer>();
		return rl;
	}
	
	public static void checkJavaConcepts() {
			
		String a = "Java";
		a = a +10;
		
		 int i = 10;
		 
		System.out.println(a );
		
		System.out.println(i++);// 10
		System.out.println(i++);//11
		System.out.println(++i);//13
		//can use expression in switch case
		switch(20/10) {
		
		case 1: System.out.println("case 1");
		break;
		
		case 2: System.out.println("case 2");
		break;
		
		default: 
			System.out.println("invalid expression");
			break;
		}
		
		for(int j = 0; j< 5; j++) {
			if(j==0) {
				continue;
				
			}else {
				System.out.println("does not match condition");
			}
			System.out.println("nono");
		}
	
	}

}
