describe('Handle DropDowns', () => {
    it.skip('DropDown with Select', () => {
        cy.visit("https://www.zoho.com/commerce/free-demo.html")
        cy.get("#zcf_address_country")
        .select('Italy')
        .should('have.value', 'Italy')
        cy.wait(3000)
    });
    it('DropDown without Select', () => {
        cy.visit("https://www.dummyticket.com/dummy-ticket-for-visa-application/")
        cy.get("#select2-billing_country-container").click()
        .select('Italy')
        .should('have.value', 'Italy')
        cy.wait(3000)
    });
});