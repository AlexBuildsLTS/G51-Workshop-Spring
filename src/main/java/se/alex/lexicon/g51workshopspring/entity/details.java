package se.alex.lexicon.g51workshopspring.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

@Entity
@Table(name = "details")
@Getter
@Setter
public class details {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private LocalDate birthDate;

    // Default constructor
    public details() {
    }

    // Parameterized constructor matching the DataLoader usage
    public details(String email, String name, LocalDate birthDate) {
        this.email = email;
        this.name = name;
        this.birthDate = birthDate;
    }
}
