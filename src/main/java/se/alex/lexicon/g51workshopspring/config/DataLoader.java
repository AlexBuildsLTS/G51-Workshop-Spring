package se.alex.lexicon.g51workshopspring.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import se.alex.lexicon.g51workshopspring.entity.AppUser;
import se.alex.lexicon.g51workshopspring.repository.AppUserRepository;

import java.time.LocalDate;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner loadData(AppUserRepository appUserRepository) {
        return args -> {

            // Create sample AppUser instances
            AppUser user1 = new AppUser();
            user1.setUsername("alexyoussef");
            user1.setPassword("password123");
            user1.setRegDate(LocalDate.of(2020, 1, 1));

            AppUser user2 = new AppUser();
            user2.setUsername("sanna");
            user2.setPassword("password456");
            user2.setRegDate(LocalDate.of(2021, 2, 2));

            // Save AppUser instances
            appUserRepository.save(user1);
            appUserRepository.save(user2);
        };
    }
}
