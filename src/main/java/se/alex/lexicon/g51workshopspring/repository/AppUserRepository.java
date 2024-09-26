package se.alex.lexicon.g51workshopspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se.alex.lexicon.g51workshopspring.entity.AppUser;

import java.time.LocalDate;
import java.util.List;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {


    AppUser findByUsername(String username);


    List<AppUser> findByRegDateBetween(LocalDate startDate, LocalDate endDate);


    AppUser findByDetails_Id(Long id);
}
