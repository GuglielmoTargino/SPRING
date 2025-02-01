package com.targino.cadastro.users;

public class Users {
    private String nome;
    private String sexo;
    
    public Users(String nome, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getNome() {
        return nome;
    }
    public String getSexo() {
        return sexo;
    }
    

}
