public class AnonymousClass {

    public static void main(String args[]){

//        Runnable ob=new Runnable(){
//            @Override
//            public void run(){
//                System.out.println("Printing ....");
//            }
//        };
//        ob.run();

        Runnable ob=()-> System.out.println("Printing ....");
        ob.run();

    }
}

