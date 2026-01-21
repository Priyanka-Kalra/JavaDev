package com.springDemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
    public Laptop(){
        System.out.println("Constructor called Laptop");
    }

    @Override
    public void compile(){
        System.out.println("Compling in Laptop");
    }
}
