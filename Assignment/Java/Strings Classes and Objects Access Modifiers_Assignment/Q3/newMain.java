public class newMain {
    public static void main(String[] args){
        ChildClass cc = new ChildClass();
        cc.defaultMethod(); // Default Method in Parent
        cc.protectedMethod(); // Override -> Protected Method in Parent
        cc.publicMethod(); // Override -> Public Method in Parent
        // cc.privateMethod();
    }
}