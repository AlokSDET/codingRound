package javascript;

public class WebDriverIo {
	/*
	1. What is webdriver IO ?
			
	 WebDriverIO is node.js binding library. it runs in nodejs . 
	 * packaged in to npm and written in java script.
	 * Custom implementation of selenium webdriver w3c api.
	 * good automation tool which can automate web application and native mobile based application.
	 * very fast.easy to write syntax.
	 * it has integrated test runner and can write asynchronous command in synchronous way to handle sync and wait issues.
	 * we can easily handle synchronous issues.
	 * it has wdio set up wizard. it means it has easy setup, like retry logic screenshot for failed test case.
	 * we can write java script function.
	 * it provides the hooks.
	 * webdriver io services can be integrated with appium.
	 * 
	2. 	Comparision in protractor, webdriver io, nightwatch, code chef, cypress, puppetteer 
	
	protractor is built for angular based locator.
	
	
	// Create a folder 
	 1.  >npm init -y // to initialize npm in folder, y is to give all answer yes for default npm project
	 2. npm i --save-dev @wdio/cli // to install wdio in folder as test runner for webdriverio is in wdio library
	 	
	 	//to install webdriverIo: npm install webdriverio --save-dev
	 
	 3. npm install @wdio/cli // to install the cli.
	 4. configure your test :
	 .\node_modules\.bin\wdio config
	 	. Generate Configuration File
		Next, you�ll generate a configuration file to store your WebdriverIO settings.

		To do that, just run the configuration utility:

 		./node_modules/.bin/wdio config -y
	 
	 where test will run ? local/cloud/suase lab
	 framework : mocha jasmine, cucumber 
	 	it can be used with mocha, jasmine, cucumber framework..
	 asynchronous mode or synchronous
	 test spec location ? 
	 reporter : allure, html, spec,
	 test setup : chrome driver, docker, applitools, browserstack
	 base url? 
	 
	 5. install chai by npm install chai --save --dev
	 6. we will see wdio.conf.js will generate after configuration.
	 7. chai webdriver io install:
	 npm install chai-webdriverio --save -dev
	 8. install local runner 
	 npm install local-runner --save --dev
	 9. use below lines in before Test :
	 
	  beforeTest: function () {
            const chai = require('chai')
            const chaiWebdriver = require('chai-webdriverio').default
            chai.use(chaiWebdriver(browser))
            
            global.assert = chai.assert
            global.should = chai.should
            global.expect = chai.expect
     },
	







	

	
	
	4. create spec.js file and paste below code:
	
	const assert = require('assert')

describe('webdriver.io page', () => {
    it('should have the right title', () => {
        browser.url('https://webdriver.io')
        const title = browser.getTitle()
        assert.strictEqual(title, 'WebdriverIO � Next-gen WebDriver test framework for Node.js')
    })
})


// async mode 
const assert = require('assert')

describe('webdriver.io page', () => {
    it('should have the right title', async () => {
        await browser.url('https://webdriver.io')
        const title = await browser.getTitle()
        assert.strictEqual(title, 'WebdriverIO � Next-gen WebDriver test framework for Node.js')
    })
})

5. run spec file by below code :

./node_modules/.bin/wdio wdio.conf.js


// Dev dependency : after packaging if we give to other team member, then they need to just installl npm
 * they dont need to execute these dependencies.
 * 

	 */
}
