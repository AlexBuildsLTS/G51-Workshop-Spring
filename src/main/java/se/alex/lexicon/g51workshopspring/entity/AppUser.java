package se.alex.lexicon.g51workshopspring.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Entity
public class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String password;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<BookLoan> bookLoans = new ArrayList<>();

    // Constructors, Getters, and Setters

    public AppUser() {}

    public AppUser(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Getters and Setters

    // Helper method to add book loan
    public void addBookLoan(BookLoan bookLoan) {
        bookLoan.setUser(this);
        this.bookLoans.add(bookLoan);
    }

    public void setRegDate(LocalDate of) {
    }
}
