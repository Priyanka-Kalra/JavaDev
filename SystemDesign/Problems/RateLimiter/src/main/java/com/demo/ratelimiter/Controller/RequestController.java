package com.demo.ratelimiter.Controller;


import com.demo.ratelimiter.Model.User;
import com.demo.ratelimiter.Service.RateLimitService;
import com.demo.ratelimiter.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@RestController
@RequestMapping("/api/v1/request")
public class RequestController {

    @Autowired
    private UserService userService;

    @Autowired
    private RateLimitService rateLimitService;



    @GetMapping("/{id}")
    public List<ResponseStructure> request(@PathVariable UUID id){

        try{

//            User user=userService.getOrCreateUser(id);
//            List<ResponseStructure> response=new ArrayList<>();
//
//            for(int ind=0;ind<100;ind++){
//                boolean isAllowed=rateLimitService.isAllowed(user);
//
//
//                if(!isAllowed)response.add(new ResponseStructure("Try Again Later, Reached ,max number of tries",isAllowed));
//                else response.add(new  ResponseStructure("Redirection success",isAllowed));
//            }


            User user=userService.getOrCreateUser(id);

            ExecutorService executorService= Executors.newFixedThreadPool(10);
            List<Future<ResponseStructure>> futures=new ArrayList<>();
            for(int ind=0;ind<100;ind++){
                futures.add(executorService.submit(()->{
                    System.out.println("Request with thread: "+Thread.currentThread().getName());
                    boolean isAllowed=rateLimitService.isAllowed(user);
                    if(!isAllowed)return new ResponseStructure("Try Again Later, Reached ,max number of tries",isAllowed);
                    else return new  ResponseStructure("Redirection success",isAllowed);

                }));
            }

            List<ResponseStructure> response=new ArrayList<>();
            for(Future<ResponseStructure> future:futures){
                ResponseStructure responseStructure=future.get();
                response.add(responseStructure);
            }
            return response;


        }
        catch(Exception e){
            List<ResponseStructure> response=new ArrayList<>();
            response.add(new ResponseStructure(e.getMessage(),true));
            return response;
        }


    }

    public static class ResponseStructure{

        private String message;
        private boolean redirect;

        public ResponseStructure(String message, boolean redirect) {
            this.message = message;
            this.redirect = redirect;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public boolean isRedirect() {
            return redirect;
        }

        public void setRedirect(boolean redirect) {
            this.redirect = redirect;
        }
    }
}
