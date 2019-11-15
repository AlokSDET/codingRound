

/* JavaScript engine decide the data type for variable.
Its dynamic type language, means you don’t have to specify type of variable. */

console.log("hello world");

var a = 12;

var b = "Alok"

console.log(a);

console.log(b);


if(a==11){
console.log("condition is true");
} else {
    console.log("condition is not true");
}

for( var i =1 ; i<=10; i++){
	console.log(i);
	console.log("Alok");
}

var i =1; 
while(i<10){
	console.log("while loop");
	i++;
}

// Real time example of do while : : check if page is navigated after clicking on button.
var j =1;
do{
	console.log("do while loop")
	j++;
} while(j<1)



/* JavaScript Basic concept 

1/ JavaScript is asynchromous: WebDriver JS is also asynchronous , protractor is built top of webdriver js
so protractor is also asynchronous.

Every javascript step returns promise.--promise is state/result of your step.
it has three state : pending, resolved, rejected if error.

Untill the step is resolved , it cant move in next step in synchrnous language i.e. Java or python.

Java and Python is synchronous.

90% protractor API is written such that it wont execute next step untill previous step promise is resolved or rejected but 10%
steps are asynchronous and gives random result.Thats why we are learning promise and callbacks.

sendKeys , element are API from protractor , promise resolving is being taken care by protractor.

angular website has some intelligence and can wait for click unitill page loads completely but
hybrid or non angular application uses expected conditions for synchronization.
 
if we want to perform anything on browser then protractor resolves promises its on our own(i.e. click, sendkeys) but 
if we want to retireve anything from browser then it does not support prmose resolving.(
i.e. title of browser, getTtitle, getText)
Console.log is java script which does not resolve promise.

WebDriverJS uses an object called theControlFlow, which coordinates the scheduling and 
execution of commands operating on a queue.

The joy of Protractor and WebDriverJS is that we can write our tests in a synchronous style, 
and still have the added benefits of asynchronous code.

 If a test needs to get values from the browser or the DOM outside of an expect(),
  then the test writer must explicitly handle the promise.  
*/

// Resolving promises in java script.
/*describe("asynchronous learning", function() {
    it("first test", function() {
        browser.get("https://www.angularjs.org/");
        browser.get("https://juliemr.github.io/protractor-demo/").then(function() {
            browser.sleep(5000);
            console.log("last step");
        });
      
    });
})
*/


function add(a, b) {
	var c = a + b ;
	console.log(c);
	return c;
}

console.log(add(2,3));


var no = 12;
var arr = ["java", "php", "c#", "python"];// when a variable posses multiple values then we call it array.

for(var i =0; i<arr.length; i++){
	console.log(arr[i]);
}

var name = "Alok ";// literal

var fullname = name.concat("Shrivastava");

console.log(fullname);

console.log(name.indexOf("o"));
console.log(name.charAt(4));
console.log(name.slice(1,2));
console.log(name.toUpperCase());
console.log(name.toLowerCase());
console.log(name);
console.log(name.trim());

var name1 = new String("Alok Shrivastava");//string object declaration

