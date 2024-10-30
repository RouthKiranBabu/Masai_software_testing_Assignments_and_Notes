class Login{
    setLoginName(username){
        cy.xpath('//input[@name="loginname"]').type(username)
    }
    setPassword(password){
        cy.xpath('//input[@name="password"]').type(password)
    }
    clickLogin(){
        cy.xpath('(//button[@type="submit"])[2]').click()
    }
    verify(){
        cy.url().should('includes', 'rt=account/account')
    }
}
export default Login;