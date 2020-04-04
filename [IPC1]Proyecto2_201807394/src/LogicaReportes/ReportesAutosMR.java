
package LogicaReportes;

import javax.swing.JOptionPane;

public class ReportesAutosMR {
    
    public String ruta;
    public void generarHTML(String ruta){
        this.ruta = ruta + "\\AutosMR.html";
        JOptionPane.showMessageDialog(null, "No lo hice :'c", "Manu", JOptionPane.INFORMATION_MESSAGE);
    }    
}
