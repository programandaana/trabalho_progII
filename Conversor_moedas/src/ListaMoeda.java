

import model.Moeda;
import java.util.ArrayList;
/**
 * @author evandmeyer
 */
public class ListaMoeda {
    
    private ArrayList<Moeda> listaMoeda = new ArrayList<>();

    public ArrayList<Moeda> getListaMoeda() {
        return listaMoeda;
    }
   
   public void adicionaMoeda (Moeda moeda){
       listaMoeda.add(moeda);
   }
}
