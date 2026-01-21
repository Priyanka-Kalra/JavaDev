package com.springDemo.config;

import com.springDemo.Alien;
import com.springDemo.Computer;
import com.springDemo.Desktop;
import com.springDemo.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

//@Configuration
//public class AppConfig {
//
////    specifying bean name
////    @Bean(name = {"comp","desk","model"})
////    @Scope(value = "prototype")
//
//    @Primary
//    @Bean
//    public Desktop desktop(){
//        return new Desktop();
//    }
//
//    @Bean
//    public Laptop laptop(){
//        return new Laptop();
//    }
//
//    @Bean
//    public Alien al(@Autowired  Computer comp){//either use @Primary or @Qualifier("laptop") specifying which of the two available comp to use
//
//        Alien obj=new Alien();
//        obj.setAge(24);
////        obj.setComp(desktop()); to avoid tight coupling
//        obj.setComp(comp);
//        return obj;
//    }
//}

@Configuration
@ComponentScan("com.springDemo")
public class AppConfig{

}
