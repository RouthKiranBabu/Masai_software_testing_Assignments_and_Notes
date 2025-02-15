describe('Assertions demo', () => {
    it('Implicit Assertions', () => {
        cy.visit("https://www.saucedemo.com/")
        cy.url().should('include', "saucedemo.com")
        cy.url().should('eq', "https://www.saucedemo.com/")
        cy.url().should('contain', 'saucedemo')
    });
});