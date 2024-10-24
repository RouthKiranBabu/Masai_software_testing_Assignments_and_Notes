describe('Orange HRM Login', () => {
    it('Procedure', () => {
        cy.visit('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')
        cy.xpath('//*[@placeholder="Username"]').type('Admin')
        cy.xpath('//*[@name="password"]').type('admin123')
        cy.xpath('//*[@type="submit"]').click()
        if(cy.url().should('include', 'dashboard')){
            cy.log('👉Yes Logged in!')
        }
    });
});