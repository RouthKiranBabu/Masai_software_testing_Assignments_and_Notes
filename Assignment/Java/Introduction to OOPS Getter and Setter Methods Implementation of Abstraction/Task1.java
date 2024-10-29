class Person{
    // Instance variables
    String name;
    int age;
    char gender;
    // Constructor
    public Person(String n, int a, char g){
        this.name = n;
        this.age = a;
        this.gender = g;
    }
    // Method that display information
    public void displayInfo(){
        System.out.println("Name: " + this.name + ", age: " + this.age + ", gender: " + this.gender);
    }
}

public class Task1{
    public static void main(String[] args){
        Person p1 = new Person("P1", 1, 'm');
        p1.displayInfo(); // Name: P1, age: 1, gender: m
    }
}