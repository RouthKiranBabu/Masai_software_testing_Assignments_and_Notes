class Person{
    String firstName;
    String lastName;
    Person(String fn, String ln){
        this.firstName = fn;
        this.lastName = ln;
    }

    public String getFullName(){
        return this.firstName + this.lastName;
    }

    public String reverseName(){
        String fullname = firstName.concat(lastName);
        String reversedName = new String();
        for (int i = fullname.length() - 1; i >= 0; i --){
            reversedName += fullname.charAt(i);
        }
        return reversedName;
    }

    public boolean compareNames(Person anotherPerson){
        return (this.getFullName()).equals(anotherPerson.getFullName());
    }
}

public class main{
    public static void main(String[] args){
        Person p1 = new Person("f1", "l1");
        System.out.println("Full Name: " + p1.getFullName());
        System.out.println("Reversed Name: " + p1.reverseName());
        Person p2 = new Person("f1", "l1");
        Person p3 = new Person("f3", "l3");
        System.out.println(p1.compareNames(p2));
        System.out.println(p1.compareNames(p3));
    }
}