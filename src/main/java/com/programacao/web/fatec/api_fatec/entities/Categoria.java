package com.programacao.web.fatec.api_fatec.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "categoria")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(nullable = false, length = 255)
    private String descircao;
    
    @Column(nullable = false)
    private Boolean ativo = true;

    public Categoria(){

    }
    public Categoria(String descircao, Boolean ativo) {
        this.descircao = descircao;
        if (ativo != null) {
            this.ativo = ativo;
        }
    }

    public int getId_categoria() {
        return id;
    }

    public void setId_categoria(int id_categoria) {
        this.id = id_categoria;
    }

    public String getDescircao() {
        return descircao;
    }

    public void setDescircao(String descircao) {
        this.descircao = descircao;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    
}
