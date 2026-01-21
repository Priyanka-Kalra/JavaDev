class A{
    void show(){
        System.out.println("Showw");
    }
    void fly(){
        System.out.println("Flyyy1");
    }
}
class B extends A{
    void fly(){
        System.out.println("Flyyy");
    }
}
public class ObjectSample {

    public static void main(String args[]){
        A obj=new B();
        obj.fly();//compile time error
        obj.show();
    }
}
