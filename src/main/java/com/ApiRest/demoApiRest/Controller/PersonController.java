package com.ApiRest.demoApiRest.Controller;

import java.util.List;

import com.ApiRest.demoApiRest.model.Person;
import com.ApiRest.demoApiRest.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
//@RestController
@RequestMapping("/api")
@ResponseBody
public class PersonController {

    // alt + invio
    @Autowired
    private PersonRepository repository;


    @GetMapping("/persons")
    public List<Person> allPersons(){
        return repository.findAll();
    }

    @GetMapping("/person/{name}")
    public List<Person> findByName(@PathVariable("name") String name) {
        return repository.findByName(name);
    }

    @PostMapping("/person")
    public Person createPerson(@RequestBody Person person) {
        return repository.save(person);
    }

    @PutMapping("/person/{id}")
    public Person updatePerson(@PathVariable int id ,@RequestBody Person person) {
        return repository.save(person);
    }

    @DeleteMapping("/person/{id}")
    public void deletePerson(@PathVariable("id") Long id) {
        repository.deleteById(id);
    }

    @RequestMapping("/hello")
    @ResponseBody
    public String sayHello(){
        return "Hello";
    }
}

