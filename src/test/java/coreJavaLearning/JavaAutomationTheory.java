package coreJavaLearning;

public class JavaAutomationTheory {

	/*
	 * 1. Validation and Verification :
	 * 
	 * 
	 * Verification :“A test of a system to prove that it meets all its specified
	 * requirements at a particular stage of its development.” include activities
	 * like code reviews, walkthroughs, inspections but little, if any, actual
	 * testing.when development is in progress.
	 * 
	 * (am i building the product right ?)Low level, static process to check the
	 * document and files(software architecture, database design , specifications,
	 * complete design, )little code execution ensuring that product we are
	 * developing according to the specifications.
	 * 
	 * testing the individual code with small set of data , later in validation will
	 * test with large scale of data . It helps to find out bugs in earlier stage.
	 * 
	 * 
	 * Validation : “An activity that ensures that an end product stakeholder’s true
	 * needs and expectations are met.” after development is completed.(user
	 * acceptance test, performance, end to end test, regression )
	 * 
	 * ( am i building the right product ? ) high level , dynamic process to test
	 * the real product .actual product , full code execution ensuring that product
	 * we developed is correctly.
	 * 
	 * 
	 * 
	 * 
	 * 2. git pull == fit fetch + git merge
	 * 
	 * 3. fork : copy of repository from some other git hub account in our own git
	 * account, changes will reflect in copy of our hub,not in original repo.
	 * 
	 * 
	 * 4. SQL Vs NOSQL
	 * 
	 * 
	 * sql: Relational DataBase NoSql: non relational database
	 * 
	 * 
	 * 
	 * NoSQL is designed to manage lots of traffic and data.
	 * 
	 * 5. Selenium internal working :
	 * 
	 * Once you click on run, the selenium client library will communicate with
	 * selenium API. Selenium API will send the command taken from language level
	 * binding to browser driver with the help of JSON wired protocol. Selenium API
	 * sends the request to Browser Driver, it may be Firefox driver, IE driver,
	 * Chrome driver. The browser driver will use the HTTP server for getting the
	 * HTTP request and the HTTP Server filter out all the commands which need to be
	 * executed. Then the commands in your selenium script will be executed on the
	 * browser. Finally, HTTP server sends the response back to the automation test
	 * script.
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 6. Static Type and Dynamic typed language :
	 * 
	 * Java Example: Static typed / compile typed language.
	 * 
	 * Statically-typed languages require you to declare the data types of your
	 * variables before you use them int data; data = 50; data = “Hello World!”; //
	 * causes an compilation error Note: the statement above (which binds an integer
	 * value, and then binds a string value to the same variable name data) is
	 * illegal. But in a dynamically-typed language this sequence of statements is
	 * perfectly fine.
	 * 
	 * A language is statically-typed if the type of a variable is known at
	 * compile-time instead of at run-time.
	 * 
	 * Common examples of statically-typed languages include Java, C, C++, FORTRAN,
	 * Pascal and Scala.
	 * 
	 * dynamically-typed languages includes JavaScript, Objective-C, PHP, Python,
	 * Ruby, Lisp, and Tcl.
	 * 
	 * 
	 * /// Python example
	 *
	 * Dynamically-typed languages do not require you to declare the data types of
	 * your variables before you use them data = 10; data = “Hello World!”; // no
	 * error caused
	 * 
	 * ------------------------------------
	 * 
	 * 7. strong and week types language :
	 * 
	 * 
	 * String k="Hello"; // k=k+10 ;// python strongly typed language, can not
	 * concat , will throw error.
	 * 
	 * 
	 * // php / c is weekly typed language , above statement is allowed in php and
	 * c.
	 * 
	 * 
	 * 8.API:
	 * 
	 * API Stands for Application Programming Interface. API is a particular set of
	 * rules and specification that software programs can follow to communicate with
	 * each other. API serves as an interface between the software program and
	 * facilitate their interaction. API is software to software interaction which
	 * means API works between software to software. With the help of API
	 * application talks to each other without any user knowledge.
	 * 
	 * json wire protocol : JSON stands for JavaScript Object Notation. It is a
	 * lightweight data-interchange format which helps us to interchange the data.
	 * 
	 * JSON is used to transfer data between client and server on the web.
	 * 
	 * 9. POST /session/{session id}/element Find Element POST /session/{session
	 * id}/elements Find Elements
	 * 
	 * 
	 * 10. Since you've worked with protractor, I'll use that as example. Protractor
	 * uses executeAsyncScript in both get and waitForAngular
	 * 
	 * Basically, execSync blocks further actions being performed by the selenium
	 * browser, while execAsync does not block and calls on a callback when it's
	 * done.
	 * 
	 * 
	 * 11. build and perform :
	 * 
	 * Actions builder = new Actions(driver); builder.clickAndHold(element1)
	 * .clickAndHold(element2) .click() .build() .perform(); in the above code we
	 * are performing more than one operations so we have to use build() to compile
	 * all the actions into a single step. Thus build() method is used compile all
	 * the listed actions into a single step. We use build() when we are performing
	 * sequence of operations and no need to use if we are performing single action.
	 * 
	 * 12.
	 * 
	 * jmeter Ramp-up Period - the period (in seconds) that tells JMeter how long it
	 * takes to start the full number of threads chosen. For example, with 30
	 * threads and 180 seconds ramp-up period, a new thread would start every 6
	 * seconds. Loop Count - the number of times each user would execute the test.
	 * 
	 * *
	 * ************************----------------------------*************************
	 * ***************** 13. Single page application ( SPA) and multiple page
	 * application (MPA): Design pattern for web based application : SPA, MPA
	 * 
	 * 1. A single-page application is an app that works inside a browser and does
	 * not require page reloading during use. You are using this type of
	 * applications every day. These are, for instance: Gmail, Google Maps, Facebook
	 * or GitHub.
	 * 
	 * 2. no page reloads, no extra wait time. It is just one web page that you
	 * visit which then loads all other content using JavaScript
	 *
	 *
	 * 3. Single page applications are built in JavaScript (or at least compiled to
	 * JavaScript) and work in the browser.
	 *
	 *
	 * 4. An app is usually built as a single page application: you only load the
	 * application code (HTML, CSS, JavaScript) once
	 *
	 * 5. In the past, when browsers were much less capable than today, and
	 * JavaScript performance was poor, every page was coming from a server. Every
	 * time you clicked something, a new request was made to the server and the
	 * browser subsequently loaded the new page.
	 *
	 * 6.Earlier every page is having seperate html, when you interact with the
	 * application, what generally happens is that JavaScript intercepts the browser
	 * events and instead of making a new request to the server that then returns a
	 * new document, the client requests some JSON or performs an action on the
	 * server but the page that the user sees is never completely wiped away, and
	 * behaves more like a desktop application.
	 *
	 * 7. In addition to making the experience faster to the user, the server will
	 * consume less resources because you can focus on providing an efficient API
	 * instead of building the layouts server-side.
	 * 
	 * 8. we keep all css, html at browser only, and focus on only API to get data
	 * from database.An SPA feels much faster to the user,
	 * 
	 * 9. Single Page Applications are easy to transform into Progressive Web Apps,
	 * which in turn enables you to provide local caching and to support offline
	 * experiences for your services (or a better error message if your users need
	 * to be online).
	 * 
	 * 10. Cons: should enable javascript, search engine website does not implement.
	 * It is slow to download because heavy client frameworks are required to be
	 * loaded to the client.
	 * 
	 * 11. SPA is fast, as most resources (HTML+CSS+Scripts) are only loaded once
	 * throughout the lifespan of application. Only data is transmitted back and
	 * forth.
	 * 
	 * 12. SPAs are easy to debug with Chrome, as you can monitor network
	 * operations, investigate page elements and data associated with it.
	 * 
	 * 13. It’s easier to make a mobile application because the developer can reuse
	 * the same backend code for web application and native mobile application.
	 * 
	 * 14. SPA can cache any local storage effectively. An application sends only
	 * one request, store all data, then it can use this data and works even
	 * offline.
	 * 
	 * 15.Its content is loaded by AJAX (Asynchronous JavaScript and XML) — a method
	 * of exchanging data and updating in the application without refreshing the
	 * page.
	 * 
	 * 16.Compared to the “traditional” application, SPA is less secure. Due to
	 * Cross-Site Scripting (XSS), it enables attackers to inject client-side
	 * scripts into web application by other users.
	 * 
	 * ********************-------------------------------**************************
	 * ****************
	 * 
	 * 
	 * 
	 * 13. Ajax: Asynchrnous java script and xml(extensible markup language);
	 * 
	 * 
	 * 
	 * 
	 * AJAX stands for:
	 * 
	 * Asynchronous - means that if you start some request (call some API), you can
	 * move on to another task before that request is finished. This is the direct
	 * opposite of when you execute something synchronously - in that case, you have
	 * to wait for it to finish before moving on to another task. JavaScript - the
	 * best language ever And - added 'And' as three letter acronyms just don't cut
	 * it anymore XML - Extensible Markup Language that no one on the web uses
	 * anymore :), JSON FTW :)
	 * 
	 * AJAX lets you load some new data to your web page, without the need to reload
	 * the whole webpage. This behavior makes your site feel faster and more
	 * responsive.
	 * 
	 * Another example of AJAX in action is when you are presented with a newsletter
	 * signup form on some site. You fill out the name and an email address, click
	 * send, and the site doesn't refresh. Instead, you get the message right there
	 * like "you've been subscribed, check your email
	 * 
	 * To use AJAX in JavaScript, you need to do four things:
	 * 
	 * create a XMLHttpRequest(xhr)object write the callback function open the
	 * request, send the request
	 * 
	 * var xhr = new XMLHttpRequest(); xhr.onreadystatechange = function() {};
	 * xhr.open('GET', 'http://www.google.com'); xhr.send()
	 * 
	 * 14. git cherry-pick is a powerful command that enables arbitrary Git commits
	 * to be picked by reference and appended to the current working HEAD.
	 * 
	 * 
	 * 15. as there's a limit to the length of the parameters in a GET request (2048
	 * chars), as well as there's a security issue. With POST you can send way more
	 * data, and in a secure way.
	 */

}
