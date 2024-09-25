package se.alex.lexicon.g51workshopspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se.alex.lexicon.g51workshopspring.entity.details;

import java.util.List;

public interface detailsRepository extends JpaRepository<details, Long> {

    details findByEmailIgnoreCase(String email);
    details findByEmail(String email);
    List<details> findByNameContains(String name);
    List<details> findByNameIgnoreCase(String name);
}
