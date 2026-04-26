//concrete observer
public class EmailSubscriber implements Subscribers{

    private String email;

    public EmailSubscriber(String email){
        this.email=email;
    }

    @Override
    public void notify(String videoTitle){
        //logic to notify via email
        System.out.println(email+" notified successfully for "+videoTitle);
    }
}
