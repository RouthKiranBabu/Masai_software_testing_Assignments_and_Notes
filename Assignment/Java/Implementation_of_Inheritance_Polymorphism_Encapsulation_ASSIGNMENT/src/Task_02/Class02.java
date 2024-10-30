package Task_02;
// Animal class having makeSound method
class Animal{
	public void makeSound() {
		System.out.println("Animal makes a sound.");
	}
}
// Subclass named Dog
class Dog extends Animal{
	@Override
	public void makeSound() {
		System.out.println("Dog barks.");
	}
}

public class Class02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal d1 = new Dog();
		d1.makeSound(); // Dog barks.
	}

}
