package com.cursospringboot.pjtfullstack.entities;

import java.util.List;

public class Entrada {
    private List<Integer> lista;

    public Entrada(List<Integer> lista) {
        this.lista = lista;
    }

    public void setLista(List<Integer> lista) {
        this.lista = lista;
    }

    public List<Integer> getLista() {
        return lista;
    }

    

}
