package com.app.repository;

import com.app.model.Person;

import java.util.List;

public interface PersonRepository {
    Person add(Person person);
    List<Person> findAll();
}
