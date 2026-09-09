package com.example.back_todo.entidade;

import jakarta.persistence.*;

@Entity // Identifico para o Spring que esta classe é uma entidade
public class ToDoEntity {

    //Indicar a chave primária e o auto-incremento
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //Configurações da coluna
    //@Column(name = "descricao", nullable = false, unique = true)
    private String nome;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
