package model;


import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.List;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class GeradorGrafico {

    public void GerarGrafico(List <Moeda> lista) {
        
        DefaultCategoryDataset ds = new DefaultCategoryDataset();
        for (int i = 0; i < lista.size(); i++) {
            ds.addValue(lista.get(i).getCompra(), "dolar compra", lista.get(i).getData());
            ds.addValue(lista.get(i).getVenda(), "dolar venda", lista.get(i).getData());
            
        }

// cria o gráfico
        JFreeChart grafico = ChartFactory.createLineChart("Meu Grafico", "Dia",
                "Valor", ds, PlotOrientation.VERTICAL, true, true, false);
        try{
        OutputStream arquivo = new FileOutputStream("grafico.png");
        ChartUtilities.writeChartAsPNG(arquivo, grafico, 550, 400);
        arquivo.close();
        }catch (Exception ex){
            System.out.println(ex.getMessage());
            
        }
    }

}
