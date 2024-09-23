package se.alex.lexicon.g51workshopspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se.alex.lexicon.g51workshopspring.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {
    // Custom query methods can be added here as needed
}
