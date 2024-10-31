class Vehicle{
    String make;
    String model;
    int year;
    public Vehicle(String mak, String mod, int yea){
        this.make = mak;
        this.model = mod;
        this.year = yea;
    }
    public void displayInfo(){
        System.out.println("Make: " + this.make + "\nModel: " + this.model + "\nYear: " + this.year); 
    }
}

class Car extends Vehicle{
    int numberOfDoors;
    public Car(String mak, String mod, int yea, int numberOfDoors){
        super(mak, mod, yea);
        this.numberOfDoors = numberOfDoors;
    }
    @Override
    public void displayInfo(){
        System.out.println("Make: " + this.make + "\nModel: " + this.model + "\nYear: " + this.year + "\nNumber of Doors: " + this.numberOfDoors); 
    }
}
public class Task1{
    public static void main(String[] args){
        Vehicle car = new Car("Makes", "Model1", 2024, 3);
        car.displayInfo();
        // Make: Makes
        // Model: Model1
        // Year: 2024
        // Number of Doors: 3
    }
}