package se.alex.lexicon.g51workshopspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se.alex.lexicon.g51workshopspring.entity.AppUser;

import java.time.LocalDate;
import java.util.List;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {

    // Find user by username
    AppUser findByUsername(String username);

    // Find users by registration date between two specific dates
    List<AppUser> findByRegDateBetween(LocalDate startDate, LocalDate endDate);

    // Find user by Details id (relationship reference)
    AppUser findByDetails_Id(Long id);
}
