

import java.util.ArrayList;
/**
 * @author evandmeyer
 */
public class ListaMoeda {
    
    private ArrayList<Moeda> listaMoeda = new ArrayList<>();

    public ArrayList<Moeda> getListaMoeda() {
        return listaMoeda;
    }
   
   public void adicionaPessoa (Moeda moeda){
       listaMoeda.add(moeda);
   }
}
