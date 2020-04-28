package com.sudhs.mysqldemo.repository;

import com.sudhs.mysqldemo.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> {
}
