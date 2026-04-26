package com.microservices.vaccinationcenter.Controller;


import com.microservices.vaccinationcenter.Model.Citizen;
import com.microservices.vaccinationcenter.Model.RequiredResponse;
import com.microservices.vaccinationcenter.Model.VaccinationCenter;
import com.microservices.vaccinationcenter.Service.VaccinationCenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vaccinationcenter")
public class VaccinationCenterController {
    @Autowired
    private VaccinationCenterService service;

    @PostMapping("/add")
    public ResponseEntity<VaccinationCenter> addCitizen(@RequestBody VaccinationCenter newCenter){

        VaccinationCenter centerAdded=service.save(newCenter);
        return new ResponseEntity<>(centerAdded,HttpStatus.OK);
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<RequiredResponse> getAllDataBasedOnCenterId(@PathVariable Integer id){
        return new ResponseEntity<>(service.getAllDataBasedOnCenterId(id),HttpStatus.OK);
    }

}
