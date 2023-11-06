package ru.netology.hibernate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.hibernate.HibernateApplication;
import ru.netology.hibernate.repository.PersonsRepository;

@RestController
public class PersonsController {
    private final PersonsRepository personsRepository;

    @Autowired
    public PersonsController(PersonsRepository personsRepository) {
        this.personsRepository = personsRepository;
    }

    @GetMapping("/persons/by-city")
    public String getPersonsByCity(@RequestParam String city) {
        return HibernateApplication.getPersonsByCity(city);
    }

    @GetMapping("/persons/by-age")
    public String getPersonsByAge(@RequestParam int age) {
        return HibernateApplication.getPersonsByAge(age);
    }

    @GetMapping("/persons/by-name-surname")
    public String getPersonsByNameSurname(@RequestParam String name, @RequestParam String surname) {
        return HibernateApplication.getPersonsByNameSurname(name,surname);
    }
}

