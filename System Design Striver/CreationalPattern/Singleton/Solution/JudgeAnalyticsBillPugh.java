package Solution;

//lazy loading-not thread safe
public class JudgeAnalyticsBillPugh {

    private int run=0;
    private int submit=0;
    private static volatile JudgeAnalyticsBillPugh instance=null;

    //private constructor so that no new obj is created
    private JudgeAnalyticsBillPugh(){}

    //static inner class
    private static class Holder{
        static final JudgeAnalyticsBillPugh object=new JudgeAnalyticsBillPugh();
    }

    //accessing the singleton object, instatiated through inner static class Holder
    public static JudgeAnalyticsBillPugh getInstance(){
        return Holder.object;
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
