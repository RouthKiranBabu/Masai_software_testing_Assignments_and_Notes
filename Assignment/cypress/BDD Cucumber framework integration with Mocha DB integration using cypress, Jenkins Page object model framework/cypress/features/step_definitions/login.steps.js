import { Given, When, Then } from "@badeball/cypress-cucumber-preprocessor";

Given("the user navigates to the login page", () => {
  cy.visit("https://v1.training-support.net/selenium/simple-form/login");
});

When("the user enters valid credentials", () => {
  cy.get("[placeholder='First Name']").type("Routh");
  cy.get("[placeholder='Last Name']").type("Kiran Babu");
  cy.get('[type="email"]').type("Kiran@gmail.com");
  cy.get('#number').type("1234567890")
  cy.get('[rows="2"]').type("Some Message!")
  cy.get('[type="submit"][value="submit"]').click()
});

Then("the user should be logged in", () => {
  cy.url().should("include", "/dashboard");
});
