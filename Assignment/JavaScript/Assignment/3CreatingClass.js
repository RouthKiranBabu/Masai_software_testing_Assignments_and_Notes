// Creating the Animal class
class Animal{
    // Constructor collects the information sequentially when class is created
    constructor(name, species){
        this.name = name;
        this.species = species;
    }
    // Function that provide the information about animal sound, name and species
    makeSound(){
        let name = this.species.toLowerCase();
        // To check if its a dog
        if (name == "dog"){
            console.log(`"The ${this.name} barks" if the species is "${this.species}"`);
        }else{
            // This statement shows for the animal whoes species value is not a dog
            console.log(`"The ${this.name} does not barks" if the species is "${this.species}"`);
        }
    }
}

// Constructing the new Animal
let dog = new Animal("Doggy", "Dog");
// For the dog what the sound
dog.makeSound() // "The Doggy barks" if the species is "Dog"
// Constructing the animal which is not a dog
let notdog = new Animal("Doggy", "Cat");
// Checking the sound statement other than dog
notdog.makeSound() // "The Doggy does not barks" if the species is "Cat"