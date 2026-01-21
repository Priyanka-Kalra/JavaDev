class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println("Thread Execution");
    }
}
class MyRunnable implements Runnable{
    @Override
    public void run(){
        System.out.println("Runnable Execution");
    }
}
public class ThreadTypes {

    public static void main(String args[]){

        MyThread t1=new MyThread();
        t1.run();

        MyRunnable r=new MyRunnable();
        Thread t2=new Thread(r);
        t2.start();

    }
}
