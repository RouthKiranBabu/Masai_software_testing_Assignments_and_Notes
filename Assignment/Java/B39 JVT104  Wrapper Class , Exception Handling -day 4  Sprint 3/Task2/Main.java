interface Shape{
    double calculateArea();
    double calculatePerimeter();
}
class Rectange implements Shape{
    double length;
    double width;
    public Rectange(double length, double width){
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
    public static void main(String[] args){
        Rectange rec = new Rectange(3, 2);
        System.out.println(rec.calculateArea()); // 6.0
        System.out.print(rec.calculatePerimeter()); // 10.0
    }
}
