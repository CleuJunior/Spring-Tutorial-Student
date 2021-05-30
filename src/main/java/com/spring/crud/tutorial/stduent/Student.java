package com.spring.crud.tutorial.stduent;

import java.time.LocalDate;

public class Student {
    private Long id;
    private String name;
    private Integer age;
    private LocalDate date_ber;
    private String email;

    public Student() {

    }

    public Student(Long id, String name, Integer age, LocalDate date_ber, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.date_ber = date_ber;
        this.email = email;
    }

    public Student(String name, Integer age, LocalDate date_ber, String email) {
        this.name = name;
        this.age = age;
        this.date_ber = date_ber;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDate getDate_ber() {
        return date_ber;
    }

    public void setDate_ber(LocalDate date_ber) {
        this.date_ber = date_ber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Studant: " + name + '\'' +
                "Id: " + id + '\'' +
                ", Age: " + age + '\'' +
                ", Birth: " + date_ber + '\'' +
                ", E-mail: " + email;
    }
}