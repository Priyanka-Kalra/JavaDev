package com.microservices.citizenservice.Controller;

import com.microservices.citizenservice.Model.Citizen;
import com.microservices.citizenservice.Service.CitizenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/citizen")
public class CitizenController {
    @Autowired
    private CitizenService service;

//    @GetMapping("/test")
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public ResponseEntity<String> test(){
        return new ResponseEntity<>("Hello There",HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Citizen> addCitizen(@RequestBody Citizen newCitizen){

        Citizen citizen=service.save(newCitizen);
        return new ResponseEntity<>(citizen,HttpStatus.OK);
    }

    @GetMapping("/vaccination-center/{id}")
    public ResponseEntity<List<Citizen>> findByVaccinationCentreId(@PathVariable Integer id){

        List<Citizen> listCitizen=service.findByVaccinationCenterId(id);
        return  listCitizen.isEmpty() ?new ResponseEntity<>(HttpStatus.NO_CONTENT): new ResponseEntity<>(listCitizen,HttpStatus.OK);
    }

//    @GetMapping("/vaccination-center/{id}")
//    public List<Citizen> getByCenterId(@PathVariable Integer id) {
//        throw new RuntimeException("Simulated failure");
//    }
}
