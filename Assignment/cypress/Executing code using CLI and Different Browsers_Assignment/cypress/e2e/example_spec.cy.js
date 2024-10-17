describe('👉Simple Form Submit!', () => {
    it('Visit then providing values finally submit', () => {
        cy.visit("https://v1.training-support.net/selenium/simple-form")
        cy.xpath('//input[@placeholder="First Name"]').type("FirstNameGiven")
        cy.xpath('//input[@placeholder="Last Name"]').type("LastNameGiven")
        cy.xpath('//input[@type="email"]').type("123@gmail.com").screenshot('Email')
        cy.xpath('//input[@placeholder="9876543210"]').type("1234567890")
        if (cy.xpath('//textarea[@rows="2"]').type("Hello, World!").should("contain.value", "Hello")){
            cy.log("Log Message 👉 Provided the Message!")
        }
        cy.screenshot("afterDataProviding")
        cy.xpath('//input[@type="submit"]').click()
    });
});