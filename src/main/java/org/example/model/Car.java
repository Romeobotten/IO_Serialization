package org.example.model;

import java.io.Serializable;
import java.security.acl.Owner;
import java.time.LocalDate;

public class Car implements Serializable {

    int carId;
    String regNumber;
    String brand;
    String model;
    LocalDate regDate;
    Owner owner;

    public Car(int carId, String regNumber, String brand, String model, LocalDate regDate, Owner owner) {
        this.carId = carId;
        this.regNumber = regNumber;
        this.brand = brand;
        this.model = model;
        this.regDate = regDate;
        this.owner = owner;
    }
}
