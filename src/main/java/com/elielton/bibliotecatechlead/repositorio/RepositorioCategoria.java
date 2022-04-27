package com.elielton.bibliotecatechlead.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.elielton.bibliotecatechlead.dominio.Categoria;

@Repository
public interface RepositorioCategoria extends JpaRepository<Categoria, Integer>{

}
