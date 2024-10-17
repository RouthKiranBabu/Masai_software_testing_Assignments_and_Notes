const text = require("body-parser/lib/types/text");

describe('Big Basket Xpaths!', () => {
    it('1. Xpath', () => {
        cy.visit("https://www.bigbasket.com/")
        cy.xpath('(//span[contains(text(), "Tea")])[1]').click()
    });
});