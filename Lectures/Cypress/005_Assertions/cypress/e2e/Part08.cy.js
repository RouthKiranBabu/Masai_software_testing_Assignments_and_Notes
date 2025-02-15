describe('Assertions demo', () => {
    before(() => {
        cy.visit("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")
        cy.get("input[placeholder='Username']").type("Admin")
        cy.get("input[placeholder='Password']").type("admin123")
        cy.get("button[type='submit']").click()
    })
    it('TDD and BDD Style', () => {
        let expname = "Al Schäfer"
        cy.log("Got the Name: ", expname)
        cy.get(".oxd-userdropdown-name").then(($ele)=>{
            let actname = $ele.text()
            cy.log(actname)
            // BDD Style
            expect(actname).to.equal(expname)
            expect(actname).to.not.equal(expname + "😊")
            // TDD Style
            assert.equal(actname, expname)
            assert.notEqual(actname, expname + "😊")
        })
    });
});