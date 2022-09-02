package com.example.aopsimpleapp.repositories;

import com.example.aopsimpleapp.models.Mark;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarkRepository extends JpaRepository<Mark,Long> {
}
