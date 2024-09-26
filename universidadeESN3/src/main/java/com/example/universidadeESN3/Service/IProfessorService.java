package com.example.universidadeESN3.Service;

import com.example.universidadeESN3.Entity.Professor;

import java.util.List;

public interface IProfessorService {

    Professor buscarPorId(Long id);

    List<Professor> buscarTodos();

    Professor salvar(Professor professor);

    void atualizar(Professor professor);

    void excluir(Long id);
}
