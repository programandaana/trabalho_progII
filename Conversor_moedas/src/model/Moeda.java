package model;




import java.util.ArrayList;
import java.util.Date;

public class Moeda {
    
    String data;
    String moeda;
    float compra;
    float venda;

    public Moeda() {
    }

    public Moeda(String data, String moeda, float compra, float venda) {
        this.data = data;
        this.moeda = moeda;
        this.compra = compra;
        this.venda = venda;
    }
    

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getMoeda() {
        return moeda;
    }

    public void setMoeda(String moeda) {
        this.moeda = moeda;
    }

    public float getCompra() {
        return compra;
    }

    public void setCompra(float compra) {
        this.compra = compra;
    }

    public float getVenda() {
        return venda;
    }

    public void setVenda(float venda) {
        this.venda = venda;
    }    
}
