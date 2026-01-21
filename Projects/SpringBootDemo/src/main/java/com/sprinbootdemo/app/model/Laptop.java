package com.sprinbootdemo.app.model;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {

    @Override
    public void complile(){
        System.out.println("Compiling in Laptop");
    }
}
