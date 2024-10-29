// Abstract class
abstract class Shape{
    abstract public int calculateArea(int l, int w);
}
// Class Rectange
class Rectangle extends Shape{
    @Override
    public int calculateArea(int l, int w){
        return l * w;
    }
}
public class Task3 {
    public static void main(String[] args){
        Shape s1 = new Rectangle();
        System.out.println(s1.calculateArea(2, 3)); // 6
    }
}
