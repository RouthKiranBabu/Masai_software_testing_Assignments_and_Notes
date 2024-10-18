describe('Books to scrap!', () => {
    it('Verify page title!', () => {
        cy.visit("https://books.toscrape.com/")
        try{
            cy.title().should("eq", "My Store")
        }catch(err){
            cy.log(err)
        }
    });
    it('Non-ficton Link Click Functionality', () => {
        cy.visit("https://books.toscrape.com/")
        cy.xpath('//*[contains(text(), "Nonfiction")]').click()
        cy.title().should("contains", "Nonfiction")
        cy.screenshot("Nonfiction")
    });
    it('Add a book to the basket', () => {
        cy.visit("https://books.toscrape.com/")
        cy.xpath('//img[@alt = "Tipping the Velvet"]').click()
        cy.xpath('//*[contains(text(), "Add to basket")]').click()
    });
});