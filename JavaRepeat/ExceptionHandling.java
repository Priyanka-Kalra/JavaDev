public class ExceptionHandling {

    public static void main(String args[]){

        try{
            int a=10/0;
            System.out.println("Division Success");
        }
        catch (ArithmeticException e){
            System.out.println("Division Unsuccess : "+ e.getMessage());
        }
        finally {
            System.out.println("Will Execute");
        }
    }
}
