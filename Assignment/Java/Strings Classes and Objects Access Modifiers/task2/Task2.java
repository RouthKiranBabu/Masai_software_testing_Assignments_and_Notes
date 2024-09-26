class Book{
    // Making variables as private so class can access this
    private String title;
    private String author;
    private double price;
    // creating constructor to initialize the value
    public Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    // Getter method to get title
    public String getTitle(){
        return this.title;
    }
    // Getter method to get Author
    public String getAuthor(){
        return this.author;
    }
    // Getter method to get price
    public double getPrice(){
        return this.price;
    }
    // Displays title, author and price
    public void displayinfo(){
        System.out.print("\nTitle: " + this.title + "\nAuthor: " + this.author + "\nPrice: " + this.price + "\n");
    }
}

class Libary{
    public Libary(String title, String author, double price){
        // Shows this result when Libary is created
        Book newbook = new Book(title, author, price);
        newbook.displayinfo();
    }
}

public class Task2 {
    public static void main(String[] args){
        Book newbook = new Book("Title1", "Author1", 12.34);
        System.out.println(">Author: " + newbook.getAuthor());
        System.out.println(">Title: " + newbook.getTitle());
        System.out.println(">Price: " + newbook.getPrice());
        newbook.displayinfo();
        Libary lib = new Libary("Title2", "Author2", 34.567);
    }
}
