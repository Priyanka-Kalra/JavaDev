abstract class TestAbstract{
    void show(){
        System.out.println("Bla bla");
    }

    abstract void test();
}
class Abstracted extends TestAbstract{

    @Override
    public void show(){
        System.out.println("Bla bla Sammy");
    }

    void test(){
        System.out.println("Testing Testing ...");
    }
}
public class AbstractClass {

    public static void main(String args[]){

        Abstracted obj=new Abstracted();
        obj.show();
        obj.test();
    }
}