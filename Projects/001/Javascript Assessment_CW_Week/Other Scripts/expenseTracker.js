class ExpenseTracker {
    // Constructor does not take values initially
    constructor() {
        // Variable to store expenses
        this.expenses = [];
        // Budget initialized from 0
        this.budget = 0;
    }

    // Method to add a new expense
    addExpense(amount, category, description) {
        // To check the type of inputs and throw the error if not expected data type
        if (typeof amount !== 'number' || typeof category !== 'string' || typeof description !== 'string') {
            throw new Error('Invalid input types.');
        }
        // If theres no error this statement works
        this.expenses.push({ amount, category, description });
    }

    // Method to categorize expenses
    categorizeExpenses() {
        return this.expenses.reduce((acc, expense) => {
            if (!acc[expense.category]) {
                acc[expense.category] = [];
            }
            acc[expense.category].push(expense);
            return acc;
        }, {});
    }

    // Method to generate expense summary by category
    getExpenseSummaryByCategory() {
        return this.expenses.reduce((acc, expense) => {
            if (!acc[expense.category]) {
                acc[expense.category] = 0;
            }
            acc[expense.category] += expense.amount;
            return acc;
        }, {});
    }

    // Method to set a budget
    setBudget(amount) {
        if (typeof amount !== 'number') {
            throw new Error('Budget must be a number.');
        }
        this.budget = amount;
    }

    // Method to track spending
    trackSpending() {
        const totalSpent = this.expenses.reduce((sum, expense) => sum + expense.amount, 0);
        return {
            totalSpent,
            remainingBudget: this.budget - totalSpent
        };
    }

    // Method to generate monthly report
    generateMonthlyReport(month) {
        const filteredExpenses = this.expenses.filter(expense => new Date(expense.date).getMonth() + 1 === month);
        return filteredExpenses.reduce((acc, expense) => {
            if (!acc[expense.category]) {
                acc[expense.category] = 0;
            }
            acc[expense.category] += expense.amount;
            return acc;
        }, {});
    }

    // Method to generate yearly report
    generateYearlyReport(year) {
        const filteredExpenses = this.expenses.filter(expense => new Date(expense.date).getFullYear() === year);
        return filteredExpenses.reduce((acc, expense) => {
            if (!acc[expense.category]) {
                acc[expense.category] = 0;
            }
            acc[expense.category] += expense.amount;
            return acc;
        }, {});
    }
}

// Example usage:
const tracker = new ExpenseTracker();

// Add some example expenses
tracker.addExpense(50, 'food', 'Lunch at cafe');
tracker.addExpense(20, 'transport', 'Bus fare');
tracker.addExpense(100, 'food', 'Groceries');
tracker.addExpense(30, 'entertainment', 'Movie ticket');

// Set budget and track spending
tracker.setBudget(200);
console.log(tracker.trackSpending());

// Categorize expenses
console.log(tracker.categorizeExpenses());

// Get expense summary by category
console.log(tracker.getExpenseSummaryByCategory());

// Generate example monthly and yearly reports
// Assume the date field is populated in expenses for these methods to work correctly
console.log(tracker.generateMonthlyReport(8)); // Replace with actual month number
console.log(tracker.generateYearlyReport(2024)); // Replace with actual year

// Commenting throughout the code to explain sections and functionality
