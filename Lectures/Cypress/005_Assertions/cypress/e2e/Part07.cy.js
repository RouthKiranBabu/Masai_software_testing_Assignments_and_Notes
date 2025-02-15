describe('Assertions demo', () => {
    it('Implicit Assertions', () => {
        cy.visit("https://www.saucedemo.com/")
        cy.get("input[placeholder='Username']").type("standard_user")
        .should('have.value', 'standard_user')
    });
});