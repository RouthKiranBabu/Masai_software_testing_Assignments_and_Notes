public class main2 {
    public static void main(String[] args){
        Person p1 = new Person();
        p1.publicMethod();
        // p1.privateMethod(); // main1.java:25: error: privateMethod() has private access in Person
        p1.protectedMethod();
        p1.defaultMethod();
    }
}
