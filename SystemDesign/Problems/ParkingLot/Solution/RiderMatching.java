class RiderMatching {

    private MatchingStrategy strategy;

    public RiderMatching(MatchingStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(MatchingStrategy strategy) {
        this.strategy = strategy;
    }

    public void matchRider(String RiderLocation) {

        strategy.match(RiderLocation);
    }
}