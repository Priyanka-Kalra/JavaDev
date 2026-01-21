package Solution;

//lazy loading-not thread safe
public class JudgeAnalyticsSyncronized {

    private int run=0;
    private int submit=0;
    private static JudgeAnalyticsSyncronized instance=null;

    //private constructor so that no new obj is created
    private JudgeAnalyticsSyncronized(){}

    //accessing the standard class object
    public static synchronized JudgeAnalyticsSyncronized getInstance(){

        if(instance==null)
            instance= new JudgeAnalyticsSyncronized();

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
