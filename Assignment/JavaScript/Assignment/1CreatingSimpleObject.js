// Creating the class name book
class book{
    // Constructor that takes input parameters
    constructor(title, author, yearPublished){
        // Since its the book which has title, its author, and year of publishing
        // and storing in the corresponding variable name
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }
    // this method or function of this class gives summary of the book.
    getSummary() {
        return `The book '${this.title}' by ${this.author} was published in ${this.yearPublished}.`
    }
}

// Create a new class providing values to the constructor
let book1 = new book("JavaScript Basics", "John Doe", 2021)
// calling the class method
console.log(book1.getSummary()) // The book 'JavaScript Basics' by John Doe was published in 2021.