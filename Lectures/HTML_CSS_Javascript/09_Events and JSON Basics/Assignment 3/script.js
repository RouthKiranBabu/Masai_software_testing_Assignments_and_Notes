/*<!--Github Link for Overall assignment
 https://github.com/RouthKiranBabu/Masai-School-Journey/tree/main/Assignment/JavaScript/Events%20and%20JSON%20Basics -->
*/ 
const person = {
  name: "Alice",
  age: 20,
  subjects: ["Math", "Science", "History"]
};

const stringified = JSON.stringify(person);
const parsed = JSON.parse(stringified);

const name = parsed.name;
const subjects = parsed.subjects.join(", ");

console.log(`Name: ${name}.\n\nSubjects: ${subjects}.`)
/*Expected Output:
Name: Alice.

Subjects: Math, Science, History.
*/ 