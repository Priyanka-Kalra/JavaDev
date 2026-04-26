package Solution;

//lazy loading-not thread safe
public class JudgeAnalyticsDoubleCheck {

    private int run=0;
    private int submit=0;
    private static volatile JudgeAnalyticsDoubleCheck instance=null;

    //private constructor so that no new obj is created
    private JudgeAnalyticsDoubleCheck(){}

    //accessing the standard class object
    public static JudgeAnalyticsDoubleCheck getInstance(){

        if(instance==null){
            synchronized (JudgeAnalyticsLazyLoading.class){
                if(instance==null)instance= new JudgeAnalyticsDoubleCheck();
            }
        }
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
