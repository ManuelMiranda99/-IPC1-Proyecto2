
package LogicaReportes;

import Nodos.NodoRepuestos;
import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.DefaultFontMapper;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfTemplate;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.io.FileOutputStream;
import org.jfree.chart.JFreeChart;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import static ipc1.proyecto2_201807394.IPC1Proyecto2_201807394.listaRepuestos;

public class ReporteRepuestosMU {
    
    public String ruta;
        
    
    public void generarPDF(JFreeChart chart, String ruta){
        this.ruta = ruta + "\\RepuestosMU.pdf";
        try {
            FileOutputStream archivo = new FileOutputStream(this.ruta);
            Document doc = new Document();
            PdfWriter writer = PdfWriter.getInstance(doc, archivo);
            doc.open();

            //Agregar tabla
            
            PdfPTable tabla = new PdfPTable(new float[]{10, 20, 20, 20, 20, 20});
            
            tabla.deleteBodyRows();
            tabla.addCell("ID");
            tabla.addCell("Nombre");
            tabla.addCell("Marca");
            tabla.addCell("Modelo");
            tabla.addCell("Precio");
            tabla.addCell("Usos");
            
            NodoRepuestos aux = listaRepuestos.listaMU.getCabeza();
            for(int i=0;i<10;i++){
                if(aux == null){
                    break;
                }else{
                    tabla.addCell(String.valueOf(aux.repuesto.getId()));
                    tabla.addCell(aux.repuesto.getNombre());
                    tabla.addCell(aux.repuesto.getMarca());
                    tabla.addCell(aux.repuesto.getModelo());
                    tabla.addCell(String.valueOf(aux.repuesto.getPrecio()));
                    tabla.addCell(String.valueOf(aux.repuesto.getUsos()));
                    aux = aux.getSiguiente();
                }                    
            }
            
            doc.add(tabla);
            
            doc.add(new Paragraph("\n \n \n \n "));
            
            PdfContentByte contentByte = writer.getDirectContent();
            PdfTemplate template = contentByte.createTemplate(500, 500);
            Graphics2D gra = template.createGraphics(500, 500, new DefaultFontMapper());
            
            Rectangle2D rec = new Rectangle2D.Double(0, 0, 500, 500);
            
            chart.draw(gra, rec);
            
            gra.dispose();
            contentByte.addTemplate(template, 0, 0);
            
            
            doc.close();
            
        } catch (Exception e) {
        }                   
        
    }
    
}
