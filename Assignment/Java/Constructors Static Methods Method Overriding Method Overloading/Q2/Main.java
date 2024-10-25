class Person{
    String name;
    int age;
    Person(){
        this.name = "Unknown";
        this.age = 0;
    }
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
}

public class Main {
    public static void main(String[] args){
        Person p1 = new Person();
        Person p2 = new Person("nameGiven", 12);
        System.out.println("Using Default constructor: \nName: " + p1.name + "\nAge: " + p1.age);
        System.out.println("\nUsing Parameterized constructor: \nName: " + p2.name + "\nAge: " + p2.age);
    }
}
// Using Default constructor: 
// Name: Unknown
// Age: 0

// Using Parameterized constructor: 
// Name: nameGiven
// Age: 12