package se.alex.lexicon.g51workshopspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import se.alex.lexicon.g51workshopspring.entity.Author;


import java.util.List;
import java.util.Optional;

public interface AuthorRepository extends JpaRepository<Author, Long> {
    @Modifying
    @Query("UPDATE Author a SET a.firstName = :firstName, a.lastName = :lastName WHERE a.authorId = :authorId")
    void updateAuthorNameById(@Param("firstName") String firstName, @Param("lastName") String lastName, @Param("authorId") Long authorId);

    List<Author> findByFirstName(String firstName);
    List<Author> findByLastName(String lastName);
    List<Author> findByFirstNameContainingOrLastNameContaining(String firstName, String lastName);
    List<Author> findByBooksId(Long bookId);

}
