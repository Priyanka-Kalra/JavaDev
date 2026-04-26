class NearestMatch implements  MatchingStrategy{
    @Override
    public void match(String RiderLocation){
        System.out.println("Matching with the nearest available driver to " + RiderLocation);
    }

}