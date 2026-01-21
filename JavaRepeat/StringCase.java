public class StringCase {

    public static void main(String args[]){

        StringBuilder sb=new StringBuilder("Samoyed");
        sb.append(" King");
        System.out.println(sb);

        StringBuffer sbs=new StringBuffer(12);
        sbs.append("King Samoyed");
        System.out.println(sbs);
    }
}
