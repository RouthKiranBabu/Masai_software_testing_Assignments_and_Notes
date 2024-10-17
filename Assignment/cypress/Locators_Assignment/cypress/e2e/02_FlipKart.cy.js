describe('FlipKart Xpaths!', () => {
    it('1. Xpaths', () => {
        cy.visit("https://www.flipkart.com/")
        cy.xpath('//img[@alt="Top Offers"]').click()
        cy.xpath('//img[@title="Flipkart"]').click()
    });
    it('2. Xpath', () => {
        cy.visit("https://www.flipkart.com/search?q=muscleblaze&sid=hlc%2Cetg&as=on&as-show=on&otracker=AS_QueryStore_OrganicAutoSuggest_1_6_na_na_na&otracker1=AS_QueryStore_OrganicAutoSuggest_1_6_na_na_na&as-pos=1&as-type=HISTORY&suggestionId=muscleblaze%7CHealth+Supplements&requestId=3b3bb852-af8a-4ea0-a725-1e1dcb5bb38f")
        cy.xpath('//input[@placeholder="Search for products, brands and more"]').type("muscleblaze")
        cy.xpath('//button[@type="submit"]').click()
    });
});