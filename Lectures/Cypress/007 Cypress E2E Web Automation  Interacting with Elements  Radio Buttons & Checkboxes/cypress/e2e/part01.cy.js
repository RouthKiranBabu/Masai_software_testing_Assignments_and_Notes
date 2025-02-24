describe('Check UI Elements', () => {
    it('Checking Radio Buttons', () => {
        cy.visit("https://rahulshettyacademy.com/AutomationPractice/")
        cy.xpath("(//div[starts-with(@class, 'left') and contains(@id, 'btn')]/descendant::input)[1]").should('be.visible')
        cy.get("input[value='radio1']").should('be.visible')
        cy.get("input[value='radio1']").check().should('be.checked')
        cy.get("input[value='radio2']").should('not.be.checked')
        cy.wait(2000)
        cy.get("input[value='radio2']").check().should('be.checked')
        cy.get("input[value='radio1']").should('not.be.checked')
    });
});