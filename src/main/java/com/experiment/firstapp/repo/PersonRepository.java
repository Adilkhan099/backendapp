package com.experiment.firstapp.repo;

import com.experiment.firstapp.Model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface PersonRepository extends JpaRepository<Person,Integer> {
    @Query(value = "SELECT name from Person")
    Iterable<Person> findByName();
}
