class Product{
    addShirt(){
        cy.visit('https://automationteststore.com/')
        cy.xpath('(//i[@class="fa fa-cart-plus fa-fw"])[7]').click()
    }

}
export default Product;