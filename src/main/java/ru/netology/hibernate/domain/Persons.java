package ru.netology.hibernate.domain;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.*;

@ToString
@Getter
@Setter
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Persons {

    @EmbeddedId
    private Fio fio;

    private String phoneNumber;
    private String citiOfLiving;
}
