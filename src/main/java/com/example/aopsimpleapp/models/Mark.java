package com.example.aopsimpleapp.models;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.Date;

@Entity
@Getter
@Setter
public class Mark {
    @GeneratedValue
    @Id
    private Long id;
    @CreationTimestamp
    private Date creationDate;
    @Min(0)
    @Max(10)
    private int mark;
    @ManyToOne
    private Student student;
}
