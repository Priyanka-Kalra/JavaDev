public class Main{

    public static void main(String args[]){

        RiderMatching service =new RiderMatching();

        service.matchRider("Cannaught Place", "SURGE_PRIORITY");
        service.matchRider("Airport Terminal 2", "AIRPORT_QUEUE");
        service.matchRider("Tilak Nagar", "NEAREST");
    }
}