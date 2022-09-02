package com.example.aopsimpleapp.models;


import lombok.Getter;

import java.util.List;

@Getter
public class StudentDTO {
    private final List<Integer> marks;
    private final String name;

    public StudentDTO(Student student){
        this.marks = student.getMarks().stream().map(Mark::getMark).toList();
        this.name = student.getName();
    }
}
