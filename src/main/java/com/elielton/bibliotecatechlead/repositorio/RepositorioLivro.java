package com.elielton.bibliotecatechlead.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.elielton.bibliotecatechlead.dominio.Livro;

@Repository
public interface RepositorioLivro extends JpaRepository<Livro, Integer>{

}
