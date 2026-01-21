import java.util.*;
class Student{
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}

class College{
    private String name;
    private List<Student> students;

    public College(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudents(Student student){
        students.add(student);
    }
    public void allStudent(){
        for(Student student:students){
            System.out.println("Name is :"+student.getName());
            System.out.println("Roll Number is :"+student.getId());
        }
    }
}

public class AssociationOneToMany {

    public static  void main(String args[]){

        College college=new College("Igdtuw");
        Student st1=new Student("Priyanka",1);
        Student st2=new Student("Harsh",2);
        Student st3=new Student("King",3);

        college.addStudents(st1);
        college.addStudents(st2);
        college.addStudents(st3);
        college.allStudent();
    }
}
