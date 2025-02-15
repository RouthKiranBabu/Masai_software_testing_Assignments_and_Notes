# Pre-requisites

```mermaid
graph LR;
a[Create Folder and Open in VSCode] --> b[Open Terminal]
b --> c[npm -i init]
c --> d[package name: assertion_package]
c --> e[Description: This is Description]
c --> f[keywords: cypress automation]
c --> g[author: Routh Kiran Babu]
c --> h[All otehr Cases type enter or Yes]
b --> i[npm install cypress --save -dev]
b --> j[npm install cypress-xpath]
b --> k[npx cypress open] --> l[Opens Cypress interface]
l --> m[Choose E2E Testing]
l --> n[Click Continue]
l --> o[Choose chrome and click on Start E2E Testing in Chrome]
l --> p[Click on Create new spec]
l --> q[Click on Create spec];
```

# Importing into the File

<div align = center>
  
|File|Code|
|--:|:--|
|command.js|`///<reference types = "cypress"/>`|
|e2e.js|`require("cypress-xpath")`|
</div>



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
