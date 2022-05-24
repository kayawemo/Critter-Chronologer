package com.udacity.jdnd.course3.critter.pet;

import com.udacity.jdnd.course3.critter.schedule.Schedule;
import com.udacity.jdnd.course3.critter.user.Customer;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@Setter
public class Pet {

    @Id
    @GeneratedValue
    private long id;

    private PetType type;

    private String name;

    private LocalDate birthDate;

    private String notes;

    @ManyToOne
    @JoinColumn(name = "ownerId")
    private Customer customer;

    @ManyToMany(mappedBy = "pets")
    private Set<Schedule> schedules;

}
