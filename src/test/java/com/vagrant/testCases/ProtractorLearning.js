
describe("asynchronous learning", function () {
  it("first test", function () {
    browser.get("https://www.angularjs.org/");
    browser.get("https://juliemr.github.io/protractor-demo/");
    browser.sleep(5000);
    console.log("last step");

    browser.ignoreSynchronization = true;// for non angular application i.e. protractor can interact with non angular app
    // that is deprecated so below line can be used 
    browser.waitForAngularEnabled(false);


    var EC = protractor.ExpectedConditions;

    browser.get("http://www.google.com").
      then(function () {
        return browser.findElement(By.name('q'));
      }).
      then(function (q) {
        return q.sendKeys('webdriver');
      }).
      then(function () {
        return browser.findElement(By.xpath("//input[contains(@name, 'q')]//following::input[3]"));
      }).
      then(function (btnG) {
        return btnG.click();
      }).
      then(function () {
        var elementToclickable = EC.elementToBeClickable(By.xpath("//h3[contains(text(),'Selenium WebDriver')]"));

        browser.wait(elementToclickable, 5000);
        return browser.getTitle();
      }).
      then(function (title) {
        console.log(title);
      });
  });

  // Chaining of locator

  it('should have a title', function () {
    browser.get('http://juliemr.github.io/protractor-demo/');

    expect(browser.getTitle()).toEqual('Super Calculator');

    browser.manage().window().maximize();

    element(by.model("first")).sendKeys(4);
    element(by.model("second")).sendKeys(2);
    element(by.id("gobutton")).click();

    // chaining of locator. we define parent and tell engine to search inside the parent to avoid confusion.

    element(by.repeater("result in memory")).element(by.css("td:nth-child(3)")).getText().then(function (text) {
      console.log(text);
    });

    // Substract
    element(by.model("operator")).element(by.css("option:nth-child(5)")).click();

    element(by.model("first")).sendKeys(4);
    element(by.model("second")).sendKeys(2);
    element(by.id("gobutton")).click();

    element(by.repeater("result in memory")).element(by.css("td:nth-child(3)")).getText().then(function (text) {
      console.log(text);
    });


    element(by.repeater("result in memory")).element(by.css("td:nth-child(3)")).getText().then(function (text) {
      console.log(text);
    });


    /// all locators :


    element(by.model("first")).sendKeys(4);
    element(by.model("second")).sendKeys(2);
    element(by.id("gobutton")).click();

    element(by.model("first")).sendKeys(5);
    element(by.model("second")).sendKeys(4);
    element(by.id("gobutton")).click();

    Add(7, 4);

    // it has three methods 
    //count, first, last

    element.all(by.repeater("")).count().then(function (count) {
      console.log(count);
    });


    element.all(by.repeater("")).each(function (item) {
      item.element(by.css("td:nth-child(3)")).getText().then(function (text) {
        console.log(text);
      });

    });

  });

  // to execute single test case we use iit, to execute single describe block we use ddescribe.

  iit("by tag name ", function () {
    browser.get('http://juliemr.github.io/protractor-demo/');

    expect(browser.getTitle()).toEqual('Super Calculator');

    browser.manage().window().maximize();

    element.all(by.tagName("options")).each(function (item) {

      item.getAttribute("value").then(function (value) {
        console.log(value);
      });

    });

  })
    // function can not be defined inside IT block , it has to be under describe block so that all IT block can use them.

    function Add(a, b) {
      element(by.model("first")).sendKeys(a);
      element(by.model("second")).sendKeys(b);
      element(by.id("gobutton")).click();
    }
});


describe('Protractor Element Demo',function() {  
	function Calc(a,b,c)
	{
	element(by.model("first")).sendKeys(a);
	element(by.model("second")).sendKeys(b);

	//
	element.all(by.tagName("option")).each(function(item)
	{
	item.getAttribute("value").then(function(values)

	{

	if(values==c)
	{
	item.click();
	}

	})
	})

	element(by.id("gobutton")).click();
	}

	
	
	it('Locators',function() {

	/*browser.waitForAngularEnabled(false);
	browser.get("http://google.com");//non angular apps*/
	browser.get('http://juliemr.github.io/protractor-demo/');


	Calc(3,5,"MULTIPLICATION");

	Calc(3,5,"DIVISION");
	Calc(3,5,"DIVISION");
	Calc(10,6,"ADDITION");
	element.all(by.repeater("result in memory")).each(function(item)
	{
	item.element(by.css("td:nth-child(3)")).getText().then(function(text)
	{

	console.log(text);
	})

	})


	})


	})

