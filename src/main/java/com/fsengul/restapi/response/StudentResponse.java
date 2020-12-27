package com.fsengul.restapi.response;


import com.fasterxml.jackson.annotation.JsonProperty;

import com.fsengul.restapi.entity.Student;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class StudentResponse {

    private long id;

    @JsonProperty("first_name")
    private String firstName;

    private String lastName;

    private String email;

    public StudentResponse (Student student) {
        this.id = student.getId();
        this.firstName = student.getFirstName();
        this.lastName = student.getLastName();
        this.email = student.getEmail();
    }

}