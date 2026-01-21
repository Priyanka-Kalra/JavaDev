class A{
    void show(){
        System.out.println("Show...");
    }
}
class B extends A{

    void fly(){
        System.out.println("Fly...");
    }
}
public class Downcasting {

    public static void main(String args[]){

        A obj=new A();

        //ClassCastException:
//        B obj1=(B) obj;
//        obj1.fly();

        if(obj instanceof B){
            B obj1=(B) obj;
            obj1.fly();
        }



    }
}
