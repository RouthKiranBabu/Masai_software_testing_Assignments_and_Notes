class ParentClass{
    public void publicMethod(){
        System.out.println("Public Method in Parent");
    }
    protected void protectedMethod(){
        System.out.println("Protected Method in Parent");
    }
    private void privateMethod(){
        System.out.println("Private Method in Parent");
    }
    void defaultMethod(){
        System.out.println("Default Method in Parent");
    }
}

class ChildClass extends ParentClass{
    @Override
    public void publicMethod(){
        System.out.println("Override -> Public Method in Parent");
    }
    @Override
    protected void protectedMethod(){
        System.out.println("Override -> Protected Method in Parent");
    }
}

public class Main {
    public static void main(String[] args){
        ChildClass cc = new ChildClass();
        cc.defaultMethod(); // Default Method in Parent
        cc.protectedMethod(); // Override -> Protected Method in Parent
        cc.publicMethod(); // Override -> Public Method in Parent
        // cc.privateMethod();
    }
}
