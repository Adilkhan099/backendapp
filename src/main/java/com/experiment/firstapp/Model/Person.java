package com.experiment.firstapp.Model;

import com.experiment.firstapp.Unique;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;

@Entity
public class Person {
    @Id
    private  int id;

    @Email
    @Column(unique = true)
    @Unique(message = "Такой пользователь уже существует")
    private String name;

    private String email;

    private String passwd;

    public Person(int id, String name, String passwd, String email){
        super();
        this.id = id;
        this.name = name;
        this.email = email;
        this.passwd = passwd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(){
    }
}
