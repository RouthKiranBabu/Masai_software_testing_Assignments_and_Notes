describe('Tests', () => {
    it('1. Display Hello world', () => {
        cy.visit('https://the-internet.herokuapp.com/dynamic_loading/1')
        cy.xpath('//button[contains(text(), "Start")]').click()
        cy.xpath('//h4[contains(text(), "Hello ")]').should('not.be.visible')
        cy.wait(1000)
        cy.xpath('//h4[contains(text(), "Hello ")]').should('be.visible')
        cy.log("👉 Hello World Visible by now!")
    });
    it('2. Fetching Valu', () => {
        cy.visit('https://the-internet.herokuapp.com/tables')
        cy.xpath('//table[1]/tbody/tr[4]/td[3]').invoke('text').then(($ele) => {
            cy.log("Value at 4th row and 3rd column: " + $ele)
        })
        cy.xpath('//table[2]/tbody/tr[2]/td[6]').invoke('text').then(($ele) => {
            cy.log("Value at 2nd row and last column: " + $ele)
        })
    });
    it('3. Handling window', () => {
        cy.visit('https://the-internet.herokuapp.com/windows')
        cy.xpath('//a[contains(text(), "Click")]').click()
        cy.log('After Clicked!')
    });
    it('4.1. Handling Alerts', () => {
        cy.visit("https://the-internet.herokuapp.com/javascript_alerts")
        cy.xpath('//ul/li[1]/button').click()
        cy.on('window:alert', (txt) => {
            expect(txt).to.contain("I am a ") // JS Alert
            expect(txt).to.equal("I am a JS Alert")
        })
    });
    it('4.2. Handling Alerts', () => {
        cy.visit("https://the-internet.herokuapp.com/javascript_alerts")
        cy.xpath('//ul/li[2]/button').click()
        cy.on("window:confirm", (txt) => {
            expect(txt).to.contain("I am a ")
            expect(txt).to.equal("I am a JS Confirm")
        })
    });
    it.only('4.3. Handling Alerts', () => {
        cy.visit("https://the-internet.herokuapp.com/javascript_alerts")
        cy.xpath('//ul/li[3]/button').click()
    });
});