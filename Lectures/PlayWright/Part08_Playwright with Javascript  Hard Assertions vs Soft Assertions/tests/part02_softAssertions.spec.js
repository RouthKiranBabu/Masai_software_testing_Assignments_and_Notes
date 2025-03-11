const {test, expect} = require("@playwright/test")

test("Soft Assertions", async ({page}) => {
    await page.goto("https://demoblaze.com/index.html")
    
    // Soft Assertions
    /* If any of the Execution got failed this doesn't terminate the
    Whole code.*/
    await expect.soft(page).toHaveTitle("STORE123")
    await expect.soft(page).toHaveURL("https://demoblaze.com/index.html")
    await expect.soft(page.locator('.navbar-brand')).toBeVisible()

    // npx playwright test part02_softAssertions.spec.js --project chromium
})