package com.springDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    @Value("23")
    private int age;
    private int marks;

    @Autowired
//    @Qualifier("laptop") use @Primary or this with name being class name in smallcase
    private Computer comp;

    public Alien(){
        System.out.println("Default Constructor");
    }
    public void code(){
        System.out.println("Coding");
        comp.compile();
    }
    public int getAge() {
        return age;
    }
    public int getMarks() {
        return marks;
    }



//    for constructor injection
    public Alien(int marks){
        System.out.println("Parametrised Constructor");
        this.marks=marks;
    }
//    for setter injection
    public void setAge(int age) {
        System.out.println("Setter called");
        this.age = age;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }
}
