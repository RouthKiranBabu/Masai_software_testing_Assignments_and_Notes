describe('Handle DropDowns', () => {
    it('DropDown with Select', () => {
        cy.visit("https://www.zoho.com/commerce/free-demo.html")
        cy.get("#zcf_address_country")
        .select('Italy')
        .should('have.value', 'Italy')
        cy.wait(3000)
    });
});