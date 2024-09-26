package se.alex.lexicon.g51workshopspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se.alex.lexicon.g51workshopspring.entity.Book;

import java.time.LocalDate;
import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {

    @Override
    List<Book> findAll();

    List<Book> findByTitle(String title);


    List<Book> findByAuthor(String author);


    Book findByIsbn(String isbn);


    List<Book> findByPublicationDateBefore(LocalDate date);


    List<Book> findByPublicationDateAfter(LocalDate date);
}
