package com.crm.crm.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Contact {

    @Id @GeneratedValue
    private Long id;

    private String lastName;

    private String firstName;

    private String email;

    private Contact() {}

    public Contact(String fName, String lName, String email) {
        this.firstName = fName;
        this.lastName = lName;
        this.email = email;
    }

}
