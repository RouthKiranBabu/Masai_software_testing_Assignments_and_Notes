class Book{
    final int bookID;
    String bookTitle;
    String author;
    private boolean availabilityStatus;
    Book(final int bookid, String title, String author){
        this.bookID = bookid;
        this.bookTitle = title;
        this.author = author;
        this.availabilityStatus = true;
    }
    Book(final int bookid, String title, String author, boolean availabilityStatus){
        this.bookID = bookid;
        this.bookTitle = title;
        this.author = author;
        this.availabilityStatus = availabilityStatus;
    }
    boolean isAvailable(){
        return this.availabilityStatus;
    }
    void borrow(){
        this.availabilityStatus = false;
        System.out.println("Book id: " + this.bookID + ".\nBook Title: " + this.bookTitle + ".\nAuthor: " + this.author + ".\nAvailable(after Taking): " + this.availabilityStatus + ".\n[Book Borrowed.]\n");
    }
    void returnBook(){
        this.availabilityStatus = true;
        System.out.println("Book id: " + this.bookID + ".\nBook Title: " + this.bookTitle + ".\nAuthor: " + this.author + ".\nAvailable(after Returning): " + this.availabilityStatus + ".\n[Book Returned.]\n");
    }
}

abstract class User{
    String category = "User";
    String name;
    int age;
    int userID;
    User(String name, int age, int userID){
        this.name = name;
        this.age = age;
        this.userID = userID;
    }
    abstract void borrowBook(Book book);
    void returnBook(Book book){
        book.returnBook();
    }
}

class Patron extends User{
    String category = "Patron";
    Patron(String name, int age, int userID){
        super(name, age, userID);
    }
    @Override
    void borrowBook(Book book){
        if(book.isAvailable()){
            book.borrow();
        }else{
            System.out.println("[Sorry, " + this.name + " Book title: " + book.bookTitle + " is not available.]\n");
        }
    }
    @Override
    void returnBook(Book book){
        if(book.isAvailable()){
            System.out.println("Is this a duplicate book!\n");
        }else{
            book.returnBook();
        }
    }
}

class Library{
    Book[] books = new Book[10];
    User[] users = new User[10];
    Patron[] patrons = new Patron[10];
    Librarian[] librarians = new Librarian[10];
    static int bookindex = 0;
    static int userindex = 0;
    static int patrindex = 0;
    static int librindex = 0;
    void addBook(Book book){
        books[bookindex] = book;
        bookindex += 1;
    }
    void addUser(User user){
        users[userindex] = user;
        userindex += 1;
    }
    void addUser(Patron patr){
        patrons[patrindex] = patr;
        patrindex += 1;
    }
    void addUser(Librarian libr){
        librarians[librindex] = libr;
        librindex += 1;
    }
    void listBooks(){
        System.out.println("\nList of Books: \n**********************");
        try{
            for(int i = 0; i < this.books.length; i ++){
                Book b = this.books[i];
                System.out.println("Si no: " + i + ".\nBook id: " + b.bookID + ".\nTitle: " + b.bookTitle + ".\nAuthor: " + b.author + ".\nAvailability status: " + b.isAvailable() + ".\n");
            }
        }
        catch(NullPointerException npe){}
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^");
    }
    void listUsers(){
        System.out.println("\nList of Users: \n**********************");
        for(int i = 0; i < userindex; i ++){
            User u = this.users[i];
            System.out.println("Si no: " + i + ".\nUsername: [" + u.name + "].\nAge: " + u.age + ".\nUser id: " + u.userID + ".\n");
        }
        System.out.println("\nList of Patron: \n**********************");
        for(int i = 0; i < patrindex; i ++){
            User u = this.patrons[i];
            System.out.println("Si no: " + i + ".\nUsername: [" + u.name + "].\nAge: " + u.age + ".\nUser id: " + u.userID + ".\n");
        }
        System.out.println("\nList of librarian: \n**********************");
        for(int i = 0; i < librindex; i ++){
            User u = this.librarians[i];
            System.out.println("Si no: " + i + ".\nUsername: [" + u.name + "].\nAge: " + u.age + ".\nUser id: " + u.userID + ".\n");
        }
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^");
    }
}

interface ReportGenerator{
    void generateReport();
    void generateUserReport();
}

