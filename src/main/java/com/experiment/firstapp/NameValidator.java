package com.experiment.firstapp;

import com.experiment.firstapp.repo.PersonRepository;
import com.sun.corba.se.impl.orbutil.RepositoryIdInterface;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.ArrayList;

public class NameValidator implements ConstraintValidator<Unique,String> {

    PersonRepository repository;

    @Override
    public void initialize(Unique name) {
    }

    @Override
    public boolean isValid(String name, ConstraintValidatorContext constraintValidatorContext) {
        ArrayList checklist = (ArrayList) repository.findByName();
        return checklist.contains(name);
    }
}
