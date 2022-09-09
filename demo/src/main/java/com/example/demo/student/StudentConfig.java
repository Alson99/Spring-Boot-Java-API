package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.util.Calendar.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student Alson = new Student(
                    "Alson",
                    "alson@gmail.com",
                    LocalDate.of(1999, Month.JANUARY, 24)
            );
            Student Chris = new Student(
                    "Chris",
                    "chris@gmail.com",
                    LocalDate.of(2000, Month.NOVEMBER, 25)
            );
            Student Als = new Student(
                    "Als",
                    "als@gmail.com",
                    LocalDate.of(2004, Month.FEBRUARY, 06)
            );
            Student Nell = new Student(
                    "Nell",
                    "nell@gmail.com",
                    LocalDate.of(1998, Month.MARCH, 23)
            );
            repository.saveAll(
                    List.of(Alson, Chris, Als, Nell)
            );
        };
    }

}
