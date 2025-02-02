package com.udacity.jdnd.course3.critter.repository;


import com.udacity.jdnd.course3.critter.pet.Pet;
import com.udacity.jdnd.course3.critter.user.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PetRepository extends JpaRepository <Pet, Long> {

    List<Pet> findAllByCustomer_Id(Long ownerId);
    Customer findCustomerById(Long id);
}
