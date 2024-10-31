class Vehicle{
    private String make;
    private String model;
    private int year;
    public Vehicle(String mak, String mod, int yea){
        this.make = mak;
        this.model = mod;
        this.year = yea;
    }
    public String getMake(){ return this.make; }
    public String getModel(){ return this.model; }
    public int getYear(){ return this.year; }
    public void setMake(String newMake) { this.make = newMake; }
    public void setModel(String newModel) { this.model = newModel; }
    public void setYear(int newYear) { this.year = newYear; }
    public void displayInfo(){
        System.out.println("********************");
        System.out.println("Make: " + this.make + "\nModel: " + this.model + "\nYear: " + this.year); 
        System.out.println("^^^^^^^^^^^^^^^^^^^^");
    }
}
class Car extends Vehicle{
    public Car(String mak, String mod, int yea){
        super(mak, mod, yea);
    }
    @Override
    public void displayInfo(){
        System.out.println("********************");
        System.out.println("Make: " + getMake() + "\nModel: " + getModel() + "\nYear: " + getYear()); 
        System.out.println("^^^^^^^^^^^^^^^^^^^^");
    }
}
public class Task3 {
    public static void main(String[] args){
        Vehicle vehicle = new Vehicle("Maker1", "Model1", 2024);
        Vehicle car = new Car("Car1", "carModel", 2023);
        vehicle.displayInfo();
        System.out.println("For Vehicle:\nMake: " + vehicle.getMake()+ "\nModel: " + vehicle.getModel() + "\nYear: " + vehicle.getYear());
        car.displayInfo();
        System.out.println("For Car:\nMake: " + car.getMake()+ "\nModel: " + car.getModel() + "\nYear: " + car.getYear());
    }
}
