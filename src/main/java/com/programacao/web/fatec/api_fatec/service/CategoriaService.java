package com.programacao.web.fatec.api_fatec.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.programacao.web.fatec.api_fatec.domain.CategotriaRepository;
import com.programacao.web.fatec.api_fatec.entities.Categoria;


@Service
public class CategoriaService {
    @Autowired
    private CategotriaRepository cat_repo;

    public Categoria salvar(Categoria ctg){
        return cat_repo.save(ctg);
    }

    public Categoria buscardescircao(String descircao) {
        return cat_repo.findBydescircao(descircao); 
    }

}
