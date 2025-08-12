package com.pgsql.crudpgsql.entity;

public class Usuario {
    private String nome_usu;
    private Long id;
    
    public Usuario(String nome_usu, Long id) {
        this.nome_usu = nome_usu;
        this.id = id;
    }
    public String getNome_usu() {
        return nome_usu;
    }
    public void setNome_usu(String nome_usu) {
        this.nome_usu = nome_usu;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    

}
