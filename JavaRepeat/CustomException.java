import java.util.Scanner;

class InvalidAgeException extends RuntimeException{

    InvalidAgeException(String message){
        super(message);
    }
}
public class CustomException {

    public static void main(String args[]) throws InvalidAgeException{

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Age");
        int age=sc.nextInt();
        if(age<18)throw new InvalidAgeException("Under age");

        sc.close();
    }
}
