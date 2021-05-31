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
          Student amaral = new Student(
                    "Jovenal Amaral",
                    LocalDate.of(1980, Month.JANUARY, 13),
                    "cleu.junior@gmail.com"
            );

            Student victoria = new Student(
                    "Victoria Filio",
                    LocalDate.of(1993, Month.MAY, 22),
                    "alex.souza@gmail.com"
            );

            repository.saveAll(
                    List.of(amaral, victoria)
            );
        };
    }
}
