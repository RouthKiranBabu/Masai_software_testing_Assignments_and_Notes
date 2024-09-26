describe('Login Process', () => {
    it('Process', () => {
        cy.visit("https://opensource-demo.orangehrmlive.com/");
        cy.get("[name='username']").type("Admin")
        cy.get("[placeholder='Password']").type("admin123")
        cy.get(".oxd-button").click()
    });
});