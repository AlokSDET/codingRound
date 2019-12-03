package com.vagrant.testCases;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.vagrant.baseClass.BaseClass;

public class JavaMiscConcepts extends BaseClass {

	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		Runtime runtime = Runtime.getRuntime();
		Process batch = runtime.exec("C:\\Users\\P10484475\\Desktop\\mybatchfile.bat");

		batch.waitFor();
		
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

}
