import java.util.*;

class College{
    private String name,id;

    College(String name, String id){
        this.name=name;
        this.id=id;
    }
    public void displayDetails(){
        System.out.println("College Name : " + name);
        System.out.println("College ID : " + id);
    }
}
class University{
    private String name;
    List<College> colleges;

    University(String name){
        this.name=name;
        this.colleges=new ArrayList<>();
    }
    void addCollege(String collegeName, String collegeId){
        College college=new College(collegeName,collegeId);
        this.colleges.add(college);
    }

    void displayDetails(){
        System.out.println("University Name : " + name);
        for(College college:colleges){
            college.displayDetails();
        }
    }
}
public class Composition {

    public static void main(String args[]){
        University university=new University("IGDTUW");
        university.addCollege("GGSIPU","1");
        university.addCollege("DTU","2");
        university.addCollege("DU","3");

        university.displayDetails();
    }
}
