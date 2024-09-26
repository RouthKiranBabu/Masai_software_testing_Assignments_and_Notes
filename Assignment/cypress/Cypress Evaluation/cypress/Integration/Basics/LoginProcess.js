describe('Contains login process', () => {
    it('Login Process', () => {
        cy.visit("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        cy.get(".oxd-input.oxd-input--active").type("admin123");
        cy.get("placeholder=Username").type("Admin");
    });
});