public class Main{

    public static void main(String args[]){

        RiderMatching service1=new RiderMatching(new NearestMatch());
        service1.matchRider("Tilak Nagar");

        RiderMatching service2=new RiderMatching(new SurgePriority());
        service2.matchRider("Cannaught Place");

        RiderMatching service3=new RiderMatching(new AirportQueue());
        service3.matchRider("Airport Terminal 2");

    }
}