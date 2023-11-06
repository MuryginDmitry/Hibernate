package ru.netology.hibernate.domain;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import lombok.*;

import java.io.Serializable;

@Embeddable
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Fio implements Serializable {

    private String name;
    private String surname;
    private int age;

}
