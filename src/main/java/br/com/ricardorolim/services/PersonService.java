package br.com.ricardorolim.services;

import br.com.ricardorolim.exception.ResourceNotFoundException;
import br.com.ricardorolim.model.Person;
import br.com.ricardorolim.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonService {

    private AtomicLong counter = new AtomicLong();

    @Autowired
    PersonRepository repository;

    private Logger logger = Logger.getLogger(PersonService.class.getName());

    public Person findById(Long id){
        logger.info("Find one person");
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Pessoa não encontrada!"));
    }

    public List<Person> findAll() {
        List<Person> persons = new ArrayList<Person>();
        return repository.findAll();
    }

    public Person create(Person person){

        Person createdPerson = new Person();

        createdPerson.setName(person.getName());
        createdPerson.setLastName(person.getLastName());
        createdPerson.setGender(person.getGender());
        createdPerson.setAddress(person.getAddress());

        return repository.save(createdPerson);
    }

    public Person update(Person person){
        Person updatedPerson = repository.findById(person.getId())
                .orElseThrow(() -> new ResourceNotFoundException("Pessoa não encontrada!"));

        updatedPerson.setName(person.getName());
        updatedPerson.setLastName(person.getLastName());
        updatedPerson.setGender(person.getGender());
        updatedPerson.setAddress(person.getAddress());

        return repository.save(updatedPerson);
    }

    public void delete(Long id){
        Person deletePerson = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Pessoa não encontrada!"));
        repository.delete(deletePerson);
    }


}

