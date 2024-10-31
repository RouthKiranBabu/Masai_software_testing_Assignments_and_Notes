describe('Automation', () => {
    before(() => {
        cy.visit('https://the-internet.herokuapp.com/login')
    });
    beforeEach(() => {
        cy.log("From before Each.")
    });
    it('Test', () => {
        cy.xpath('//input[@name="username"]').type('tomsmith')
        cy.xpath('//input[@name="password"]').type('SuperSecretPassword!')
        cy.xpath('//button[@type="submit"]').click()
    });
    after(() => {
        cy.log("This is from after")
    });
    afterEach(() => {
        cy.log("This is from after each")
    });
});