class Book{
    private String title;
    private String author;
    private double price;
    public Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public String getTitle(){
        return this.title;
    }
    public String getAuthor(){
        return this.author;
    }
    public double getPrice(){
        return this.price;
    }
    public void displayinfo(){
        System.out.print("\nTitle: " + this.title + "\nAuthor: " + this.author + "\nPrice: " + this.price + "\n");
    }
}
class Libary{
    public Libary(String title, String author, double price){
        Book newbook = new Book(title, author, price);
        newbook.displayinfo();
    }
}

public class task3 {
    public static void main(String[] args){
        Book newbook = new Book("Title1", "Author1", 12.34);
        // When you execute below code we can't get the author since its a private
        //System.out.println(newbook.author);
        System.out.println(">Author: " + newbook.getAuthor());
        System.out.println(">Title: " + newbook.getTitle());
        System.out.println(">Price: " + newbook.getPrice());
        newbook.displayinfo();
        Libary lib = new Libary("Title2", "Author2", 34.567);
    }
}

