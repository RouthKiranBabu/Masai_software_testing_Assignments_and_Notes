describe('Assertions demo', () => {
    it('Implicit Assertions', () => {
        cy.visit("https://www.saucedemo.com/")
        cy.url().should('include', "saucedemo.com")
        .should('eq', "https://www.saucedemo.com/")
        .should('contain', 'saucedemo')
    });
});