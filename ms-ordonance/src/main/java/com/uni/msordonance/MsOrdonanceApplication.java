package com.uni.msordonance;

import com.uni.msordonance.Entities.Medicament;
import com.uni.msordonance.Entities.Ordonance;
import com.uni.msordonance.Repository.MedicamentRepository;
import com.uni.msordonance.Repository.OrdonanceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.util.Date;

@SpringBootApplication
@RequiredArgsConstructor
@EnableFeignClients
public class MsOrdonanceApplication implements CommandLineRunner {
    final OrdonanceRepository ordonanceRepository;
    final MedicamentRepository medicamentRepository;



    public static void main(String[] args) {
        SpringApplication.run(MsOrdonanceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Ordonance o1 = new Ordonance(null, new Date(),null,1L,null);
        Ordonance o2 = Ordonance.builder().dateOrdonance(new Date()).idPatient(2L).build();

        o1 = ordonanceRepository.save(o1);
        o2 = ordonanceRepository.save(o2);

        medicamentRepository.save(new Medicament(null,"Doliprane",13,"500mg",80.00,o1));
        medicamentRepository.save(new Medicament(null,"Gripex",10,"20mg",170.00,o1));

        medicamentRepository.save(new Medicament(null,"Antag",3,"50mg",250.00,o2));
        medicamentRepository.save(new Medicament(null,"Debridat",18,"20mg",170.00,o2));



    }
}
