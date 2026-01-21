import java.util.List;

public class Stream {

    public static void main(String args[]){

        List<String> ls=List.of("Alice","Britain","Samoyed","Alisha","Ali","Nlice");

        List<String> filtered=ls.stream()
                .filter(name->name.startsWith("A"))
                .map(e->e.toLowerCase())
                .toList();

        System.out.println(filtered);
    }
}
