package se.alex.lexicon.g51workshopspring;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import se.alex.lexicon.g51workshopspring.entity.Author;
import se.alex.lexicon.g51workshopspring.repository.AuthorRepository;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class AuthorRepositoryTests {

    @Autowired
    private AuthorRepository authorRepository;

    @Test
    public void testFindByFirstName() {
        List<Author> authors = authorRepository.findByFirstName("Frank");
        assertFalse(authors.isEmpty());
    }

    @Test
    public void testFindByLastName() {
        List<Author> authors = authorRepository.findByLastName("Asimov");
        assertFalse(authors.isEmpty());
    }

    @Test
    public void testFindByBooksId() {
        List<Author> authors = authorRepository.findByBooks_Id(1L);
        assertFalse(authors.isEmpty());
    }
}
