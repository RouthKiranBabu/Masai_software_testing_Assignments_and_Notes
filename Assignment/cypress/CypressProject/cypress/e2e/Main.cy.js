describe('Cypress automation on Automation test store!', () => {
    it('Procedures!', () => {
        cy.visit("https://automationteststore.com/")
        cy.xpath('//ul[@class="nav-pills categorymenu"]/li[2]').click()
        cy.xpath('(//div[@class="thumbnail"])[5]/a/img').click()
        //cy.xpath('//select[@name="option[350]"]').click()
        cy.xpath('(//li[@class="producthtumb"])[2]/a/img').click()
        cy.xpath('(//input[@type="text"])[2]').clear()
        cy.xpath('(//input[@type="text"])[2]').type("3")
        cy.xpath('//a[@class="cart"]').click()
        cy.xpath('(//a[@title="Checkout"])[2]').click()
        cy.xpath('(//input[@type="radio"])[2]').click()
        cy.xpath('(//button[@type="submit"])[1]').click()
        cy.xpath('//input[@name="firstname"]').type("Routh")
        cy.xpath('//input[@name="lastname"]').type("Kiran Babu")
        cy.xpath('(//input[@name="email"])[1]').type("routh@email.com")
        cy.xpath('(//input[@name="telephone"])[1]').type('1234567890')
        cy.xpath('//input[@name="fax"]').type("Fax1")
        cy.xpath('//input[@name="company"]').type("Company1")
        cy.xpath('//input[@name="address_1"]').type("Address_1")
        cy.xpath('//input[@name="city"]').type("city_1")
        // cy.xpath('//select[@name="zone_id"]/option[@value="3514"]').click()
        cy.xpath('//input[@name="postcode"]').type('Code_1')
        // cy.xpath('//select[@name="country_id"]').find('option').then(($ele) => {
        //     if($ele.find('//*[@value="4"]')){
        //         cy.wrap($ele).click()
        //     }
        // })
        cy.xpath('//input[@name="shipping_indicator"]').click()
        cy.xpath('//button[@title="Continue"]').click()
    });
});