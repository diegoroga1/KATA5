package kata5v2;

import java.awt.Dimension;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

/**
 *
 * @author PabloAlonso
 */
public class HistogramDisplay extends ApplicationFrame{
    
    public final Histogram<String> histo;
    
    public HistogramDisplay(Histogram <String> histo){
        super("Histograma");
        this.histo = histo;
        setContentPane(createPanel());
        pack();
    }
    
    private ChartPanel createPanel(){
        ChartPanel chartpanel = new ChartPanel(createChart(createDataset()));
        chartpanel.setPreferredSize(new Dimension(500,450));
        return chartpanel;
    }
    private JFreeChart createChart (DefaultCategoryDataset dataset){
        JFreeChart chart = ChartFactory.createBarChart(null, "Dominios", "N emails", dataset, PlotOrientation.VERTICAL, false, false, false);
        return chart;
    }
    
    private DefaultCategoryDataset createDataset(){
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        for(String key: histo.keySet()){
            dataset.addValue(histo.get(key), "", key);
        }
        return dataset;        
    }
    
    public void execute(){
        setVisible(true);
    }
}
