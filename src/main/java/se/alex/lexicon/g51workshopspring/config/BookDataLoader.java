package se.alex.lexicon.g51workshopspring.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import se.alex.lexicon.g51workshopspring.entity.Author;
import se.alex.lexicon.g51workshopspring.entity.Book;
import se.alex.lexicon.g51workshopspring.repository.AuthorRepository;
import se.alex.lexicon.g51workshopspring.repository.BookRepository;

@Component
public class BookDataLoader implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BookDataLoader(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Author author1 = new Author();
        author1.setFirstName("Frank");
        author1.setLastName("Herbert");

        Author author2 = new Author();
        author2.setFirstName("George");
        author2.setLastName("Orwell");

        // Save Authors
        authorRepository.save(author1);
        authorRepository.save(author2);

        // Create Book instances
        Book book1 = new Book();
        book1.setTitle("Dune");
        book1.setIsbn("123456789");
        book1.setAuthor(author1);

        Book book2 = new Book();
        book2.setTitle("1984");
        book2.setIsbn("987654321");
        book2.setAuthor(author2);


        bookRepository.save(book1);
        bookRepository.save(book2);
    }
}
