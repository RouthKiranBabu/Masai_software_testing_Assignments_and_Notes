import { Given, When, Then, And } from "cypress-cucumber-preprocessor/steps";
Given('Enter the URL', () => {
    cy.visit('https://v1.training-support.net/selenium/simple-form')
})
When('Firstname, Lastname, email, Contact Number, Message', ()=>{
    cy.xpath('//input[@placeholder="First Name"]').type('FirstName')
    cy.xpath('//input[@placeholder="Last Name"]').type("LastName")
    cy.xpath('//input[@type="email"]').type("abc123@gmail.com")
    cy.xpath('//input[@type="tel"]').type('1234567890')
    cy.xpath('//textarea[@rows="2"]').type('Hello World')
})
And('Click on Submit Button', () => {
    cy.xpath('//input[@type="submit"]').click()
})
Then('Successful Message will appear.', () => {
    cy.on('window:alert', (text) => {
        expect(text).to.contains('Thank you for Reaching out to Us')
    })
})