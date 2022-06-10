package com.experiment.firstapp.Controller;

import com.experiment.firstapp.Model.Person;

import com.experiment.firstapp.repo.PersonRepository;
import org.springframework.beans.factory.annotation.*;

import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;

@RestController
public class PersonController {

//    @Autowired
//    private PersonRepository personRepository;


    @Autowired
    private PersonRepository repo;

//    @GetMapping("/asd")
//    public String firstmet(Model model){
//        Iterable<Person> persons = personRepository.findAll();
//        model.addAttribute("persons",persons);
//        return "firstmain";
//    }

    @GetMapping("/jackson")
    public String list(){
        ArrayList checklist = (ArrayList) repo.findByName();
        return  checklist.toString();
    }

    @PostMapping("/serialize")
    public @ResponseBody String newPerson (@RequestParam @Valid String name,
                                           @RequestParam String email,
                                           @RequestParam String passwd)
     {
        Person person = new Person();
        person.setName(name);
        person.setEmail(email);
        person.setPasswd(passwd);
        return String.valueOf(repo.save(person));
    }
}
