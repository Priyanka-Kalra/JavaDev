public class Main{

    public static void main(String args[]){

        YouTubeChannel striver=new YouTubeChannel("TUF");

        striver.subscribeUser(new EmailSubscriber("abc@gmail.com"));
        striver.subscribeUser(new EmailSubscriber("xyz@gmail.com"));
        striver.subscribeUser(new PushNotificationSubscriber("Priyanka"));

        striver.uploadVideo("System Design 101");
        striver.uploadVideo("DSA AtoZ");
    }
}