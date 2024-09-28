package se.alex.lexicon.g51workshopspring.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import se.alex.lexicon.g51workshopspring.entity.AppUser;
import se.alex.lexicon.g51workshopspring.repository.AppUserRepository;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner loadData(AppUserRepository appUserRepository) {
        return args -> {
            AppUser user1 = new AppUser("alexyoung", "password123");
            AppUser user2 = new AppUser("sandy", "password123");

            appUserRepository.save(user1);
            appUserRepository.save(user2);

            System.out.println("Sample user data has been inserted into the database.");
        };
    }
}
