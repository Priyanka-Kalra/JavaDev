public class Main{

    public static void main(String args[]){

        Pizza chesseChickenpizza=new CheesePizza(new ChickenBase());

        System.out.println(chesseChickenpizza.getDescription());
        System.out.println(chesseChickenpizza.getCost());

        Pizza chesseCornChickenpizza=new CornTopping(chesseChickenpizza);

        System.out.println(chesseCornChickenpizza.getDescription());
        System.out.println(chesseCornChickenpizza.getCost());


    }
}