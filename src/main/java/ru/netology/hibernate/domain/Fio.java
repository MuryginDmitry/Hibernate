package ru.netology.hibernate.domain;

import jakarta.persistence.Embeddable;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Embeddable
@Setter
@Getter
@EqualsAndHashCode
public class Fio implements Serializable {

    private String name;
    private String surname;
    private int age;

}
