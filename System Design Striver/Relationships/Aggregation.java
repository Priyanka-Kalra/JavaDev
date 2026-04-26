//Your code goes here

import java.util.*;
class Department{
    private String name;
    private String id;

    Department(String name, String id){
        this.name=name;
        this.id=id;
    }
    void displayDetails(){
        System.out.println("Department Name : " + name);
        System.out.println("Department Id : " + id);
    }
}
class Employee{
    private String name;
    private int id;
    private Department department;

    Employee(String name,int id,Department department){

        this.name=name;
        this.id=id;
        this.department=department;
    }
    void displayDetails(){
        System.out.println("Employee Name : " + name);
        System.out.println("Employee Id : " + id);
        department.displayDetails();
    }
}

public class Aggregation {

    public static void main(String args[]){
        Department cs=new Department("Computer Science","101");

        Employee emp1=new Employee("Priyanka",1,cs);
        emp1.displayDetails();
    }
}
