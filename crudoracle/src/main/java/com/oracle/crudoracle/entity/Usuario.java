package com.oracle.crudoracle.entity;

public class Usuario {
    private String nome_usu;
    private Long senha;
    private String cargo;
    
    public Usuario(String nome_usu, Long senha, String cargo) {
        this.nome_usu = nome_usu;
        this.senha = senha;
        this.cargo = cargo;
    }
    public String getNome_usu() {
        return nome_usu;
    }
    public void setNome_usu(String nome_usu) {
        this.nome_usu = nome_usu;
    }
    public Long getSenha() {
        return senha;
    }
    public void setSenha(Long senha) {
        this.senha = senha;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }



    

    

}
