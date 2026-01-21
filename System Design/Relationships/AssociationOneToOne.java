class Paasport{

    private String passport;

    public Paasport(String passport) {
        this.passport = passport;
    }

    public String getPassport() {
        return passport;
    }
}
class Student{
    private String name;
    private Paasport paasport;

    public Student(String name, Paasport paasport) {
        this.name = name;
        this.paasport = paasport;
    }

    public void getDetails() {
        System.out.println("Name is :"+name);
        System.out.println("Passport number is :"+ paasport.getPassport());

    }

}

public class AssociationOneToOne {

    public static  void main(String args[]){

        Paasport paasport=new Paasport("123456");
        Student student=new Student("Priyanka",paasport);
        student.getDetails();
    }
}
