package se.alex.lexicon.g51workshopspring.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import se.alex.lexicon.g51workshopspring.entity.appUser;
import se.alex.lexicon.g51workshopspring.entity.details;
import se.alex.lexicon.g51workshopspring.repository.appUserRepository;
import se.alex.lexicon.g51workshopspring.repository.detailsRepository;
import java.time.LocalDate;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner loadData(appUserRepository appUserRepository, detailsRepository detailsRepository) {
        return args -> {

            details details1 = new details("alex.lex@example.com", "Alex Y", LocalDate.of(1994, 1, 1));
            details details2 = new details("sandra.lex@example.com", "Sandra Y", LocalDate.of(1992, 2, 22));


            detailsRepository.save(details1);
            detailsRepository.save(details2);


            appUser user1 = new appUser();
            appUser user2 = new appUser();


            appUserRepository.save(user1);
            appUserRepository.save(user2);
        };
    }
}
