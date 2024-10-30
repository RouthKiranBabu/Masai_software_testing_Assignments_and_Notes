class addToCart{
    addToCrt(){
        cy.xpath('//a[@class="cart"]').click()
    }
}
export default addToCart;