describe('This contains the collection of tests', () => {
    it('First Positive Testing', () => {
        cy.visit("https://Google.com");
        // Testing whether the title is Google
        cy.title().should('eq', "Google");
    });
    it('First Negitive Testing', () => {
        cy.visit("https://Google.com");
        // Testing wether we get the assertion error for negative testing
        cy.title().should('eq', "Google123");
    });
});