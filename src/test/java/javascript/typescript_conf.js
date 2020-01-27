
const HtmlReporter = require('protractor-beautiful-reporter');
exports.config = {
    seleniumAddress: 'http://localhost:4444/wd/hub',
    specs: ['../e2e/src/stepDefinitions/protractorLearning.js'],
    
    chromeDriver: 'chromedriver_78.0.3904.70.exe',
    capabilities: {
        browserName: 'chrome'
      },
      directConnect: true,
      onPrepare : () => {
        browser.manage().window().maximize();
        jasmine.getEnv().addReporter(new HtmlReporter({
            baseDirectory: 'target/screenshots',
            takeScreenShotsOnlyForFailedSpecs: true
         }).getJasmine2Reporter());

      }
  };