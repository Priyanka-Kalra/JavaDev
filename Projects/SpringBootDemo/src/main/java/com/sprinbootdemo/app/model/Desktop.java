package com.sprinbootdemo.app.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Desktop implements Computer{

    @Override
    public void complile(){
        System.out.println("Compiling in Desktop");
    }
}
