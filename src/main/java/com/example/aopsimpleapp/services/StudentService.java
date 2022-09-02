package com.example.aopsimpleapp.services;

import com.example.aopsimpleapp.models.Student;
import com.example.aopsimpleapp.repositories.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;

    public Optional<Student> findById(Long id){
        return studentRepository.findById(id);
    }

    public void saveStudent(Student student){
        studentRepository.save(student);
    }

    public void deleteById(Long id){
        studentRepository.deleteById(id);
    }
}
