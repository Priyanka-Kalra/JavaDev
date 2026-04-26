class AirportQueue implements  MatchingStrategy{

    @Override
    public void match(String RiderLocation){
        System.out.println("Matching using FIFO airport queue for " + RiderLocation);
    }
}
