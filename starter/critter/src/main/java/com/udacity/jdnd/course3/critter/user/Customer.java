package com.udacity.jdnd.course3.critter.user;

import com.udacity.jdnd.course3.critter.pet.Pet;
import lombok.*;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Customer {

    @Id
    @GeneratedValue
    private long id;

    private String name;

    private String phoneNumber;

    private String notes;

    @OneToMany(mappedBy = "customer",
            orphanRemoval = true,
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private List<Pet> pets;

    public void addPet(Pet pet) {
        if (pets == null) {
            pets = new ArrayList<>();
        }
        pets.add(pet);
    }
}
