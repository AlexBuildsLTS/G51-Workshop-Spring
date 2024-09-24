package se.alex.lexicon.g51workshopspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se.alex.lexicon.g51workshopspring.entity.Student;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByFirstName(String firstName);
    List<Student> findByLastName(String lastName);
    List<Student> findByFirstNameAndLastName(String firstName, String lastName);

    // This will work only if there's an 'age' field in the Student entity
    List<Student> findByAgeGreaterThan(int age);
}
