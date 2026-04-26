package Solution;

//lazy loading-not thread safe
public class JudgeAnalyticsLazyLoading {

    private int run=0;
    private int submit=0;
    private static JudgeAnalyticsLazyLoading instance=null;

    //private constructor so that no new obj is created
    private JudgeAnalyticsLazyLoading(){}

    //accessing the standard class object
    public static JudgeAnalyticsLazyLoading getInstance(){

        if(instance==null)
            instance= new JudgeAnalyticsLazyLoading();

        return instance;
    }

    //standard class methods
    public int getRun() {
        return run;
    }

    public int getSubmit() {
        return submit;
    }

    public void updateRun() {
        this.run +=1;
    }

    public void updateSubmit() {
        this.submit += 1;
    }
}
