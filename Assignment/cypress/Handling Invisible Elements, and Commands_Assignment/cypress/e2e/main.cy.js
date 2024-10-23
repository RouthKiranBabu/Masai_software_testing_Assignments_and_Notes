describe('FlipKart website automation', () => {
    it('Validate Search Input Placeholder', () => {
        cy.visit('https://www.flipkart.com');
        if(cy.xpath('//input[@title="Search for Products, Brands and More"]').should('have.attr', 'placeholder', 'Search for Products, Brands and More')){
            cy.log("👉 Placeholder found!")
        }
    });
    it('Validate Category Text', () => {
        cy.visit('https://www.flipkart.com');
        cy.xpath('(//div[@class="YBLJE4"])[4]').find('span').then(($ele) => {
            if($ele.text() == "Electronics"){
                cy.log("👉 Yes found the Electronics word!")
            }
        })
    });
});