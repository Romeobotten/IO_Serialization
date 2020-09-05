package org.example.model;

import java.io.Serializable;
import java.time.LocalDate;

public class Owner implements Serializable {

    int ownerId;
    String name;
    LocalDate birthdate;

    public Owner(int ownerId, String name, LocalDate birthdate) {
        this.ownerId = ownerId;
        this.name = name;
        this.birthdate = birthdate;
    }
}
