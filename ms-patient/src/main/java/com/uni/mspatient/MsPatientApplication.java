package com.uni.mspatient;

import com.uni.mspatient.Entities.AntecedentMedical;
import com.uni.mspatient.Entities.Patient;
import com.uni.mspatient.Repository.AntecedentRepository;
import com.uni.mspatient.Repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.util.Date;

@SpringBootApplication
@RequiredArgsConstructor
public class MsPatientApplication implements CommandLineRunner {
    final PatientRepository patientRepository;
    final AntecedentRepository antecedentRepository;

    final RepositoryRestConfiguration config;



    public static void main(String[] args) {
        SpringApplication.run(MsPatientApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        config.exposeIdsFor(Patient.class);

        Patient p1 = patientRepository.save(new Patient(null,"said", null));
        Patient p2 = patientRepository.save(new Patient(null,"mahdi", null));

        antecedentRepository.save(new AntecedentMedical(null, "grippe", new Date(), p1));

        antecedentRepository.save(new AntecedentMedical(null, "diabete", new Date(), p2));

        antecedentRepository.save(new AntecedentMedical(null, "Asthme", new Date(), p1));







    }
}
