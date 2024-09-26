// Class is a blueprint or we can say template to create an object 
// (Just like the constructor)
// class also has the feature of a constructor 
//I can mention the variable and methods which i want in an object inside a class
// constructor function will by default whenever i will declare the class
// better way of programming the logic and better encapsulation abstraction
class Calculator {
    // constructor
    constructor(num1, num2){
        this.num1= num1
        this.num2= num2
    }
    
    divide(){
        return this.num1/this.num2
    }
    multiply(){
        return this.num1*this.num2
    }
    add(){
        return this.num1+this.num2
    }
    modulus(){
        return this.num1%this.num2
    }
    subtract(){
        return this.num1-this.num2
    }
}

// just like constructor 
// to declare an object or instance we will use a new keyword
export default Calculator; // export default it will export this class
// exporting this class