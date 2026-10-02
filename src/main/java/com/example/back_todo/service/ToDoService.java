package com.example.back_todo.service;

import com.example.back_todo.entidade.ToDoEntity;
import com.example.back_todo.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoService {
/*
    @Autowired
    private ToDoRepository repo;
*/

    private final ToDoRepository repo;

    public ToDoService(ToDoRepository repo) {
        this.repo = repo;
    }

    public List<ToDoEntity> listar() {
        return repo.findAll();
    }
}
