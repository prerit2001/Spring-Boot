package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1L,
                        "Prerit",
                        "preritkrjha@gmail.com",
                        LocalDate.of(2001, 11, 27),
                        20
                ),
                new Student(
                        2L,
                        "Rounak",
                        "preritkrjha@gmail.com",
                        LocalDate.of(2001, 11, 27),
                        20
                )
        );
    }
}
