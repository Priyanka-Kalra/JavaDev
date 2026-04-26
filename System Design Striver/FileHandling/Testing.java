class A{
    int a=10;
}
public class Testing {

    public static void main(String args[]){

        A obj1=new A();
        A obj2=obj1;

        obj2.a=11;
        System.out.println(obj2.a);
        System.out.println(obj1.a);

        obj1.a=7;
        System.out.println(obj2.a);
        System.out.println(obj1.a);
    }
}
