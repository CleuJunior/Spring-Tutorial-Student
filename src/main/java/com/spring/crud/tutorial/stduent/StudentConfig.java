package com.spring.crud.tutorial.stduent;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository)
    {
        return args ->{
          Student cleonildo = new Student(
                    "Cleonildo Junior",
                    30,
                    LocalDate.of(1990, Month.NOVEMBER, 9),
                    "cleu.junior@gmail.com"
            );

            Student fernando = new Student(
                    "Fernando Souza",
                    36,
                    LocalDate.of(1983, Month.DECEMBER, 28),
                    "alex.souza@gmail.com"
            );

            repository.saveAll(
                    List.of(cleonildo, fernando)
            );
        };
    }
}
