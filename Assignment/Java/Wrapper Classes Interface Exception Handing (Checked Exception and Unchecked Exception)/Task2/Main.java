interface Shape{
    double calculateArea();
    double calculatePerimeter();
}
class Rectangle implements Shape{
    double length;
    double width;
    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    public double calculateArea(){
        return this.length * this.width;
    }
    public double calculatePerimeter(){
        return 2 * (this.length + this.width);
    }
}
public class Main {
    public static void main(String[] args) {
        Shape rec = new Rectangle(12, 2);
        System.out.println("Area: " + rec.calculateArea()); // Area: 24.0
        System.out.println("Perimeter: " + rec.calculatePerimeter());// Perimeter: 28.0
    }
}
