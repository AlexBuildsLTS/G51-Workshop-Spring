package se.alex.lexicon.g51workshopspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se.alex.lexicon.g51workshopspring.entity.Book;

import java.time.LocalDate;
import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByAuthor_LastName(String lastName);
    List<Book> findByTitle(String title);
    List<Book> findByPublicationDateBefore(LocalDate date);
    List<Book> findByPublicationDateAfter(LocalDate date);
    Book findByIsbn(String isbn);
}
