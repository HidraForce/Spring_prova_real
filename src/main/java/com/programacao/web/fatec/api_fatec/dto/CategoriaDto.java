package com.programacao.web.fatec.api_fatec.dto;

public class CategoriaDto {
    private int id;
    private String descircao;
    private Boolean ativo;

    // No-args constructor for Jackson deserialization
    public CategoriaDto() {
    }

    // Constructor with parameters
    public CategoriaDto(String descircao, Boolean ativo) {
        this.descircao = descircao;
        this.ativo = ativo;
    }

    // Constructor with ID
    public CategoriaDto(int id, String descircao, Boolean ativo) {
        this.id = id;
        this.descircao = descircao;
        this.ativo = ativo;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
