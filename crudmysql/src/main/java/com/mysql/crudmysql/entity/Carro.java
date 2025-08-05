package com.mysql.crudmysql.entity;


public class Carro {

    private Long id;
    private Long ano;
    private String marca;
    private String modelo;
    private String nome;
    


    public Carro(Long id, Long ano, String marca, String modelo, String nome) {
        this.id = id;
        this.ano = ano;
        this.marca = marca;
        this.modelo = modelo;
        this.nome = nome;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public Long getAno() {
        return ano;
    }
    public String getModelo() {
        return modelo;
    }




}
