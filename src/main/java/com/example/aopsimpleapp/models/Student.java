package com.example.aopsimpleapp.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
public class Student {
    @GeneratedValue
    @Id
    private Long id;
    @Column(unique = true)
    private String name;
    @OneToMany(mappedBy = "student", cascade = CascadeType.REMOVE)
    private Set<Mark> marks;
}
