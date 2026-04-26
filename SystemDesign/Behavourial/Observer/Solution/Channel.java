public interface Channel {

    public void subscribeUser(Subscribers subs);
    public void unsubscribe(Subscribers subs);
    public void notifySubscriber(String VideoTitle);
}
