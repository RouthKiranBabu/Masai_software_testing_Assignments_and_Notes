import Login from "../PageObjects/LoginPage.js";
import Product from "../PageObjects/ProductPage.js";
import addToCart from "../PageObjects/CartPage.js";

describe('Tests', () => {
    it('1. Login', () => {
        cy.visit('https://automationteststore.com/index.php?rt=account/login')
        cy.fixture('loginUser').then((data) => {
            const lg = new Login();
            lg.setLoginName(data.username);
            lg.setPassword(data.password);
            lg.clickLogin();
            lg.verify();
        })
    });
    it('2. Product', () => {
        const pd = new Product();
        pd.addShirt();
    });
    it('3. Add to Cart', () => {
        const pd = new Product();
        pd.addShirt();
        const ct = new addToCart();
        ct.addToCrt();
    });
});