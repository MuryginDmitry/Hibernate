package ru.netology.hibernate.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;
import ru.netology.hibernate.domain.Persons;
import java.util.List;

@Repository
public class PersonsRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public String getPersonsByCity(String city) {
        List<Persons> persons = entityManager.createQuery(
                            "SELECT p FROM Persons p WHERE p.citiOfLiving = :city", Persons.class)
                    .setParameter("city", city)
                    .getResultList();
        if (persons.isEmpty()) {
            return "Нет людей из этого города.";
        } else {
            return persons.toString();
        }
    }
}
