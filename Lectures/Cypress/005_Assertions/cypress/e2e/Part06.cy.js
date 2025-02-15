describe('Assertions demo', () => {
    it('Implicit Assertions', () => {
        cy.visit("https://www.saucedemo.com/")
        cy.xpath("//div").should('have.length', "14")
    });
});