package ru.netology.hibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.netology.hibernate.domain.Fio;
import ru.netology.hibernate.domain.Persons;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonsRepository extends JpaRepository <Persons, Fio> {

    List<Persons> findByCitiOfLiving(String city);
    List<Persons> findByFioAgeLessThanOrderByFioAgeAsc(int age);
    Optional<Persons> findByFioNameAndFioSurname(String name, String surname);
}
