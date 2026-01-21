class MyRunnable implements Runnable{

    @Override
    public void run(){
        System.out.println("Printing ...");
    };
}
public class ThreadFunction {

    public static void main(String args[]){

        MyRunnable ob=new MyRunnable();
        Thread t=new Thread(ob);
        t.start();
        t.start();
        t.run();

    }
}
