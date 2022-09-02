package com.example.aopsimpleapp.controllers;

import com.example.aopsimpleapp.models.Mark;
import com.example.aopsimpleapp.repositories.MarkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mark")
@RequiredArgsConstructor
public class MarkController {
    private final MarkRepository markRepository;

    @PostMapping("/save")
    public void save(@RequestBody Mark mark){
        markRepository.save(mark);
    }

    @DeleteMapping("/{id}/delete")
    public void delete(@PathVariable Long id){
        markRepository.deleteById(id);
    }

}
