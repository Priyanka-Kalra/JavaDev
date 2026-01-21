package com.springDemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Desktop implements Computer{

    public Desktop(){
        System.out.println("Constructor called Desktop");
    }

    @Override
    public void compile(){
        System.out.println("Compling in Desktop");
    }
}
