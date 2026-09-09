package com.example.back_todo.repository;

import com.example.back_todo.entidade.ToDoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoRepository extends JpaRepository<ToDoEntity, Long> {

}
