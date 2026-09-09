package com.example.back_todo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.back_todo.service.ToDoService;
import com.example.back_todo.entidade.ToDoEntity;

@RestController 
@RequestMapping("/")
// Aqui configuramos o acesso ao Front-end
public class ToDoController {
    private final ToDoService service;

    public ToDoController(ToDoService service) {
        this.service = service;
    }

    @GetMapping
    public List<ToDoEntity> listarTudo() {
        return service.listar();
    }
}
