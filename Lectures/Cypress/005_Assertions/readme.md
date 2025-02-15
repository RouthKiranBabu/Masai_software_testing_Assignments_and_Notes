# Pre-requisites
<img alt="Image" src="./imgvid/Pre Requisites.gif"> </img>

# Importing into the File

<div align = center>
  
|File|Added Code|
|--:|:--|
|command.js|`///<reference types = "cypress"/>`|
|e2e.js|`require("cypress-xpath")`|
</div>

# Assertions
<div align = right>

Official Website - [Click Here](https://docs.cypress.io/app/references/assertions)
</div>

## Using Implicit Assertions
```javascript
describe('Assertions demo', () => {
    it('Implicit Assertions', () => {
        cy.visit("https://www.saucedemo.com/")
        cy.url().should('include', "saucedemo.com")
        cy.url().should('eq', "https://www.saucedemo.com/")
        cy.url().should('contain', 'saucedemo')
    });
});
```
> [!WARNING]
> In the above code we are `using the cy.url() again and again`. [Learn](https://docs.github.com/en/get-started/writing-on-github/getting-started-with-writing-and-formatting-on-github/basic-writing-and-formatting-syntax#alerts)
```javascript
describe('Assertions demo', () => {
    it('Implicit Assertions', () => {
        cy.visit("https://www.saucedemo.com/")
        cy.url().should('include', "saucedemo.com")
        .should('eq', "https://www.saucedemo.com/")
        .should('contain', 'saucedemo')
    });
});
```
> [!TIP]
> It's better to `call the url once` and use the assertion multiple times.

> [!NOTE]
> We are using the `should Multiple times`.
```javascript
describe('Assertions demo', () => {
    it('Implicit Assertions', () => {
        cy.visit("https://www.saucedemo.com/")
        cy.url().should('include', "saucedemo.com")
        .and('eq', "https://www.saucedemo.com/")
        .and('contain', 'saucedemo')
        .and('not.contain', 'sdemo') // Using not
    });
});
```

## Assertion for Title and Logo Visibility
```javascript
describe('Assertions demo', () => {
    it('Implicit Assertions', () => {
        cy.visit("https://www.saucedemo.com/")
        cy.title().should('eq', 'Swag Labs')
        .and('include', 'Labs')
        .and('contain', 'Swag')

        cy.get('.login_logo').should('be.visible')
        // Alternative of Above
        cy.get('.login_logo').should('exist')
    });
});
```

## To check Logo Visibility and Existance
```javascript
describe('Assertions demo', () => {
    it('Implicit Assertions', () => {
        cy.visit("https://www.saucedemo.com/")
        // Logo is visible or not and exist or not
        cy.get('.login_logo').should('be.visible')
        .and('exist')
    });
});
```

<details>
  <summary>Cypress Best Feature</summary>
  <h3>Getting Elements From Cypress</h3>
  <img alt="Image" src="./imgvid/Cypressfeature.gif"> </img>
</details>

# Useful Website for Automating
 - [`SauceDemo`](https://www.saucedemo.com/) – Great for UI automation with different user roles.
- [`The Internet - HerokuApp`](https://the-internet.herokuapp.com/) – Simple login form for testing.
- [`DemoQA`](https://demoqa.com/) – Practice login and other UI elements.
- [`Parabank`](https://parabank.parasoft.com/parabank/index.htm) – A banking demo site with login functionality.
- [`OrangeHRM`](https://opensource-demo.orangehrmlive.com/web/index.php/auth/login) – HR management system login testing.
- [`Automation Practice`](https://www.automationexercise.com/) – E-commerce site login testing.
- API Testing (Login Authentication with API Calls):
  - [`ReqRes`](https://reqres.in/) – Fake API for testing login and CRUD operations.
  - [`Restful-Booker`](https://restful-booker.herokuapp.com/) – API testing with login authentication.
