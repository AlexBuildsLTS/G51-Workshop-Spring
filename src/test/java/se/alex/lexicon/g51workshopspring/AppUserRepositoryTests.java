package se.alex.lexicon.g51workshopspring;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import se.alex.lexicon.g51workshopspring.entity.AppUser;
import se.alex.lexicon.g51workshopspring.repository.AppUserRepository;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class AppUserRepositoryTests {

    @Autowired
    private AppUserRepository appUserRepository;

    @Test
    public void testFindByUsername() {
        Optional<AppUser> user = appUserRepository.findByUsername("alexyoung");
        assertTrue(user.isPresent());
    }

    @Test
    public void testSaveUser() {
        AppUser user = new AppUser("Alex youssef", "password123");
        appUserRepository.save(user);
        Optional<AppUser> savedUser = appUserRepository.findByUsername("Alex youssef");
        assertTrue(savedUser.isPresent());
    }
}
