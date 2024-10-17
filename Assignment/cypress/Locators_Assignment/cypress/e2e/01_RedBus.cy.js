describe('Redbus xpaths!', () => {
    it('1.Xpath', () => {
        cy.visit('https://www.redbus.com/')
        cy.xpath('(//a[@target="_blank"])[1]').click()
    });
    it('2.Xpath', () => {
        cy.visit('https://www.redbus.com/')
        cy.xpath('(//img[@loading="lazy"])[1]').click()
    });
    it('3.Xpath', () => {
        cy.visit('https://www.redbus.com/')
        cy.xpath('(//div[@class="dib"])[1]').click()
    });
    it('4.Xpath', () => {
        cy.visit('https://www.redbus.com/')
        cy.xpath('//div[contains(text(), "Manage Booking")]').click()
    });
    it('5.Xpath', () => {
        cy.visit('https://www.redbus.com/')
        cy.xpath('(//*[contains(text(), "Login")])[1]').click()
    });
    it('6.Xpath', () => {
        // Without Providing the inputs searching
        cy.visit('https://www.redbus.com/')
        cy.xpath('//div[contains(text(), "SEARCH")]').click()
    });
});