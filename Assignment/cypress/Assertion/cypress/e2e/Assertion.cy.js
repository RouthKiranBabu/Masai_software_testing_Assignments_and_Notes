describe('Topic Assertion', () => {
    it('Login Page', () => {
        cy.visit('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')
        cy.xpath('//input[@placeholder="Username"]').type("Admin")
        cy.xpath('//input[contains(@name, "password")]').type("admin123")
        cy.xpath('//button[contains(@type, "submit")]').click()
        cy.get('.oxd-userdropdown-tab > .oxd-icon').then(($men) =>{
            cy.wrap($men).click()
        })
        cy.get(':nth-child(4) > .oxd-userdropdown-link').click()

    });
});