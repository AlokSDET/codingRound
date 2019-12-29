package testautomationtools.jest;

public class WebDriverIo {

	
	/* WebDriverIO is node.js binding library. it runs in nodejs . 
	
	// Create a folder 
	 1.  >npm init -y // to initialize npm in folder, y is to give all answer yes for default npm project
	 2. npm i --save-dev @wdio/cli // to install wdio in folder as test runner for webdriverio is in wdio library
	 * 
	
	
	. Generate Configuration File
Next, you’ll generate a configuration file to store your WebdriverIO settings.

To do that, just run the configuration utility:

3. ./node_modules/.bin/wdio config -y





	to install webdriverIo: npm install webdriverio --save-dev
	
	it can be used with mocha, jasmine, cucumber framework..
	
	
	4. create spec.js file and paste below code:
	
	const assert = require('assert')

describe('webdriver.io page', () => {
    it('should have the right title', () => {
        browser.url('https://webdriver.io')
        const title = browser.getTitle()
        assert.strictEqual(title, 'WebdriverIO · Next-gen WebDriver test framework for Node.js')
    })
})


// async mode 
const assert = require('assert')

describe('webdriver.io page', () => {
    it('should have the right title', async () => {
        await browser.url('https://webdriver.io')
        const title = await browser.getTitle()
        assert.strictEqual(title, 'WebdriverIO · Next-gen WebDriver test framework for Node.js')
    })
})

5. run spec file by below code :

./node_modules/.bin/wdio wdio.conf.js


	 */
}
