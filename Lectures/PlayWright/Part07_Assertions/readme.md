# Playwright Assertions
<div align = right>

Official Website - [Click Here](https://playwright.dev/docs/test-assertions#auto-retrying-assertions)
</div>
<div align = center width = 100%>
  
|Assertion|Description|
|-:|:-|
|`expect(page).toHaveURL()`|Page has URL|
|`expect(page).toHaveTitle()`|Page has title|
|`expect(locator).toBeVisible()`|Element is Visible|
|`expect(locator).toBeEnabled()`|Control is Enabled|
|`expect(locator).toBeDisabled()`|Element is Disabled|
|`expect(locator).toBeChecked()`|Radio/Checkbox is checked|
|`expect(locator).toHaveAttribute()`|Element has Attribute|
|`expect(locator).toHaveText()`|Element matches text|
|`expect(locator).toContaintext()`|Element Contains Text|
|`expect(locator).toHaveValue(value)`|Input has a Value|
|`expect(locator).toHaveCount()`|List of elements has given length|
</div>

> [!TIP]
> In playwright.config.js -> testDir: './tests/Part07_Assertions' So you can run all the tests in on Space. [Learn](https://docs.github.com/en/get-started/writing-on-github/getting-started-with-writing-and-formatting-on-github/basic-writing-and-formatting-syntax#alerts)

# Assertions
## For URL
```javascript
    await page.goto('https://demo.nopcommerce.com/register')
    await expect(page).toHaveURL('https://demo.nopcommerce.com/register')
    await page.waitForTimeout(3000); // Waits for 3 seconds
  ```
## For Title
```javascript
  await expect(page).toHaveTitle('nopCommerce demo store. Register')
```

<details>
  <summary>Image</summary>

  <img alt="Image" src="./imgvid/title.png"> </img>
</details>

## For Header Logo Visibility
```javascript
    const logoElement = await page.locator('.header-logo')  
    await expect(logoElement).toBeVisible()
```

<details>
  <summary>Gif</summary>

  <img alt="Image" src="./imgvid/headerlogo.gif"> </img>
</details>

## For Search Box Enable
```javascript
    const searchStoreBox = await page.locator("//input[@id = 'small-searchterms']")
    await expect(searchStoreBox).toBeEnabled()
```

<details>
  <summary>Gif</summary>

  <img alt="Image" src="./imgvid/inputSearch.gif"> </img>
</details>

## For Male Radio Button Enable
```javascript
    const maleRadioButton = await page.locator('#gender-male')  // For radio button
    await maleRadioButton.click()                               // Select Radio Button
    await expect(maleRadioButton).toBeChecked()
```

<details>
  <summary>Gif</summary>

  <img alt="Image" src="./imgvid/maleradiobutton.gif"> </img>
</details>

## For NewsLetter Check
```javascript
    const newsCheckBox = await page.locator('#Newsletter')
    await expect(newsCheckBox).toBeChecked()
```

<details>
  <summary>Gif</summary>

  <img alt="Image" src="./imgvid/newsletter.gif"> </img>
</details>
