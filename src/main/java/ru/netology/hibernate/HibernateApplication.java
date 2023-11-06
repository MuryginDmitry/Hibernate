package ru.netology.hibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.netology.hibernate.domain.Persons;
import ru.netology.hibernate.repository.PersonsRepository;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class HibernateApplication {

    @Autowired
    private static PersonsRepository personsRepository;

    public static void main(String[] args) {
        SpringApplication.run(HibernateApplication.class, args);
    }

    public static String getPersonsByCity(String city) {
        List <Persons> persons = personsRepository.findByCitiOfLiving(city);
        return persons.toString();
    }

    public static String getPersonsByAge(int age) {
        List <Persons> persons = personsRepository.findByFioAgeLessThanOrderByFioAgeAsc(age);
        return persons.toString();
    }

    public static String getPersonsByNameSurname(String name, String surname) {
        Optional <Persons> persons = personsRepository.findByFioNameAndFioSurname(name,surname);
        return persons.toString();
    }

}

