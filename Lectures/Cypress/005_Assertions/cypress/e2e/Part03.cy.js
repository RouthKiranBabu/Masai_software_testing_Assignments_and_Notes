describe('Assertions demo', () => {
    it('Implicit Assertions', () => {
        cy.visit("https://www.saucedemo.com/")
        cy.url().should('include', "saucedemo.com")
        .and('eq', "https://www.saucedemo.com/")
        .and('contain', 'saucedemo')
        .and('not.contain', 'sdemo') // Using not
    });
});