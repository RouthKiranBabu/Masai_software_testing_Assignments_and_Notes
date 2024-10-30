package Task_01;
// Animal Class
class Animal{
	String species;
	int age;
//	Constructor
	public Animal(String spe, int age){
		this.species = spe;
		this.age = age;
	}
//	Methods display information
	public void displayInfo() {
		System.out.println("Species: " + this.species + "\nAge: " + this.age);
	}
}
//Dog subclass
class Dog extends Animal{
	Dog(String spe, int age){
		super(spe, age);
	}
}

public class Class01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal d1 = new Dog("Speci", 12);
		d1.displayInfo();
	}

}
//Species: Speci
//Age: 12
