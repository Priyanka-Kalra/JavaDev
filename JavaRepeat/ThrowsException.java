import java.util.Scanner;

public class ThrowsException {

    public static void main(String args[]) throws Exception{

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Age");
        int age=sc.nextInt();
        if(age<18)throw new Exception("Under age");

        sc.close();
    }
}
