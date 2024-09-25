package se.alex.lexicon.g51workshopspring.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

@Entity
@Table(name = "app_user")
@Getter
@Setter
public class appUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private LocalDate regDate;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "details_id", referencedColumnName = "id")
    private se.alex.lexicon.g51workshopspring.entity.details details;


    public appUser() {
    }


    public appUser(String username, String password, LocalDate regDate, se.alex.lexicon.g51workshopspring.entity.details details) {
        this.username = username;
        this.password = password;
        this.regDate = regDate;
        this.details = details;
    }
}
