package br.com.ricardorolim.repository;


import br.com.ricardorolim.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
