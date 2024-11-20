class Book{
    final int bookID;
    String bookTitle;
    String author;
    boolean availabilityStatus;
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
        System.out.println("Book id: " + this.bookID + ".\nBook Title: " + this.bookTitle + ".\nAuthor: " + this.author + ".\nAvailable: " + this.availabilityStatus + ".\nIs Borrowed.");
    }
    void returnBook(){
        this.availabilityStatus = true;
        System.out.println("Book id: " + this.bookID + ".\nBook Title: " + this.bookTitle + ".\nAuthor: " + this.author + ".\nAvailable: " + this.availabilityStatus + ".\nBook Returned.");
    }
}

abstract class User{
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
    Patron(String name, int age, int userID){
        super(name, age, userID);
    }
    @Override
    void borrowBook(Book book){
        if(book.isAvailable()){
            book.borrow();
        }else{
            System.out.println("Book is not available!");
        }
    }
}

interface ReportGenerator{
    void generateReport();
    void generateUserReport();
}

class Librarian extends User implements ReportGenerator{
    Librarian(String name, int age, int userID){
        super(name, age, userID);
    }
    @Override
    void borrowBook(Book book){
        if(book.isAvailable()){
            book.borrow();
        }else{
            System.out.println("Book is not available!");
        }
    }
    @Override
    void generateReport(){
        
    }
    @Override
    void generateUserReport(){

    }
}

class Library{
    Book[] books;
    User[] users;
}

public class Solution{
    public static void main(String[] args) {
        
    }
}