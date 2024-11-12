// Interface which has the overall structure
interface Shape{
    double calculateArea(double l, double w);
    double calculatePerimeter(double l, double w);
}

// Rectangle implements the interface structure
class Rectangle implements Shape{
    // Having the calcuate area method
    @Override
    public double calculateArea(double l, double w){
        double area = l * w;
        return area;
    }
    // Having the calcuate perimeter method
    @Override
    public double calculatePerimeter(double l, double w){
        double perimeter = 2 * (l + w);
        return perimeter;
    }
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        double area = r.calculateArea(2, 3);
        double perimeter = r.calculatePerimeter(2, 3);
        System.out.println("Area: " + area + "\nPerimeter: " + perimeter);
        
    }
}
/* Output
Area: 6.0
Perimeter: 10.0*/