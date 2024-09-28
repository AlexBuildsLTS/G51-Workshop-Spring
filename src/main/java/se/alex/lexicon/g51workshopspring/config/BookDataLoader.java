package se.alex.lexicon.g51workshopspring.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import se.alex.lexicon.g51workshopspring.entity.Author;
import se.alex.lexicon.g51workshopspring.entity.Book;
import se.alex.lexicon.g51workshopspring.repository.AuthorRepository;
import se.alex.lexicon.g51workshopspring.repository.BookRepository;

import java.time.LocalDate;

@Configuration
public class BookDataLoader {

    @Bean
    CommandLineRunner loadBookData(AuthorRepository authorRepository, BookRepository bookRepository) {
        return args -> {
            Author author1 = new Author("J.K.", "Rowling");
            authorRepository.save(author1);



            Author author2 = new Author("George", "Orwell");
            authorRepository.save(author2);

            Book book1 = new Book("978-0747532699", "Harry Potter and the Philosopher's Stone", LocalDate.of(1997, 6, 26), author1);
            Book book2 = new Book("978-0451524935", "1984", LocalDate.of(1949, 6, 8), author2);

            bookRepository.save(book1);
            bookRepository.save(book2);

            System.out.println("Sample book data has been inserted into the database.");
        };
    }
}
