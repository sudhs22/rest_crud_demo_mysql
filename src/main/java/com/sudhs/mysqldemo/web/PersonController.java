package com.sudhs.mysqldemo.web;

import com.sudhs.mysqldemo.model.Person;
import com.sudhs.mysqldemo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
public class PersonController {
    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService=personService;
    }

    @PostMapping
    public Person create(@RequestBody Person person){
        return personService.save(person);
    }

    @PatchMapping("/{id}")
    public Person update(@PathVariable Integer id, @RequestBody Person person){
        person.setId(id);
        return personService.save(person);
    }
}
