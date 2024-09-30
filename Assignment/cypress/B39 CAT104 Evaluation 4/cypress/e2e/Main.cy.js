describe('Tests', () => {
    it('Part-3', () => {
        cy.visit('https://automationexercise.com/')
        cy.xpath('//*[contains(text(), " Contact us")]').click()
        cy.xpath('//input[@placeholder="Name"]').type("Routh Kiran Babu")
        cy.xpath('(//input[@type="email"])[1]').type("routh@gmail.com")
        cy.xpath('(//input[@type="text"])[2]').type("Simple Text.")
        cy.xpath('//textarea[@name="message"]').type("Text Provided!")
        cy.xpath('//input[@type="submit"]').click()
        cy.get('.status').should('contain.text', "Success!")
    });
    it('Part-4', () => {
        cy.visit('http://testphp.vulnweb.com/login.php')
        cy.xpath('//input[@name="uname"]').type("test")
        cy.xpath('//input[@name="pass"]').type("test")
        cy.xpath('(//input[@type="submit"])[1]').click()
        cy.get('#pageName').should("contain.text", "(test)")
    });
});