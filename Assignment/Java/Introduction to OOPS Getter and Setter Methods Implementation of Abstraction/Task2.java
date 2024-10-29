class Person{
    private String name;
    private int age;
    private char gender;
    public Person(String n, int a, char g){
        this.name = n;
        this.age = a;
        this.gender = g;
    }
    // Getter methods
    public String getName(){ return this.name; }
    public int getAge(){ return this.age; }
    public char getGender() { return this.gender; }
    // Setter methods
    public void setName(String na){ this.name = na; }
    public void setAge(int ag){ this.age = ag; }
    public void setGender(char ch) { this.gender = ch; }
    // Methods display information and calls getter methods
    public void displayInfo(){
        System.out.println("Name: " + getName() + ", age: " + getAge() + ", gender: " + getGender());
    }
}

public class Task2 {
    public static void main(String[] args){
        Person p1 = new Person("P1", 1, 'M');
        p1.getAge(); p1.getName(); p1.getGender();
        p1.displayInfo(); // Name: P1, age: 1, gender: M
        p1.setAge(12); p1.setName("P12"); p1.setGender('F');
        p1.displayInfo(); // Name: P12, age: 12, gender: F
    }
}
