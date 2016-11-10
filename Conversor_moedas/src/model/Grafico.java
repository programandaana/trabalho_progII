package model;

import java.io.Serializable;


public class Grafico implements Serializable{
    private String data;
    private float valor;

    public Grafico(String data, float valor) {
        this.data = data;
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    
    
}
