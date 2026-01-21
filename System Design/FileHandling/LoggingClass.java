import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class Logger{
    private String path;

    Logger(String path) throws IOException {
        File file=new File(path);
        if(!file.exists())file.createNewFile();
        this.path=path;
    }

    void logRecord(String message) throws IOException{
        BufferedWriter bw=null;
        try{
            bw=new BufferedWriter(new FileWriter(path,true));
            bw.write(message);
            bw.newLine();
        }
        catch(Exception e){
            System.out.println("Exception occured "+e.getMessage());
        }
        finally{
            bw.close();
        }
    }
}
public class LoggingClass {

    public static void main(String args[]) throws IOException {

        Logger logger=new Logger("/Users/priyanka/JavaDev/System Design/FileHandling/log.txt");
        try {
            logger.logRecord("Failed Execution");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            logger.logRecord("Execution Successfull");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
