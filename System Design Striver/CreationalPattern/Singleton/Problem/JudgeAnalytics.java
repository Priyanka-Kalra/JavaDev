package Problem;

public class JudgeAnalytics {

    private int run=0;
    private int submit=0;

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
