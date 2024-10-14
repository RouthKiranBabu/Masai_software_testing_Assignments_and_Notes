describe('Tests in Simple Form!', () => {
    it('First Test', () => {
        // Enter into URL
        cy.visit('https://v1.training-support.net/selenium/simple-form')
        // Providing input and taking necessary screenshot
        cy.xpath('//input[@placeholder="First Name"]').type("myFirstName").screenshot('firstName')
        cy.xpath('//input[@placeholder="Last Name"]').type('myLastName').screenshot('lastName')
        cy.xpath('//input[@type="email"]').type("first.last@gmail.com")
        cy.xpath('//input[@placeholder="9876543210"]').type('1234567890')
        cy.xpath('//*[@rows="2"]').type("Hello, World!")
        // Screenshot to check all the necessary data
        cy.screenshot('ProvidedInput')
        cy.xpath('//input[@type="submit"]').click()
        // To check the title is expected correctly after submit
        if(cy.title().should('eq', "Simple Form")){
            cy.log("👉👉Yes Title contains 'Simple Form'")
        }
        // To check url contains the element 'selenium/simple-form?' after submit
        if(cy.url().should('contain', "selenium/simple-form?")){
            cy.log("👉👉Yes url consists 'selenium/simple-form?'")
        }
    });
});