package se.alex.lexicon.g51workshopspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se.alex.lexicon.g51workshopspring.entity.student;

import java.util.List;

public interface studentRepository extends JpaRepository<student, Long> {
    List<student> findByFirstName(String firstName);
    List<student> findByLastName(String lastName);
    List<student> findByFirstNameAndLastName(String firstName, String lastName);


    List<student> findByAgeGreaterThan(int age);
}
