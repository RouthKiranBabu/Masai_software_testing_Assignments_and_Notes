<div align = center>

Official Website - [Link for Soft Assertions](https://playwright.dev/docs/test-assertions#soft-assertions)
</div>

# Code for Hard Assertions
## Code
```javascript
const {test, expect} = require("@playwright/test")

test("Soft Assertions", async ({page}) => {
    await page.goto("https://demoblaze.com/index.html")
    // Hard Assertions
    await expect(page).toHaveTitle("STORE123")
    await expect(page).toHaveURL("https://demoblaze.com/index.html")
    await expect(page.locator('.navbar-brand')).toBeVisible()
    // npx playwright test part01_SoftAssertions.spec.js --project chromium
})
```
## Report
<img alt="Image" src="./imgif/hardassertions.png"> </img>
>[!NOTE]
>In Hard Assertions if something fails its stops without executing below.
