class Shape{
    public int area(int side){
        return 4 * side;
    }
    public int area(int length, int breadth){
        return length * breadth;
    }
    public double area(double radius){
        return Math.PI * radius * radius;
    }
}

public class Main {
    public static void main(String[] args){
        Shape s1 = new Shape();
        System.out.println(s1.area(2)); // 8
        System.out.println(s1.area(2.3)); // 16.619025137490002
        System.out.println(s1.area(2, 3)); // 6
    }
}
