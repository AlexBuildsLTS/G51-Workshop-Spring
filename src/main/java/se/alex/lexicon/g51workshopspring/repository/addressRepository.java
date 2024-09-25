package se.alex.lexicon.g51workshopspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se.alex.lexicon.g51workshopspring.entity.Address;

import java.util.List;

public interface addressRepository extends JpaRepository<Address, Long> {


    List<Address> findByStreet(String street);


    List<Address> findByCity(String city);


    List<Address> findByPostalCode(String postalCode);


    List<Address> findByCountry(String country);
}
