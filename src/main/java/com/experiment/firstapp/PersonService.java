package com.experiment.firstapp;

import java.util.List;

import com.experiment.firstapp.Model.Person;
import com.experiment.firstapp.repo.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.transaction.Transactional;

@Service
@Transactional
public class PersonService {

    @Autowired
    private PersonRepository repo;

    public List<Person> listAll(){
        return (List<Person>) repo.findAll();
    }

    public PersonRepository Save(@RequestBody Person newPerson){
        
        return (PersonRepository) repo.save(newPerson);
    }

}
