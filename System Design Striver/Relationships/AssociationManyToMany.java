import java.util.ArrayList;
import java.util.List;

class Student{
    private String name;
    private List<Course> courses;

    public Student(String name, int id) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void addCourse(Course course){

        courses.add(course);
    }


}

class Course{
    private String name;
    private List<Student> students;

    public Course(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudents(Student student){

        students.add(student);
    }

}

public class AssociationManyToMany {

    public static  void main(String args[]){

    }
}
