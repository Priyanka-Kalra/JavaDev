interface TestInterface{
    default void show(){
        System.out.println("Bla bla");
    }
}
class Inherited implements TestInterface{

    @Override
    public void show(){
        System.out.println("Bla bla Sammy");
    }
}
public class InterfaceTest {

    public static void main(String args[]){

        Inherited obj=new Inherited();
        obj.show();
    }
}

//1.in interfaces, only abstract, static, defualt methods
