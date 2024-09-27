package se.alex.lexicon.g51workshopspring;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import se.alex.lexicon.g51workshopspring.entity.Book;
import se.alex.lexicon.g51workshopspring.repository.BookRepository;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class BookRepositoryTests {

    @Autowired
    private BookRepository bookRepository;

    @Test
    public void testFindByTitle() {
        List<Book> books = bookRepository.findByTitle("Dune");
        assertFalse(books.isEmpty());
    }

    @Test
    public void testFindByAuthorLastName() {
        List<Book> books = bookRepository.findByAuthor_LastName("Herbert");
        assertFalse(books.isEmpty());
    }

    @Test
    public void testFindByPublicationDateBefore() {
        List<Book> books = bookRepository.findByPublicationDateBefore(LocalDate.of(2000, 1, 1));
        assertFalse(books.isEmpty());
    }

    @Test
    public void testFindByIsbn() {
        Book book = bookRepository.findByIsbn("978-0441013593");
        assertNotNull(book);
    }
}
