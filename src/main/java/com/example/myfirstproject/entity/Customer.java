package com.example.myfirstproject.entity;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import org.springframework.beans.factory.annotation.Value;

public class Customer {

    private String firstName;

    @NotNull(message = "Fill this Field please!")
    @Size(min = 1, message = "Fill this Field please!")
    @Pattern(regexp = "^[a-zA-Z0-9]{4}", message = "only 4 chars/digits")
    private String lastName;
    @Min(value=0, message = "must be greater than zero")
    @Max(value=100, message = "must be lower than 10")
    private Integer age;

    private String email;
    private boolean alreadyCustomer;

    public Customer() {

    }

    public Customer(String firstName, String lastName, Integer age, String email, boolean alreadyCustomer) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.alreadyCustomer = alreadyCustomer;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isAlreadyCustomer() {
        return alreadyCustomer;
    }

    public void setAlreadyCustomer(boolean alreadyCustomer) {
        this.alreadyCustomer = alreadyCustomer;
    }
}
