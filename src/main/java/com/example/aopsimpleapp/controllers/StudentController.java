package com.example.aopsimpleapp.controllers;

import com.example.aopsimpleapp.models.Student;
import com.example.aopsimpleapp.models.StudentDTO;
import com.example.aopsimpleapp.services.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @GetMapping("/{id}")
    public Optional<StudentDTO> findStudentById(@PathVariable Long id){
        return studentService.findById(id).map(StudentDTO::new);
    }

    @PostMapping("/save")
    public void saveStudent(@RequestBody Student student){
        studentService.saveStudent(student);
    }

    @DeleteMapping("/{id}/delete")
    public void deleteStudentById(@PathVariable Long id){
        studentService.deleteById(id);
    }
}
