describe('Assertions demo', () => {
    it('Implicit Assertions', () => {
        cy.visit("https://www.saucedemo.com/")
        // Logo is visible or not and exist or not
        cy.get('.login_logo').should('be.visible')
        .and('exist')
    });
});