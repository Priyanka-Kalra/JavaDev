package com.microservices.citizenservice.Service;

import com.microservices.citizenservice.Model.Citizen;
import com.microservices.citizenservice.Repo.CitizenRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitizenService {

    @Autowired
    private CitizenRep citizenRep;

    public List<Citizen> findByVaccinationCenterId(Integer id){
        return citizenRep.findByVaccinationCenterId(id);
    }

    public Citizen save(Citizen newCitizen){
        return citizenRep.save(newCitizen);
    }

}
