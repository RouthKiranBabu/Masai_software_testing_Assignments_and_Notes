// Person class signifies about the person
class person{
    /* person does has some first name, lastname and his/her age
    so storing in variable by means of constructor 
    when creating the new class constructor takes the values provided 
    in the sequence manner like first parameter is firstname then 
    lastname and the last element is the age*/
    constructor(firstName, lastName, age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    // This method is used for a person to introduce
    introduce(){
        console.log(`Hi my name is ${this.firstName.concat(" ", this.lastName)} and I am ${this.age} years old.`);
    }
    // This function is used to update the age of the person
    update_age(age){
        this.age = age;
    }
}
// Creating the class named person
let person1 = new person("fir", "las", 1)
// Calling the introduce function to check the age
person1.introduce() // Hi my name is fir las and I am 1 years old.
// Calling the update_age function for updating the age
person1.update_age(12)
// Now need to check wether the age is changed or not
person1.introduce() // Hi my name is fir las and I am 12 years old.