<div align = center>

Official Website - [Link for Soft Assertions](https://playwright.dev/docs/test-assertions#soft-assertions)
</div>

# Code for Hard Assertions
  
```javascript
const {test, expect} = require("@playwright/test")

test("Soft Assertions", async ({page}) => {
    await page.goto("https://demoblaze.com/index.html")
    // Hard Assertions
    await expect(page).toHaveTitle("STORE")
    await expect(page).toHaveURL("https://demoblaze.com/index.html")
    await expect(page.locator('.navbar-brand')).toBeVisible()
    // npx playwright test part01_SoftAssertions.spec.js --project chromium
})
```
