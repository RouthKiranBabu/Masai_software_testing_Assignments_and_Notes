package Task_03;
// class Animal
class Animal{
	private String species;
	private int age;
	// Constructor
	public Animal(String spe, int age){
		this.species = spe;
		this.age = age;
	}
	// getter methods
	public String getSpecies() { return this.species; }
	public int getAge() { return this.age; }
	// setter methods
	public void setSpecies(String newspe) { this.species = newspe; }
	public void setAge(int newage) { this.age = newage; }
	
	public void displayInfo() {
		System.out.println("Species: " + getSpecies() + "\nAge: " + getAge());
	}
}

public class Class03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a1 = new Animal("Species1", 12);
		System.out.println("Species: " + a1.getSpecies() + ", Age: " + a1.getAge()); // Species: Species1, Age: 12
		a1.setSpecies("newSpecies");
		a1.setAge(123);
		a1.displayInfo();
//		Species: newSpecies
//		Age: 123
		
	}

}
