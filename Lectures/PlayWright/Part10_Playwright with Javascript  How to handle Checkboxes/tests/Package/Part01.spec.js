const {test, expect} = require("@playwright/test")

test('Handle Checkboxes', async({page}) => {
    await page.goto("https://rahulshettyacademy.com/AutomationPractice/")
    await page.locator("(//div[starts-with(@id, 'check')]/descendant::input)[1]").check()
    await page.waitForTimeout(1000)
    await page.check("(//div[starts-with(@id, 'check')]/descendant::input)[2]")
    await page.waitForTimeout(1000)
    // Do not use page.check() in expect
    expect(await page.locator("(//div[starts-with(@id, 'check')]/descendant::input)[2]")).toBeChecked()
    expect(await page.locator("(//div[starts-with(@id, 'check')]/descendant::input)[2]").isChecked()).toBeTruthy()
    expect(await page.locator("(//div[starts-with(@id, 'check')]/descendant::input)[3]").isChecked()).toBeFalsy()
    
    const cblocators = [
        "(//div[starts-with(@id, 'check')]/descendant::input)[1]",
        "(//div[starts-with(@id, 'check')]/descendant::input)[2]"
    ]

    for(const locator of cblocators){
        await page.locator(locator).uncheck()
        await page.waitForTimeout(2000)
    }

    const cballlocators = [
        "(//div[starts-with(@id, 'check')]/descendant::input)[1]",
        "(//div[starts-with(@id, 'check')]/descendant::input)[2]",
        "(//div[starts-with(@id, 'check')]/descendant::input)[3]"
    ]

    for(const locator of cballlocators){
        if(await page.locator(locator).isChecked()){
            await page.locator(locator).uncheck()
        }else{
            await page.locator(locator).check()
        }
        await page.waitForTimeout(2000)
    }

    await page.waitForTimeout(3000)
});