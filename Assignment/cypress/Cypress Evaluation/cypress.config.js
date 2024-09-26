const { defineConfig } = require("cypress");

async function newfunction(on, config){
  return config;
}

module.exports = defineConfig({
  e2e: {
    newfunction,
    specPattern: "cypress/Integration/Basics/*.js",
  },
});
