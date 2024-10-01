const { defineConfig } = require("cypress");
const cucumber = require('@badeball/cypress-cucumber-preprocessor');

module.exports = defineConfig({
  e2e: {
    specPattern: 'cypress/e2e/**/*.feature',
    setupNodeEvents(on, config) {
      // implement node event listeners here
      cucumber.addCucumberPreprocessorPlugin(on, config);
      return config;
    },
  },
});
