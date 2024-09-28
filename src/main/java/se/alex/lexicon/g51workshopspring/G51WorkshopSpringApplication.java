package se.alex.lexicon.g51workshopspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.boot.CommandLineRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import se.alex.lexicon.g51workshopspring.entity.Author;
import se.alex.lexicon.g51workshopspring.entity.Book;
import se.alex.lexicon.g51workshopspring.repository.AuthorRepository;
import se.alex.lexicon.g51workshopspring.repository.BookRepository;

import java.time.LocalDate;

@SpringBootApplication
public class G51WorkshopSpringApplication {

    private static final Logger log = LoggerFactory.getLogger(G51WorkshopSpringApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(G51WorkshopSpringApplication.class, args);
    }

    public G51WorkshopSpringApplication() {
    }

    /**
     * This CommandLineRunner bean will be executed on startup and is useful for
     * initial data seeding, especially during development
     */
    @Bean
    @Profile("dev")
    public CommandLineRunner dataLoader(AuthorRepository authorRepository, BookRepository bookRepository) {
        return args -> {

            Author author1 = new Author("J.K. Rowling");
            authorRepository.save(author1);

            Author author2 = new Author("George Orwell");
            authorRepository.save(author2);

            Book book1 = new Book();
            book1.setTitle("Harry Potter and the Philosopher's Stone");
            book1.setIsbn("978-0747532699");
            book1.setAuthor(author1);
            book1.setPublicationDate(LocalDate.of(1997, 6, 26));
            bookRepository.save(book1);

            Book book2 = new Book();
            book2.setTitle("1984");
            book2.setIsbn("978-0451524935");
            book2.setAuthor(author2);
            book2.setPublicationDate(LocalDate.of(1949, 6, 8));
            bookRepository.save(book2);

            log.info("Data inserted into the Database");
        };
    }
}
