package com.vagrant.testCases;

public class JavaAutomationTheory {

	
	/* 
	 1. Validation and Verification : 
	 
	 
	 Verification :“A test of a system to prove that it meets all its specified requirements at a particular stage of its development.”
	 include activities like code reviews, walkthroughs, inspections but little, if any, actual testing.when development is in progress.
	 
	 (am i building the product right ?)Low level, static process to check the document and files(software architecture, database design ,
	 specifications, complete design,  )little code execution 
	 ensuring that product we are developing according to the specifications.
	 
	 testing the individual code with small set of data , later in validation will test with large scale of data .
	 It helps to find out bugs in earlier stage.
	 
	 
	 Validation : “An activity that ensures that an end product stakeholder’s true needs and expectations are met.”
	 after development is completed.(user acceptance test, performance, end to end test, regression ) 
	 
	 ( am i building the right product ? ) high level , dynamic process to test the real product .actual product , full code execution 
	 ensuring that product we developed is correctly.
	 
	 
				
	 
	 2. git pull == fit fetch + git merge
	 
	 3. fork : copy of repository from some other git hub account in our own git account, changes will reflect in copy of our hub,not in original repo.
	 
	 
	 4. SQL Vs NOSQL
	 
	 
	 sql: Relational DataBase
	 NoSql: non relational database
	 
	 
	 
	 NoSQL is designed to manage lots of traffic and data.
	 
	 5. Selenium internal working :
	 
	 Once you click on run, the selenium client library will communicate with selenium API.
Selenium API will send the command taken from language level binding to browser driver with the help of JSON wired protocol.
Selenium API sends the request to Browser Driver, it may be Firefox driver, IE driver, Chrome driver.
The browser driver will use the HTTP
server for getting the HTTP request and the HTTP Server filter out all the commands which need to be executed.
Then the commands in your selenium script will be executed on the browser.
Finally, HTTP server sends the response back to the automation test script.



	 
	 
	 6. Static Type and Dynamic typed language :
	 
	 Java Example: Static typed / compile typed language.
	 
Statically-typed languages require you to declare the data types of your variables before you use them
int data;
data = 50;
data = “Hello World!”; // causes an compilation error
Note: the statement above (which binds an integer value, and then binds a string value to the same variable name data) is illegal. 
But in a dynamically-typed language this sequence of statements is perfectly fine.

A language is statically-typed if the type of a variable is known at compile-time instead of at run-time.

Common examples of statically-typed languages include Java, C, C++, FORTRAN, Pascal and Scala.

 dynamically-typed languages includes JavaScript, Objective-C, PHP, Python, Ruby, Lisp, and Tcl.
 
 
 /// Python example 
  *
 Dynamically-typed languages do not require you to declare the data types of your variables before you use them
data = 10;
data = “Hello World!”; // no error caused

------------------------------------

7. strong and week types language :


	 String k="Hello";
	//	k=k+10 ;//  python strongly typed language, can not concat , will throw error.
	 
		
		// php / c is weekly typed language , above statement is allowed in php and c.
		 
		
	 8.API:  
	 
	  API Stands for Application Programming Interface. API is a particular set of rules and specification that software
	  programs can follow to communicate with each other. 
	 API serves as an interface between the software program and facilitate their interaction. 
	 API is software to software interaction which means API works between software to software. 
	 With the help of API application talks to each other without any user knowledge.
	 
	json wire protocol : 
	  JSON stands for JavaScript Object Notation. It is a lightweight data-interchange format which helps us to interchange the data.
	    
	 JSON is used to transfer data between client and server on the web. 
	 
	 9. 
	 POST	/session/{session id}/element	Find Element
POST	/session/{session id}/elements	Find Elements


10. Since you've worked with protractor, I'll use that as example. Protractor uses executeAsyncScript in both get and waitForAngular

Basically, execSync blocks further actions being performed by the selenium browser, while execAsync does not block and calls on a callback when it's done.


11. build and perform :

Actions builder = new Actions(driver); 
builder.clickAndHold(element1)
.clickAndHold(element2)
.click()
.build()
.perform();
in the above code we are performing more than one operations so we have to use build() to compile all the actions into a single step.
 Thus build() method is used compile all the listed actions into a single step. We use build() when we are performing sequence of 
 operations and no need to use if we are performing single action.

12.

jmeter 
Ramp-up Period - the period (in seconds) that tells JMeter how long it takes to start the full number of threads chosen. 
For example, with 30 threads and 180 seconds ramp-up period, a new thread would start every 6 seconds. 
Loop Count - the number of times each user would execute the test.


	 
	 */
}
