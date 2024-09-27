///<reference types="cypress-iframe" />
describe('Tests', () => {
    it('Test-1', () => {
        cy.visit('https://rahulshettyacademy.com/AutomationPractice/').scrollTo(0, 1500);
        cy.get('#courses-iframe').scrollTo(0, 100);
    });
});