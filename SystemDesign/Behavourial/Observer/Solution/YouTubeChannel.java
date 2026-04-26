import java.util.*;

class YouTubeChannel implements Channel{

    private List<Subscribers> subscriber;
    public String channelName;

    public YouTubeChannel(String channelName){
        subscriber=new ArrayList<>();
        this.channelName=channelName;
    }

    @Override
    public void subscribeUser(Subscribers subs){
        subscriber.add(subs);
    }
    @Override
    public void unsubscribe(Subscribers subs){
        subscriber.remove(subs);
    }

    //other methods based on chanbel like discord
    public void uploadVideo(String VideoTitle){
        //logic for video upload
        notifySubscriber(VideoTitle);
    }

    @Override
    public void notifySubscriber(String VideoTitle){
        for(Subscribers subs:subscriber){
            subs.notify(VideoTitle);
        }
    }


}