package com.sudhs.mysqldemo.service;

import com.sudhs.mysqldemo.model.Person;
import com.sudhs.mysqldemo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    private final PersonRepository personRepository;
    @Autowired
    public PersonService(PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    public Person save(Person person) {
        return personRepository.save(person);
    }

    public Person findById(Integer personId){
        return personRepository.findById(personId).get();
    }
}
