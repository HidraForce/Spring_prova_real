package com.programacao.web.fatec.api_fatec.domain;

import com.programacao.web.fatec.api_fatec.entities.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategotriaRepository extends JpaRepository<Categoria, Integer> {

    Categoria findBydescircao(String descircao);
}