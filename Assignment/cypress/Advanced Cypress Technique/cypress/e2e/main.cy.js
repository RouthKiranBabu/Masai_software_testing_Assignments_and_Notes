describe('Iframe', () => {
    it('test', () => {
        cy.visit('https://rahulshettyacademy.com/AutomationPractice/')
        cy.scrollTo(0, 2000)
        cy.getIframe('//iframe[@id="courses-iframe"]').scrollTo(0, 500).find('(//a[contains(text(), "JOIN N")])[1]').click()
    });
});