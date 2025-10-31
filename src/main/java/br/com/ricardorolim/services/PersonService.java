package br.com.ricardorolim.services;

import br.com.ricardorolim.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonService {

    private AtomicLong counter = new AtomicLong();

    private Logger logger = Logger.getLogger(PersonService.class.getName());

    public Person findById(String id){
        logger.info("Find one person");

        Person person = new Person();

        person.setId(counter.incrementAndGet());
        person.setName("Malaquias");
        person.setLastName("Seixas");
        person.setGender("masculino");
        person.setAddress("Londrina");

        return person;

    }

    public List<Person> findAll() {
        List<Person> persons = new ArrayList<Person>();

        for (int i = 0; i < 8; i++){
            Person person = mockPerson(i);

            persons.add(person);
        }

        return persons;
    }

    public Person create(Person person){
        logger.info("Creating a person");

        return person;
    }

    public Person update(Person person){
        logger.info("update a person");

        return person;
    }

    public void delete(String id){
        logger.info("delete a person");

    }

    private Person mockPerson(int i) {
        Person person = new Person();

        person.setId(counter.incrementAndGet());
        person.setName("Nome " + i);
        person.setLastName("Sobrenome " + i);
        person.setGender("masculino");
        person.setAddress("em algum lugar no Brasil");

        return person;
    }
}

