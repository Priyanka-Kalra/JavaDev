package com.microservices.vaccinationcenter.Service;


import com.microservices.vaccinationcenter.Model.Citizen;
import com.microservices.vaccinationcenter.Model.RequiredResponse;
import com.microservices.vaccinationcenter.Model.VaccinationCenter;
import com.microservices.vaccinationcenter.Repo.VaccinationCenterRep;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class VaccinationCenterService {

    @Autowired
    private VaccinationCenterRep vaccinationCenterRep;
    @Autowired
    private RestTemplate myRestTemplate;
    @Autowired
    private CitizenClientService citizenClientService;

    private static final String CITIZEN_SERVICE = "citizenService";


    public VaccinationCenter save(VaccinationCenter newVaccinationCenter){
        return vaccinationCenterRep.save(newVaccinationCenter);
    }

    public Optional<VaccinationCenter> findById(Integer id){
        return  vaccinationCenterRep.findById(id);
    }

//    public RequiredResponse getAllDataBasedOnCenterId(Integer id){
//        RequiredResponse reqResponse=new RequiredResponse();
//
//        //finding center
//        VaccinationCenter center=this.findById(id).orElse(null);
//        reqResponse.setVaccinationCenter(center);
//
//        //finding list of citizens registered for the center with id
//        List<Citizen> citizenList=myRestTemplate.getForObject("http://CITIZEN-SERVICE/citizen/vaccination-center/"+id, List.class);
//        reqResponse.setCitizens(citizenList);
//
//        return  reqResponse;
//    }

    public RequiredResponse getAllDataBasedOnCenterId(Integer id){
        RequiredResponse reqResponse=new RequiredResponse();

        //finding center
        VaccinationCenter center=this.findById(id).orElse(null);
        reqResponse.setVaccinationCenter(center);

        //citizen associated with center
        List<Citizen> citizenList = citizenClientService.getCitizensFromService(id);
        reqResponse.setCitizens(citizenList);

        return  reqResponse;
    }

}
