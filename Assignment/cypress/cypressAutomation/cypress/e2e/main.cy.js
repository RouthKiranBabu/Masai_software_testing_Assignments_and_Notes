describe('Tests', () => {
    it('1. Price of creating the API Key', () => {
        cy.visit("https://www.coingecko.com/en/api/pricing").screenshot("noOptionForAPI")
    });
    it('2. Alert message Shows again after correct subscription', () => {
        cy.visit("https://www.coingecko.com/en/api/pricing")
        cy.xpath('(//div[@class="tw-flex-1"])[2]').screenshot("alertMessageAfterSubscribe")
        cy.xpath("(//input[@type='email'])[1]").click().screenshot("provideEmailForSubscribe")
    });
});