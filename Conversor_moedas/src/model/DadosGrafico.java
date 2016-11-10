/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class DadosGrafico {
    protected ArrayList array = new ArrayList();

 

    public DadosGrafico() {

        array.add(new Grafico("JANEIRO", 20));

        array.add(new Grafico("FEVEREIRO", 20));

    }

    public ArrayList getArray() {

        return array;

    }

 

 

    public void setArray(ArrayList array) {

        this.array = array;

    }

}
    
