package com.sqlser.crudsqlser.entity;

public class Usuario {
    private String nome_usu;
    private String cargo;
    private Long senha;
    public Usuario(String nome_usu, String cargo, Long senha) {
        this.nome_usu = nome_usu;
        this.cargo = cargo;
        this.senha = senha;
    }
    public String getNome_usu() {
        return nome_usu;
    }
    public void setNome_usu(String nome_usu) {
        this.nome_usu = nome_usu;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public Long getSenha() {
        return senha;
    }
    public void setSenha(Long senha) {
        this.senha = senha;
    }
    
    

    

}
