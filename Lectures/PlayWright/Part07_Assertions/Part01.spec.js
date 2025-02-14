const {test, expect} = require('@playwright/test')

test('AssertionsTest', async ({page}) => {
    await page.goto('https://demo.nopcommerce.com/register')
    await expect(page).toHaveURL('https://demo.nopcommerce.com/register')
    await page.waitForTimeout(3000); // Waits for 3 seconds

    // In terminal> npx playwright test tests/Part07_Assertions/Part01.spec.js --project chromium
    await expect(page).toHaveTitle('nopCommerce demo store. Register')
    
    const logoElement = await page.locator('.header-logo')  
    await expect(logoElement).toBeVisible()
    
    const searchStoreBox = await page.locator("//input[@id = 'small-searchterms']")
    await expect(searchStoreBox).toBeEnabled()

    const maleRadioButton = await page.locator('#gender-male')  // For radio button
    await maleRadioButton.click()                               // Select Radio Button
    await expect(maleRadioButton).toBeChecked()

    const newsCheckBox = await page.locator('#Newsletter')
    await expect(newsCheckBox).toBeChecked()
    
    const regbutton = await page.locator('#register-button')
    await expect(regbutton).toHaveAttribute('type', 'submit')

    // To check exact text
    await expect(await page.locator('.page-title h1')).toHaveText('Register')
    // To check partial text
    await expect(await page.locator('.page-title h1')).toContainText('ister')

    const emailinput = await page.locator('#Email')
    await emailinput.fill('test@demo.com')
    await expect(emailinput).toHaveValue('test@demo.com')

    const options = await page.locator('.form-fields')
    await expect(options).toHaveCount(4)
})