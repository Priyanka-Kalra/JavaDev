class SurgePriority implements MatchingStrategy{

    @Override
    public void match(String RiderLocation){
        System.out.println("Matching rider with the surge pricing to " + RiderLocation);
    }
}
