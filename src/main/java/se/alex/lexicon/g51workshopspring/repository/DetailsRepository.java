package se.alex.lexicon.g51workshopspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se.alex.lexicon.g51workshopspring.entity.Details;

import java.util.List;

public interface DetailsRepository extends JpaRepository<Details, Long> {

    Details findByEmailIgnoreCase(String email);
    Details findByEmail(String email);
    List<Details> findByNameContains(String name);
    List<Details> findByNameIgnoreCase(String name);
}
