package com.microservices.vaccinationcenter.Repo;

import com.microservices.vaccinationcenter.Model.RequiredResponse;
import com.microservices.vaccinationcenter.Model.VaccinationCenter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VaccinationCenterRep extends JpaRepository<VaccinationCenter,Integer> {


}