/*
// Protractor 
driver.get(“http://www.google.com”).
    then(function() {
      return driver.findElement(webdriver.By.name('q'));
    }).
    then(function(q) {
      return q.sendKeys('webdriver');
    }).
    then(function() {
      return driver.findElement(webdriver.By.name('btnG'));
    }).
    then(function(btnG) {
      return btnG.click();
    }).
    then(function() {
      return driver.getTitle();
    }).
    then(function(title) {
      console.log(title);
    });
    */

    /* non angular application does not support promises , protractor can achieve synchronization by expected conditions.
Non Angular application : browser.ignoreSynchronization = true; can be used to interact with non angular application for protractor.

passing base url from command line 
protractor Conf.js --baseUrl="https://XXXXX/YYY"

var fs = require('fs');


taking screenshot in protractor either by protractor-beautiful-reporter or jasmine2-screenshot-reporter
browser.takeScreenshot().then(function(png){

});

taking a snapshot of element on page 

driver.get("http://www.google.com");
WebElement ele = driver.findElement(By.id("hplogo"));

// Get entire page screenshot
File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
BufferedImage  fullImg = ImageIO.read(screenshot);

// Get the location of element on the page
Point point = ele.getLocation();

// Get width and height of the element
int eleWidth = ele.getSize().getWidth();
int eleHeight = ele.getSize().getHeight();

// Crop the entire page screenshot to get only element screenshot
BufferedImage eleScreenshot= fullImg.getSubimage(point.getX(), point.getY(),
    eleWidth, eleHeight);
ImageIO.write(eleScreenshot, "png", screenshot);

// Copy the element screenshot to disk
File screenshotLocation = new File("C:\\images\\GoogleLogo_screenshot.png");
FileUtils.copyFile(screenshot, screenshotLocation);


You can use fit() or fdescribe() instead of it() and describe() to achieve what is known as focussed test cases.
To exclude a specific test case or spec, all you need to do is use xit() or xdescribe() instead of it() and describe(). 
And that is it!


--------------------------************************************--------------------------------------

Protractor : 
Angular framework developed by google to create front end application .
Protractor is an automation tool to  develop angular application.It can be used to develop non angular app.

protractor is node.js program, Jasmine bdd unit testing framework for protractor.like TestNG for selenium .
Cucumber bdd framework can be used in TypeScript.


-------------------*****************------------------

TypeScript is super set of JavaScript, opps concepts is there in TypeScript.

JavaScript compiler version is ES5 engine. From ES5 opps concepts came in JavaScript.

Protractor API(Click, sendKeys, getText).

------------------*****************---------------
software/packages which are developed in node.js(backend language) are available in node repository.
to download these protractor packages ,we need npm (node package manager). npm comes with node.js.

to download protractor : npm install -g protractor

// to get the version of protractor : protractor --version

//WebDriver-Manager will be used to interact with browser by webdriver js.
// WebDriver-Manager update : to update the webdriver-manager.
// to start : WebDriver-Manager Start : First we need to start selenium server : it is mediator between protractor code and browser.
which helps to connect application code with browser.Server will start at 4444.

// to uninstall protractor : npm uninstall -g protractor
//WebStorm is IDE for JavaScript given by IntelliJ
// ECMA is javascript library. Jasmine BDD testing framework based on JavaScript.

-------------------------*********************** JASMINE ******************-----------------------------
TestSuite - collection of tests
Describe = TestSuite 
It= TestCase 

Spec = Testfile =Class File.
Every Spec should be Describe and IT blocks.


Configuration file : which will be responsible for executing all spec files.(Cucumber runner file or TestNG.xml in testng)
Jasmine supports JavaScript.

Each test case is called spec.Spec if test file which contains multiuple tests.
----------------**********************----------------------------------

setup protractor with eclipse : 

// First create JavasCRIPT PROJECT IN ECLIPSE which can be created in eclipse which supports java script.if not found javascript project then 
add new software javascript developement tools.

convert intern project ..now we can see protractor api by wrting dot and control space.

intern option will be available only if we add angular js eclipse plugin.

------------------------ * **************---------------
// how to add test runner in eclipse for protractor project :

copy protractor folder in local project reposioty : 
create runner in configuration under node.js application ->
main file : .cli under node module 
argument : configuration file 

----------------**************---------------------
protractor learning :

1. Global variable : browser, element, by, protractor
browser: wrapps webdriver instance : for angular website: protractor waits for angular library to load if angular apps. browser.get(url)
browser.driver : for non angular application.(protractor will wait for angular libarry but in non angular it will not be there so tro avoid this 
  waitforangular(disabled)) or use browser.driver

2. element: helper function for FINDING and interacting with webelement on DOM.it requires parameter as locator.

3. by : element can be found by locator strategy 

4. protractor :namespace which contains classes , variable.

---------------------------**********------------

locator strategy : css, name, id ,linktext, xpath, ClassName ,repeater, options,  model, binding, buttonText, 


CSS == tagname[attributeName =value]

Xpath is least preffered in protractor.


//----------------------******    JASMINE   **************************---------------------
jasimne takes care of handling promises.
expect(actualResult).toBe(expectedResult);// TO COMPARE STRING
expect(actualResult).not.toBe(expectedResult);
expect(actualResult).toEqual(expectedResult);// TO COMPARE PRIMITIVE OR LITERAL OR VARIABLE.

expect(actualResult).toBeNull(null);/

expect(actualResult).toMatch(regular expression );/

----------------------Protractor conf.js file****************----------------------


conf.js


capabilities : {

  'browserName' : 'chrome',
}


webdriver-manager update --ie // it will download latest IE driver files 

// for angular app - protractor waits untill all elements loads .
// for non angular protractor still waits for angular app to loads : thats why we use below line 
browser.waitForAngularEnabled(false)

--------------------------********* Frames in protractor   *************------------------------
one page is embeded in another page. page which is embeded called frame.
browser.switchTo.frame(name or index or id);
// to maximize the browser 

browser.driver.manage().window().maximize();

----------------------------*********************************************----------------------














*/