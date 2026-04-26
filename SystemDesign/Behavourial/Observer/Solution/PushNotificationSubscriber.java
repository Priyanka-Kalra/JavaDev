//concrete observer
public class PushNotificationSubscriber implements Subscribers{

    private String userName;

    public PushNotificationSubscriber(String userName){
        this.userName=userName;
    }

    @Override
    public void notify(String videoTitle){
        //logic to notify via email
        System.out.println(userName+" notified successfully for "+videoTitle);
    }
}
