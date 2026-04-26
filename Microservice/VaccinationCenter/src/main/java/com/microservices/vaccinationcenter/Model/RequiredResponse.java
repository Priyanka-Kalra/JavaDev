package com.microservices.vaccinationcenter.Model;

import com.microservices.vaccinationcenter.Repo.VaccinationCenterRep;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequiredResponse {

    private VaccinationCenter vaccinationCenter;
    private List<Citizen> citizens;


}
