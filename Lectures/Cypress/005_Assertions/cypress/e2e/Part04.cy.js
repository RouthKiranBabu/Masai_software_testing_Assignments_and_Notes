describe('Assertions demo', () => {
    it('Implicit Assertions', () => {
        cy.visit("https://www.saucedemo.com/")
        cy.title().should('eq', 'Swag Labs')
        .and('include', 'Labs')
        .and('contain', 'Swag')

        cy.get('.login_logo').should('be.visible')
        // Alternative of Above
        cy.get('.login_logo').should('exist')
    });
});