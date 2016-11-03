
import java.io.FileOutputStream;
import java.io.OutputStream;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;


public class GeradorGrafico {
    DefaultCategoryDataset ds = new DefaultCategoryDataset();
    for 
    JFreeChart grafico = ChartFactory.createLineChart("Variação do Dólar Americano", "Dia", 
    "Valor", ds, PlotOrientation.VERTICAL, true, true, false);
    OutputStream arquivo = new FileOutputStream("grafico.png");
    ChartUtilities.writeChartAsPNG(arquivo, grafico, 550, 400);
    fos.close();
   }
