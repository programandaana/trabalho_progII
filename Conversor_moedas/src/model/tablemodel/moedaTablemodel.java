
package model.tablemodel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Moeda;


public class moedaTablemodel  extends AbstractTableModel {
    
    private List<Moeda> moedas;
    
    public List<Moeda> getList(){
        return moedas;
    }
    
    public moedaTablemodel(){
        moedas = new ArrayList<Moeda>();
    }
    public moedaTablemodel(List<Moeda> lista){
        this();
        moedas.addAll(lista);
    }
    @Override
    public int getRowCount(){
        return moedas.size();
    }
    @Override
    public int getColumnCount(){
        return 4;
    }
    @Override
    public String getColumnName (int column){
        switch(column){
            case 0: return "Data";
            case 1: return "Moeda";
            case 2: return "Compra";
            case 3: return "Venda";          
            default: return "SemNome";
        }
    }
    @Override
    public Object getValueAt(int rowIndex, int ColumnIndex){
        Moeda mo = moedas.get(rowIndex);
        switch(ColumnIndex){
            case 0: return mo.getData();
            case 1: return mo.getMoeda();
            case 2: return mo.getCompra();
            case 3: return mo.getVenda();           
            default: return "";
        }
    }
    
    public Moeda getMoeda(int row){
        if (row>=moedas.size()){
            return null;
        }
        return moedas.get(row);
    }
}
