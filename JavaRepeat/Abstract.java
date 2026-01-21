abstract class Base {

    abstract public void start();
    public void fuel(){
        System.out.println("Fuel");
    }
}
class Car extends Base{
    @Override
    public void start(){
        System.out.println("Start");
    }
}
class Abstract {

    public static void main(String args[]){

        Car obj=new Car();
        obj.start();

    }
}
