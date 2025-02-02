package com.udacity.jdnd.course3.critter.repository;

import com.udacity.jdnd.course3.critter.pet.Pet;
import com.udacity.jdnd.course3.critter.schedule.Schedule;
import com.udacity.jdnd.course3.critter.user.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScheduleRepository extends JpaRepository <Schedule, Long> {

    List<Schedule> findAllByEmployeesContaining(Employee employee);
    List<Schedule> findAllByPetsContaining(Pet pet);
    List<Schedule> findAllByPetsIn(List<Pet> pets);
}
