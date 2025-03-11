const {test, expect} = require("@playwright/test")

test("Hard Assertions", async ({page}) => {
    await page.goto("https://demoblaze.com/index.html")
    
    // Hard Assertions
    await expect(page).toHaveTitle("STORE123")
    await expect(page).toHaveURL("https://demoblaze.com/index.html")
    await expect(page.locator('.navbar-brand')).toBeVisible()
    // npx playwright test part01_hardAssertions.spec.js --project chromium
})