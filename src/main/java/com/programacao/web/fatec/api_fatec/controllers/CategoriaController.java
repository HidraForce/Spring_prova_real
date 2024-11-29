package com.programacao.web.fatec.api_fatec.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.programacao.web.fatec.api_fatec.dto.CategoriaDto;
import com.programacao.web.fatec.api_fatec.entities.Categoria;
import com.programacao.web.fatec.api_fatec.service.CategoriaService;
import com.programacao.web.fatec.api_fatec.domain.CategotriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/V1/categoria")
public class CategoriaController {
    @Autowired
    private CategoriaService ctg_serv;

    @PostMapping
    public ResponseEntity<CategoriaDto> criar(@RequestBody CategoriaDto ctg_dto) {
        try {
            Categoria existingCategoria =   ctg_serv.buscardescircao(ctg_dto.getDescircao());

            if (existingCategoria != null) {
                
                return ResponseEntity.badRequest().body(null);
            }

            Categoria categoria = new Categoria(ctg_dto.getDescircao(), ctg_dto.getAtivo());


            Categoria savedCategoria = ctg_serv.salvar(categoria);


            CategoriaDto savedCategoriaDto = new CategoriaDto(savedCategoria.getId_categoria(),savedCategoria.getDescircao(),savedCategoria.getAtivo());

            return ResponseEntity.ok(savedCategoriaDto);

        } catch (Exception e) {

            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

}
