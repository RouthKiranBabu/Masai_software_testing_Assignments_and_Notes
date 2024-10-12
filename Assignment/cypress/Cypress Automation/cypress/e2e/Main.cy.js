describe('Screenshots and Logs', () => {
    it('For google title!', () => {
        cy.visit('https://www.google.com/')
        cy.screenshot('HomePage')
        cy.xpath('//img[@alt="Google"]').screenshot('googleTitle')
        cy.log("ScreenShot Taken!")
    });
});