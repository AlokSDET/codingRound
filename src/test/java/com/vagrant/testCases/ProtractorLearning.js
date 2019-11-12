
describe("asynchronous learning", function() {
    it("first test", function() {
        browser.get("https://www.angularjs.org/");
        browser.get("https://juliemr.github.io/protractor-demo/");
        browser.sleep(5000);
        console.log("last step");

        browser.ignoreSynchronization = true;// for non angular application i.e. protractor can interact with non angular app
        // that is deprecated so below line can be used 
        browser.waitForAngularEnabled(false);


        var EC = protractor.ExpectedConditions;
  
        browser.get("http://www.google.com").
    then(function() {
      return browser.findElement(By.name('q'));
    }).
    then(function(q) {
      return q.sendKeys('webdriver');
    }).
    then(function() {
      return browser.findElement(By.xpath("//input[contains(@name, 'q')]//following::input[3]"));
    }).
    then(function(btnG) {
      return btnG.click();
    }).
    then(function() {
        var elementToclickable = EC.elementToBeClickable(By.xpath("//h3[contains(text(),'Selenium WebDriver')]"));
        
        browser.wait(elementToclickable, 5000);
      return browser.getTitle();
    }).
    then(function(title) {
      console.log(title);
    });
    });
})

