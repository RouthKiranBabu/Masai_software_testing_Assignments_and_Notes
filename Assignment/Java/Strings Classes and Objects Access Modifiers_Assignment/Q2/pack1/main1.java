class Person{
    public void publicMethod(){
        System.out.println("This is from public method");
    }

    private void privateMethod(){
        System.out.println("This is from private method");
    }

    protected void protectedMethod(){
        System.out.println("This is from Protected Method");
    }

    void defaultMethod(){
        System.out.println("This is from the default method");
    }
}

public class main1 {
    public static void main(String[] args){
        Person p1 = new Person();
        p1.publicMethod();
        // p1.privateMethod(); // main1.java:25: error: privateMethod() has private access in Person
        p1.protectedMethod();
        p1.defaultMethod();
    }
}
