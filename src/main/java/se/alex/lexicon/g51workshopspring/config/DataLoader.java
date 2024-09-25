package se.alex.lexicon.g51workshopspring.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import se.alex.lexicon.g51workshopspring.entity.AppUser;
import se.alex.lexicon.g51workshopspring.entity.Details;
import se.alex.lexicon.g51workshopspring.repository.AppUserRepository;
import se.alex.lexicon.g51workshopspring.repository.DetailsRepository;
import java.time.LocalDate;
import java.lang.Long;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner loadData(AppUserRepository appUserRepository, DetailsRepository detailsRepository) {
        return args -> {
            // Create Details data
            Details details1 = new Details("alex.lex@example.com", "Alex Y", LocalDate.of(1994, 1, 1));
            Details details2 = new Details("sandra.lex@example.com", "Sandra Y", LocalDate.of(1992, 2, 22));

            // Save Details to database
            detailsRepository.save(details1);
            detailsRepository.save(details2);

            // Create AppUser data with associated Details
            AppUser user1 = new AppUser();
            AppUser user2 = new AppUser();

            // Save AppUsers to database
            appUserRepository.save(user1);
            appUserRepository.save(user2);
        };
    }
}
