package com.cursospringboot.pjtfullstack.entities;

public class Resultados {
    private Integer soma;
    private Double media;

    public Resultados() {
       
    }
    public void setSoma(Integer soma) {
        this.soma = soma;
    }
    public void setMedia(Double media) {
        this.media = media;
    }
    public Integer getSoma() {
        return soma;
    }
    public Double getMedia() {
        return media;
    }

    

}
