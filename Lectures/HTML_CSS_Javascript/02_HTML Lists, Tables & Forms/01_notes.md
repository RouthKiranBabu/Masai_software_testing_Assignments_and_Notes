### **HTML Lists**

HTML lists are used to display items in a structured format. There are two main types of lists:

1. **Unordered List (`<ul>`)**: Displays items in bullet points.
2. **Ordered List (`<ol>`)**: Displays items in a numbered sequence.

Each item in the list is defined using the **`<li>`** tag.

#### **Examples**

- **Unordered List:**

    ```html
    <ul>
        <li>Apple</li>
        <li>Banana</li>
        <li>Cherry</li>
    </ul>
    ```

- **Ordered List:**

    ```html
    <ol>
        <li>Wake up</li>
        <li>Brush teeth</li>
        <li>Have breakfast</li>
    </ol>
    ```

---

### **HTML Tables**

HTML tables are used to display data in rows and columns. 

#### **Key Elements**

1. **`<table>`**: Defines the table.
2. **`<tr>`**: Defines a row in the table.
3. **`<td>`**: Defines a cell (data) in a row.
4. **`<th>`**: Defines a header cell, typically bold and centered.

Tables can also be styled using attributes like:
- **`border`**: Adds a border around the table and cells.
- **`cellpadding`**: Adds space inside cells.
- **`cellspacing`**: Adds space between cells.

#### **Example**

- **Basic Table with Border:**

    ```html
    <table border="1">
        <tr>
            <th>Name</th>
            <th>Age</th>
            <th>Country</th>
        </tr>
        <tr>
            <td>Alice</td>
            <td>25</td>
            <td>USA</td>
        </tr>
        <tr>
            <td>Bob</td>
            <td>30</td>
            <td>Canada</td>
        </tr>
    </table>
    ```

---

### **HTML Forms**

HTML forms are used to collect user input on a webpage.

#### **Key Elements**

1. **`<form>`**: The main tag that wraps all form elements. It can have attributes like:
    - **`action`**: URL to send the form data.
    - **`method`**: HTTP method to send the data (e.g., `POST` or `GET`).
2. **`<input type="text">`**: A basic text input field.
3. **`<textarea>`**: A multi-line text input field.
4. **`<select>`** and **`<option>`**: Dropdown menus to select an option.
5. **`<button type="submit">`**: Button to submit the form data.

#### **Example**

- **Simple Form Structure:**

    ```html
    <form action="/submit" method="post">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name"><br><br>

        <label for="message">Message:</label><br>
        <textarea id="message" name="message" rows="4" cols="50"></textarea><br><br>

        <label for="subject">Subject:</label>
        <select id="subject" name="subject">
            <option value="inquiry">Inquiry</option>
            <option value="support">Support</option>
            <option value="feedback">Feedback</option>
        </select><br><br>

        <button type="submit">Submit</button>
    </form>
    ```
