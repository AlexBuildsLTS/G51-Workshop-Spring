package se.alex.lexicon.g51workshopspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se.alex.lexicon.g51workshopspring.entity.appUser;

import java.time.LocalDate;
import java.util.List;

public interface appUserRepository extends JpaRepository<appUser, Long> {


    appUser findByUsername(String username);


    List<appUser> findByRegDateBetween(LocalDate startDate, LocalDate endDate);


    appUser findByDetails_Id(Long id);
}
