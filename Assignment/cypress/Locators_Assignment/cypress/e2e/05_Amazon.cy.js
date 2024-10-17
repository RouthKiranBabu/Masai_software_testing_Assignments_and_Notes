describe('Amazon website Xpath!', () => {
    it('1. Xpath', () => {
        cy.visit('https://www.amazon.com/')
        cy.xpath('//input[@placeholder="Search Amazon"]').type("cant hurt me")
        cy.xpath('(//input[@type="submit"])[1]').click()
    });
});