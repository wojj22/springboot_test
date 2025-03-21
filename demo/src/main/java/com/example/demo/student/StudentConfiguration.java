package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfiguration {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args ->{
            Student mariam = new Student(
                    LocalDate.of(2001, Month.JANUARY, 15),
                    "mariam@gmail.com",
                    "Mariam"
            );
            Student kamal = new Student(
                    LocalDate.of(2002, Month.JANUARY, 15),
                    "kamalm@gmail.com",
                    "Kamal"
            );
            studentRepository.saveAll(
                    List.of(mariam, kamal)
            );
        };
    }

}
