describe('Checking Check Boxes', () => {
    beforeEach(() => {
        cy.visit("https://rahulshettyacademy.com/AutomationPractice/")
    });
    it('Test Script', () => {
        cy.get('input#checkBoxOption1').should('be.visible')
        cy.get('input#checkBoxOption1').check().should('be.checked')
        cy.wait(2000)
        cy.get('input#checkBoxOption1').uncheck().should('not.be.checked')
    });
    it('Selecting All CheckBoxes One by One', () => {
        cy.xpath("(//div[starts-with(@class, 'right')]/descendant::input)[1]").check().should('be.checked')
        cy.xpath("(//div[starts-with(@class, 'right')]/descendant::input)[2]").check().should('be.checked')
        cy.xpath("(//div[starts-with(@class, 'right')]/descendant::input)[3]").check().should('be.checked')
    });
    it('Selecting All CheckBoxes One at a Time', () => {
        cy.xpath("//div[@id = 'checkbox-example']/descendant::input").uncheck().should('not.be.checked')
        cy.wait(2000)
        cy.xpath("//div[@id = 'checkbox-example']/descendant::input").check().should('be.checked')
    });
    it('Selecting First and Last Element', () => {
        cy.xpath("//div[@id = 'checkbox-example']/descendant::input").first().check().should('be.checked')
        cy.wait(2000)
        cy.xpath("//div[@id = 'checkbox-example']/descendant::input").last().check().should('be.checked')
    });
});