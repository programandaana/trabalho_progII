/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author visitante
 */
public class Lista {
   public List<Moeda> importaCSV(String nomearquivo) throws IOException, ParseException, Exception{
        
        File csv = new File(nomearquivo);
        List<Moeda> a=new ArrayList<Moeda>();      
            
            String lin = new String();
            Scanner leitor = new Scanner(csv);
            
            while (leitor.hasNext()) {
               lin = leitor.nextLine();
               
                String[] campo = lin.split(";");
                String data =campo[0];
                String moeda =(campo[3]);
                String compra=(campo[4].replace(",", "."));
                String venda= (campo[5].replace(",", "."));  
                SimpleDateFormat formatter =  new SimpleDateFormat("ddMMyyyy");
                Date date = formatter.parse(data);
                                
                a.add(new Moeda(formataData(date), moeda, Float.parseFloat(compra), Float.parseFloat(venda)));
            }        
        return a;
    }

    public static String formataData(Date data) throws Exception { 
		if (data == null || data.equals(""))
			return null;
        Date date = data;
        DateFormat dia;
            dia = DateFormat.getDateInstance(DateFormat.LONG);
            String a = dia.format(data);
        return a;
    }
}

