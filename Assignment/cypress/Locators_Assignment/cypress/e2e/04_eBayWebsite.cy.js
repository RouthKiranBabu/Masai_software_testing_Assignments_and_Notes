describe('eBay Xpaths', () => {
    it('1. Xpath', () => {
        cy.visit("https://www.ebay.com/")
        cy.xpath('(//div[contains(text(), "Shop now")])[2]').click()
        cy.wait(2000)
        cy.get("#gh-logo").click()
    });
});