class Parent{
    void show(){
        System.out.println("Parent");
    }
}
class Child extends Parent{
    @Override
    void show(){
        System.out.println("Child");
    }

//    it will throw error since, we using Parent obj=new Parent();(i.e refrence of parent and object of child class. but parent class does not have show() of return type, bcz at complile time, compiler checks reference typ(here parent class)
//    int show(int n){
//        System.out.println("Testing");
//        return -1;
//    }
}
class Polymorphism {

    public static void main(String args[]){
        Parent obj=new Parent();
        obj.show();

//        obj=new Child();
//        obj.show(4);
    }
}
