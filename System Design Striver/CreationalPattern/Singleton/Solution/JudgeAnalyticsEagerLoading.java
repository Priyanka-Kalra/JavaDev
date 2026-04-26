package Solution;

//eager loading:thread safe
public class JudgeAnalyticsEagerLoading {

    private int run=0;
    private int submit=0;
    private static final JudgeAnalyticsEagerLoading  instance=new JudgeAnalyticsEagerLoading ();

    //private constructor so that no new obj is created
    private JudgeAnalyticsEagerLoading(){}

    //accessing the standard class object
    public static JudgeAnalyticsEagerLoading  getInstance(){
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
