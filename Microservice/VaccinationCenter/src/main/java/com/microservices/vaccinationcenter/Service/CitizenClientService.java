package com.microservices.vaccinationcenter.Service;

import com.microservices.vaccinationcenter.Model.Citizen;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class CitizenClientService {

    @Autowired
    private RestTemplate restTemplate;

    private static final String CITIZEN_SERVICE = "citizenService";

    @CircuitBreaker(name = CITIZEN_SERVICE, fallbackMethod = "fallbackCitizenList")
    public List<Citizen> getCitizensFromService(Integer id) {
        //List<Citizen> citizenList=myRestTemplate.getForObject("http://localhost:8081/citizen/vaccination-center/"+id, List.class);
        return restTemplate.getForObject(
                "http://CITIZEN-SERVICE/citizen/vaccination-center/" + id,
                List.class
        );
    }

    public List<Citizen> fallbackCitizenList(Integer id, Exception e) {
        System.out.println("Fallback triggered: " + e.getClass());
        return new ArrayList<>();
    }
}
