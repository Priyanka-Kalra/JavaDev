package com.microservices.citizenservice.Repo;

import com.microservices.citizenservice.Model.Citizen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CitizenRep extends JpaRepository<Citizen,Integer> {

    public List<Citizen> findByVaccinationCenterId(Integer id);
}
