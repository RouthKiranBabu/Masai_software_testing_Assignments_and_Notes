///<reference types="cypress" />
describe('Books to Scrape', () => {
    it('Verify page title', () => {
        cy.visit('https://books.toscrape.com/')
        //cy.title().should('be.equal', "All products | Books to Scrape - Sandbox")
        //cy.title().should('be.not.equal', "All products | Books to Scrape - Sandbox")
        cy.title().should('be.not.equal', "My Store");
    });
    it('Non fiction link click Functionality', () => {
        cy.visit('https://books.toscrape.com/')
        cy.xpath('//a[contains(text(), "Nonfiction")]').click();
    });
    it('Add to Basket', () => {
        cy.visit('https://books.toscrape.com/')
        cy.get('[alt="Tipping the Velvet"]').click()
        cy.get('.btn').click()
    });
});