package se.alex.lexicon.g51workshopspring.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String isbn;

    @ManyToOne
    @JoinColumn(name = "author_id", nullable = false)
    private Author author;

    private LocalDate publicationDate;

    private boolean available = true;



    public Book() {}

    public Book(String title, String isbn, LocalDate publicationDate) {
        this.title = title;
        this.isbn = isbn;
        this.publicationDate = publicationDate;
    }



}
