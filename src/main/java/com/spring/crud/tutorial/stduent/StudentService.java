package com.spring.crud.tutorial.stduent;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    @GetMapping
    public List<Student> getStudents()
    {
        return List.of(
                new Student(
                        881972L,
                        "Cleonildo Junior",
                        30,
                        LocalDate.of(1990, Month.NOVEMBER, 9),
                        "cleu.junior@gmail.com"
                )
        );
    }

}
