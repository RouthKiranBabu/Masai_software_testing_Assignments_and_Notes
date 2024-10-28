describe('Tasks', () => {
    it('1. Enter the URL.', () => {
        cy.visit('https://automationteststore.com/')
    });
    it('2. Login or Register flow.', () => {
        let uname = "qwe123"
        let pwd = "12345"
        let notreg = false
        try{
            cy.visit('https://automationteststore.com/')
            cy.xpath('//a[contains(text(), "Login or register")]').click()
            cy.xpath('//input[@name="loginname"]').type(uname)
            cy.xpath('//input[@name="password"]').type(pwd)
            cy.xpath('(//button[@type="submit"])[2]').click()
            if(cy.xpath('//div[@class="alert alert-error alert-danger"]').should('be.visible')){
                notreg = true
                throw Error()
            }
        }catch(err){
            if (notreg){
                cy.log("You have not registered...")
                cy.log("Random Registration Process")
                cy.xpath('(//button[@type="submit"])[1]').click()
                cy.xpath('//input[@name = "firstname"]').type('qwe')
                cy.xpath('//input[@name = "lastname"]').type('123')
                cy.xpath('(//input[@name = "email"])[1]').type('qwe.123@gmail.com')
                cy.xpath('(//input[@name = "address_1"])[1]').type("Address_1_Given")
                cy.xpath('(//input[@name = "city"])[1]').type("City_1_Given") // [@value="3516"]
                cy.xpath('(//select[@name = "zone_id"])[1]').find('option').then(($ele) => {
                    if(i == 3){
                        cy.log("gggg")
                        cy.wrap($ele).click()
                    }
                })
            }
        }
        
    });
    it('3. Search skincare', () => {
        cy.visit("https://automationteststore.com/")
        cy.xpath('//a[contains(text(), "Login or ")]').click()
        cy.xpath('//input[@name="loginname"]').type('qwe123')
        cy.xpath('//input[@name="password"]').type('12345')
        cy.xpath('(//button[@type="submit"])[2]').click()
        cy.xpath('//img[@alt="Automation Test Store"]').click()
        cy.xpath('//input[@placeholder="Search Keywords"]').type("skincare")
        cy.xpath('//div[@title="Go"]').click()
    });
    it.only('4. Add to cart and Modify', () => {
        cy.visit("https://automationteststore.com/")
        cy.xpath('//a[contains(text(), "Login or ")]').click()
        cy.xpath('//input[@name="loginname"]').type('qwe123')
        cy.xpath('//input[@name="password"]').type('12345')
        cy.xpath('(//button[@type="submit"])[2]').click()
        cy.xpath('//img[@alt="Automation Test Store"]').click()
        cy.xpath('(//i[@class="fa fa-cart-plus fa-fw"])[7]').click()
        cy.xpath('//input[@name="quantity"]').clear().type('2')
        cy.xpath('//a[@class="cart"]').click()
        cy.xpath('//i[@class="fa fa-trash-o fa-fw"]').click()
        cy.xpath('//div[contains(text(), "Your shopping cart is empty")]').should('be.visible')
        cy.xpath('(//a[contains(text(), "Hair Care")])[2]').click()
        cy.xpath('(//i[@class="fa fa-cart-plus fa-fw"])[1]').click()
        cy.xpath('//input[@name="quantity"]').clear().type("3")
        cy.xpath('//a[@class="cart"]').click()
        cy.xpath('(//a[@title="Checkout"])[2]').click()
    });
    
});