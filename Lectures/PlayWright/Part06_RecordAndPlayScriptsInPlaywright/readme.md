# Code to Start the Code Generator

## Type Code in Terminal
```java
npx playwright codegen
```
 - Which open the browser and Playwright Inspector
If you do things in browser it automatically writes the code in Inspector. [Video Link](https://youtu.be/0nxJ30ftGHE).
## Video showcasing use of Locators in Inspector
<img alt="Locator" src="./locator.gif"> </img>

## Video showcasing use of Target in Inspector
<img alt="Target" src="./target.gif"> </img>
 - Code changes for different programming language by default it happens for node.js.
 - Issue - Need to Create the file (*.spec.js) Where we need to paste the code which is copied from the inspector.

## Terminal Code of Playwright
```bash
npx playwright codegen --help
```
 - Which provides others related commands.
 - `[--target]` for which language you want to store.
 - `[-b, --browser, ...]` to run the script in the desired browser or related browser.
 - `[--viewport-size]` to customize the browser size.
 - `[-o or --output pathLocation]` Automatically Creates the spec file and save the Script in it.
    - Example: 
        ```javascript
        npx playwright codegen -o tests/Part01.spec.js
        ```
<div  align = center>
<img alt="Target" src="./useOfCodegenCreateScript.gif" width = 100%> </img>
</div>
 - For Opening with different target[Javascript is Bydefault]:
    ```javascript
    npx playwright codegen --target javascript
    ```
- To Execute in Chrome Browser[`-b` or `--browser`]:
    ```bash
    npx playwright codegen -b chromium
    ```
 - To Open the Simulator:
    ```bash
    npx playwright codegen --device "iPhone 11"
    ```
    - Example
        <div  align = center width = 100%>
        <img alt="Target" src="./automatingInDevice.gif" > </img>
        </div>
 - Customizing the Size of Browser
    ```bash
    npx playwright codegen --viewport-size "300, 150"
    ```
    - Example
        <div  align = center>
        <img alt="Target" src="./customizeBrowserSize.gif" > </img>
        </div>
        
# Resources😊
 - [Video](https://www.youtube.com/watch?v=_y7Q9tcbInU&list=PLUDwpEzHYYLsw33jpra65LIvX1nKWpp7-&index=6)
