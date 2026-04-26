//https://chatgpt.com/share/68e1538a-f990-8005-9723-1031defb7f49
import java.io.*;
public class Main {

    public static void main(String args[]) throws IOException {

//        File file=new File("/Users/priyanka/JavaDev/System Design/FileHandling/testing.txt");
//        System.out.println(file.exists());
//        file.createNewFile();

        BufferedWriter bw=null;
        try{
            bw=new BufferedWriter(new FileWriter("/Users/priyanka/JavaDev/System Design/FileHandling/testing.txt"));
            bw.write("Hey there");
            bw.newLine();
            bw.write("Hiii");
            bw.flush();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            bw.close();
        }

//        BufferedReader br=null;
//        try{
//            br=new BufferedReader(new FileReader("/Users/priyanka/JavaDev/System Design/FileHandling/testing.txt"));
//            String line;
//            while((line=br.readLine())!=null){
//                System.out.println(line);
//            }
//
//        }
//        catch(Exception e){
//            System.out.println(e.getMessage());
//        }
//        finally{
//            br.close();
//        }

    }
}
