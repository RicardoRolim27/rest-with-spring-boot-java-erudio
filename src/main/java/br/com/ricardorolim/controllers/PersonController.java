package br.com.ricardorolim.controllers;

import br.com.ricardorolim.model.Person;
import br.com.ricardorolim.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/api/rest/person")
public class PersonController {

    @Autowired
    private PersonService personService;


    @GetMapping(value = "/{id}")
    public Person getById(@PathVariable("id") Long id) {
        return personService.findById(id);
    }


    @GetMapping()
    public List<Person> getAll() {

        List<Person> persons = personService.findAll();

        return persons;
    }

    @PostMapping("/create")
    public Person create(@RequestBody Person person) {
        return personService.create(person);
    }

    @PutMapping("/update")
    public Person update(@RequestBody Person person) {
        return personService.update(person);
    }


    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {

        personService.delete(id);
    }

}