class Librarian extends User implements ReportGenerator{
    String category = "Librarian";
    Library lib = new Library();
    Librarian(String name, int age, int userID, Library lib){
        super(name, age, userID);
        this.lib = lib;
    }
    @Override
    public void generateReport(){
        System.out.println("\nGenerated Book Reports: ");
        Book[] books = this.lib.books;
        try{
            for(int i = 0; i < books.length; i ++){
                System.out.println("Book Title: " + books[i].bookTitle + ". Book status(available): " + books[i].isAvailable());
            }
        }
        catch(NullPointerException npe){}
        System.out.println();
    }
    @Override
    public void generateUserReport(){
        User[] users = this.lib.users;
        System.out.println("\nGenerated User Reports: ");
        try{
            for(int i = 0; i < users.length; i ++){
                System.out.println("Username: " + users[i].name + ".");
            }
        }
        catch(NullPointerException npe){}
        Patron[] patr = this.lib.patrons;
        try{
            for(int i = 0; i < patr.length; i ++){
                System.out.println("Patron Name: " + patr[i].name + ".");
            }
        }
        catch(NullPointerException npe){}
        Librarian[] libr = this.lib.librarians;
        try{
            for(int i = 0; i < libr.length; i ++){
                System.out.println("Librarian Name: " + libr[i].name + ".");
            }
        }
        catch(NullPointerException npe){}
        System.out.println();
    }
    @Override
    void borrowBook(Book book){
        if(book.isAvailable()){
            book.borrow();
        }else{
            System.out.println("[Sorry, " + this.name + " Book title: " + book.bookTitle + " is not available.]\n");
        }
    }
    @Override
    void returnBook(Book book){
        if(book.isAvailable()){
            System.out.println("Is this a duplicate book!\n");
        }else{
            book.returnBook();
        }
    }
}

public class Solution{
    public static void main(String[] args) {
        Book b1 = new Book(1, "Book_1", "Author_1");
        Book b2 = new Book(2, "Book_2", "Author_2", true);
        Book b3 = new Book(3, "Book_3", "Author_3", false);

        User u1 = new Patron("User 1", 12, 0);
        User u2 = new Patron("User_2", 13, 1);
        Patron p1 = new Patron("Patr 1", 14, 2);
        Patron p2 = new Patron("Patr_2", 15, 3);
        Library l = new Library();

        u1.borrowBook(b1);
        u2.borrowBook(b1);

        u1.returnBook(b1);
        u2.borrowBook(b1);

        p1.borrowBook(b2);
        p1.borrowBook(b3);

        p2.borrowBook(b3);

        l.addBook(b1);
        l.addBook(b2);
        l.addBook(b3);
        l.addUser(u1);
        l.addUser(u2);
        l.addUser(p1);
        l.addUser(p2);

        l.listBooks();
        l.listUsers();

        Librarian librn = new Librarian("Librarian_1", 23, 4, l);
        l.addUser(librn);
        p1.returnBook(b3);
        System.out.println("Librarian chance to borrow: ");
        librn.borrowBook(b3);
        System.out.println("Librarian chance to return: ");
        librn.returnBook(b3);
        librn.generateReport();
        librn.generateUserReport();
    }
}
/*Output
Book id: 1.
Book Title: Book_1.
Author: Author_1.
Available(after Taking): false.
[Book Borrowed.]

[Sorry, User_2 Book title: Book_1 is not available.]

Book id: 1.
Book Title: Book_1.
Author: Author_1.
Available(after Returning): true.
[Book Returned.]

Book id: 1.
Book Title: Book_1.
Author: Author_1.
Available(after Taking): false.
[Book Borrowed.]

Book id: 2.
Book Title: Book_2.
Author: Author_2.
Available(after Taking): false.
[Book Borrowed.]

[Sorry, Patr 1 Book title: Book_3 is not available.]

[Sorry, Patr_2 Book title: Book_3 is not available.]


List of Books: 
**********************
Si no: 0.
Book id: 1.
Title: Book_1.
Author: Author_1.
Availability status: false.

Si no: 1.
Book id: 2.
Title: Book_2.
Author: Author_2.
Availability status: false.

Si no: 2.
Book id: 3.
Title: Book_3.
Author: Author_3.
Availability status: false.

^^^^^^^^^^^^^^^^^^^^^^

List of Users: 
**********************
Si no: 0.
Username: [User 1].
Age: 12.
User id: 0.

Si no: 1.
Username: [User_2].
Age: 13.
User id: 1.


List of Patron: 
**********************
Si no: 0.
Username: [Patr 1].
Age: 14.
User id: 2.

Si no: 1.
Username: [Patr_2].
Age: 15.
User id: 3.


List of librarian: 
**********************
^^^^^^^^^^^^^^^^^^^^^^
Book id: 3.
Book Title: Book_3.
Author: Author_3.
Available(after Returning): true.
[Book Returned.]

Librarian chance to borrow: 
Book id: 3.
Book Title: Book_3.
Author: Author_3.
Available(after Taking): false.
[Book Borrowed.]

Librarian chance to return: 
Book id: 3.
Book Title: Book_3.
Author: Author_3.
Available(after Returning): true.
[Book Returned.]


Generated Book Reports: 
Book Title: Book_1. Book status(available): false
Book Title: Book_2. Book status(available): false
Book Title: Book_3. Book status(available): true


Generated User Reports: 
Username: User 1.
Username: User_2.
Patron Name: Patr 1.
Patron Name: Patr_2.
Librarian Name: Librarian_1.


*/
