package se.alex.lexicon.g51workshopspring;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import se.alex.lexicon.g51workshopspring.entity.AppUser;
import se.alex.lexicon.g51workshopspring.entity.Author;
import se.alex.lexicon.g51workshopspring.entity.Book;
import se.alex.lexicon.g51workshopspring.entity.BookLoan;
import se.alex.lexicon.g51workshopspring.repository.AppUserRepository;
import se.alex.lexicon.g51workshopspring.repository.BookLoanRepository;
import se.alex.lexicon.g51workshopspring.repository.BookRepository;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class BookLoanRepositoryTests {

    @Autowired
    private BookLoanRepository bookLoanRepository;

    @Autowired
    private AppUserRepository appUserRepository;

    @Autowired
    private BookRepository bookRepository;

    @Test
    public void testCreateAndFindById() {

        AppUser user = appUserRepository.findByUsername("youngster").orElseThrow();
        assertNotNull(user);

        Author author = new Author("Frank", "Herbert");
        Book book = new Book("Dune", "978-0441013593", LocalDate.of(1965, 8, 1), author);
        bookRepository.save(book);

        BookLoan bookLoan = new BookLoan(user, book, LocalDate.now(), LocalDate.now().plusDays(14), false);
        bookLoanRepository.save(bookLoan);

        // Find by ID
        BookLoan foundLoan = bookLoanRepository.findById(bookLoan.getId()).orElse(null);
        assertNotNull(foundLoan);
        assertEquals("Dune", foundLoan.getBook().getTitle());
    }
}
