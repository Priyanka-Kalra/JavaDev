class RiderMatching{

    public void matchRider(String riderLocation, String matchingType){

        //give specific logic
        if(matchingType.equals("NEAREST")){
            System.out.println("Matching rider at "+ riderLocation+" from nearest Queue");
        }
        else if(matchingType.equals("SURGE_PRIORITY")){
            System.out.println("Matching rider at "+ riderLocation+" from surge pricing queue");
        }
        else if(matchingType.equals("AIRPORT_QUEUE")){
            System.out.println("Matching rider at "+ riderLocation+" from airport queue");
        }
        else
            System.out.println("Invalid Matching Strategy");
    }
}