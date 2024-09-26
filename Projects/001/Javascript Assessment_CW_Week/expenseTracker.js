// For creating a class
class ExpenseTracker{ 
    // Initially it class does not take anything
    constructor(){ 
        /*This is to store all the expenses done by addExpense method*/
        this.expenses = []
        // This variable is used at setBudget method
        this.budget = 0
        // This tracker list is used at trackSpending method for creating table
        this.tracker = []
        // Used to make header for creating CSV file
        this.header = [
            {id: "amount", title: "Amount"},
            {id: "category", title: "Category"},
            {id: "description", title: "Description"}
        ]
    }

    /* Method Takes: 
        1. parameters
    Process: 
        1. Store values in this.expenses and this.tracker
    Method Returns: 
        Message -> category has added, otherwise throw an error 
        if parameters datatype is not satisfying.*/
    addExpense(amount, category, description){

        // If statement checks if is not satisfying
        if(typeof amount !== "number" || typeof category !== "string" || typeof description !== "string"){
            // If it is not satisfying then creates a error
            throw new Error("Data Type Incorrect! [amount: number, category: string, description: string]");
        }

        // If the error is not created then Data given is corrent so
        // saving in the this.expenses
        this.expenses.push({amount, category, description});

        // Saving the data in the this.tracker Which includes year and month
        const date = new Date();
        const year = date.getFullYear();
        const month = date.getMonth() + 1;
        // Storing all the necessary information in the this.tracker 
        // which is created in the constructor as an empty list 
        this.tracker.push({year, month, category, amount, description});
        // Sends a notification in return that category is added
        return category.concat(" Added!");
    }

    /* Method Takes: None
    Process:
        1. Uses the reduce method
        2. Reduce method has:
            2.1. Initialize the acc to {}.
            2.2. If statement to check the category is present or not
                2.2.1. If no, Creates the list first the category
            2.3. Store the data: once list is created we have use push method.
            2.4. returns the acc
        3. Returns: return value of reduce method*/
    categorizeExpenses(){
        // returns the value given by reduce method
        return this.expenses.reduce((acc, expense) => {
            /* if statement is used to create an element "category : []" 
            initially becouse acc behaves as an empty dictionary initially*/
            if(!acc[expense.category]){
                // Certain category initialized to empty list
                acc[expense.category] = [];
            }
            // After having a list type we can use push method to store expense
            acc[expense.category].push(expense);
            return acc;
        }, {});
    }

    // This method is used to deliver the total amount of each category
    getExpenseSummaryByCategory(){
        // returns the reduce methods
        return this.expenses.reduce((acc, expense) => {
            /* Since acc is initially {} if statement is used to check
            absence of item */
            if(!acc[expense.category]){
                /* if the item is absent the create a element as 'category: 0'
                in the dictionary*/
                acc[expense.category] = 0;
            }
            /*Now here it increments the amount based on category*/ 
            acc[expense.category] += expense.amount;
            return acc;
        }, {});
    }

    // This method is to set the amount
    setBudget(amount){
        // If statement to check the amount is number typed otherwise error
        if(typeof amount !== "number"){ throw new Error("Budget must be a number!")}
        this.budget = amount;
        return `You have Successfully set the budget to ${amount}.`;
    }

    // Used to show the all the details of spending done in all year and month
    trackSpending(){
        // This variable is to sum total amount
        let total = 0;
        // This is used to show the data in form of table at output terminal
        let res = "";
        /* This variable stores the amount left as well as find the 
        total and store the all the information in form of string
        amountleft is initialized to this.budget*/
        let amtleft = this.tracker.reduce((amountleft, expense) => {
            // Increment the total amount
            total += expense.amount;
            // Decrement the amount if Expense amount is greater than 0
            amountleft -= expense.amount;
            // Used to create the string having all data while spending
            res = res.concat(`\nYear: ${expense.year}\t|\tMonth: ${expense.month.toString().padStart(2, "0")}\t|\tAmount Spend: ${expense.amount.toString().padStart(5, "0")}\t|\tCategory: ${expense.category}\t|\tDescription: ${expense.description}\n`)
            return amountleft;
        }, this.budget);
        return res.concat(`Budget: ${this.budget}\nPaid: ${total}\nLeft: ${amtleft}.`)
    }

    /*Methods Takes: the month
    process:
    1. Checks month is number
        1.1. If No -> throws an Error
        1.2. If Yes -> pass
    2. CsvWriter to save the data in CSV File
    3. Using of this.header
    4. Rows variable stores data using reduce method
    5. Rows data then written in csv file
    Returns:
    1. Error if the month is not number
    2. 'CSV file was written successfully' message if file created
    3. returns information related to expenses if it meets the month using filter method
    */
    generateMonthlyReport(month){
        // If statement to check type is incorrect
        if(typeof month !== "number"){
            throw new Error("Month Must be a Number!")
        }
        // Creates the csv writer
        const createcsvwriter = require('csv-writer').createObjectCsvWriter;
        // Providing information related to csv filename and header for the file
        const csvwriter = createcsvwriter({
            path: "MonthlyReport.csv",
            header: this.header
        });
        // Storing the information from the this.tracker to the rows
        const rows = this.tracker.reduce((acc, expense) => {
            if (expense.month === month){
                acc.push({amount : expense.amount, category : expense.category, description : expense.description})
            }
            return acc;
        }, []);
        // Write the csv file rows if the month is satisfying
        csvwriter.writeRecords(rows)
        .then(() => {
            console.log('CSV file was written successfully');
        });
        console.log("Monthly Report Generated!");
        return this.tracker.filter(user => user.month === month);
    }

    /*Methods Takes: the year
    process:
    1. Checks year is number
        1.1. If No -> throws an Error
        1.2. If Yes -> pass
    2. CsvWriter to save the data in CSV File
    3. Using of this.header
    4. Rows variable stores data using reduce method
    5. Rows data then written in csv file
    Returns:
    1. Error if the year is not number
    2. 'CSV file was written successfully' message if file created
    3. returns information related to expenses if it meets the month using filter method
    */
    generateYearlyReport(year){
        // Checks the year is not number
        if(typeof year !== "number"){
            // If year is not number throws an error
            throw new Error("Year Must be a Number!")
        }
        // Creates the csv writer
        const createcsvwriter = require('csv-writer').createObjectCsvWriter;
        // Providing the csv file name and its header
        const csvwriter = createcsvwriter({
            path: "YearlyReport.csv",
            header: this.header
        });
        // This variable is responsible for csv information
        const rows = this.tracker.reduce((acc, expense) => {
            if (expense.year === year){
                acc.push({amount : expense.amount, category : expense.category, description : expense.description})
            }
            return acc;
        }, []);
        // Transfering data from variable rows to file via csvwriter
        csvwriter.writeRecords(rows)
        .then(() => {
            console.log('CSV file was written successfully');
        });
        console.log("Yearly Report Generated!");
        // Used to print at the output terminal
        return this.tracker.filter(user => user.year === year);
    }
}
module.exports = {
    ExpenseTracker,
}