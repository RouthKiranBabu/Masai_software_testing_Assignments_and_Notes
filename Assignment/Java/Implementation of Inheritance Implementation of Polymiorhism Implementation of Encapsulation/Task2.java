class Vehicle{
    public void startEngine(){
        System.out.println("The vehicle's engine is starting.");
    }
}
class Car extends Vehicle{
    @Override
    public void startEngine(){
        System.out.println("The car's engine is starting.");
    }
}
public class Task2 {
    public static void main(String[] args){
        Vehicle vehicle = new Vehicle();
        Vehicle car = new Car();
        vehicle.startEngine(); // The vehicle's engine is starting.
        car.startEngine(); // The car's engine is starting.
    }
}
