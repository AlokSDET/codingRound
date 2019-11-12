

/* JavaScript engine decide the data type for variable.
Its dynamic type language, means you don�t have to specify type of variable. */

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
driver.get(�http://www.google.com�).
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
*/