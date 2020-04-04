
package LogicaReportes;

import Nodos.NodoRepuestos;
import static ipc1.proyecto2_201807394.IPC1Proyecto2_201807394.listaRepuestos;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class ReportesRepuestosMC {
    
    FileOutputStream archivo;
    PrintStream p;
    String txt, labels="", data="", colores;
    public String ruta;
    public void generarHTML(String ruta){        
        this.ruta = ruta + "\\RepuestosMC.html";
        try {
            archivo = new FileOutputStream(this.ruta);
            p = new PrintStream(archivo);
            txt = "<!DOCTYPE html><html><head><meta charset=\"UTF-8\">"
                    + "<style>table, th, td {  "
                    + "text-align: center;"
                    + " border: 1px solid black;"
                    + "  border-collapse: collapse;"
                    + "}</style>"
                    + "<title>Reporte Repuestos mas Caros</title></head><body>";
            
            txt = txt + "<center><h1>Lista de los 10 repuestos más Caros</h1><br>"
                    + "</center><center><table style='width: 100%'>"
                    + "<thead><tr><td><strong>ID</strong></td>"
                    + "<td><strong>Nombre</strong></td>"
                    + "<td><strong>Marca</strong></td>"
                    + "<td><strong>Modelo</strong></td>"
                    + "<td><strong>Existencias</strong></td>"
                    + "<td><strong>Precio</strong></td></tr></thead>"
                    + "<tbody>";
            
            NodoRepuestos aux = listaRepuestos.listaMC.getCabeza();
            for(int i=0;i<10;i++){
                if(aux == null){
                    break;
                }else{
                    txt = txt + "<tr><td>" + aux.repuesto.getId() + "</td>"
                            + "<td>" + aux.repuesto.getNombre() + "</td>"
                            + "<td>" + aux.repuesto.getMarca() + "</td>"
                            + "<td>" + aux.repuesto.getModelo() + "</td>"
                            + "<td>" + aux.repuesto.getExistencias() + "</td>"
                            + "<td>" + aux.repuesto.getPrecio() + "</td></tr>";
                }
                aux = aux.getSiguiente();
            }
            
            txt = txt + "</tbody></table></center><br><br><br>";
            
            //JavaScript
            
            aux = listaRepuestos.listaMC.getCabeza();
            for(int i=0;i<10;i++){
                if(aux == null){
                    switch(i){
                        case 0:
                            colores = "'#51574a'";
                            break;
                        case 1:
                            colores = "'#51574a', '#447c69'";
                            break;
                        case 2:
                            colores = "'#51574a', '#447c69', '#74c493'";
                            break;
                        case 3:
                            colores = "'#51574a', '#447c69', '#74c493', '#8e8c6d'";
                            break;
                        case 4:
                            colores = "'#51574a', '#447c69', '#74c493', '#8e8c6d', '#e4bf80'";
                            break;
                        case 5:
                            colores = "'#51574a', '#447c69', '#74c493', '#8e8c6d', '#e4bf80', '#e9d78e'";
                            break;
                        case 6:
                            colores = "'#51574a', '#447c69', '#74c493', '#8e8c6d', '#e4bf80', '#e9d78e', '#e2975d'";
                            break;
                        case 7:
                            colores = "'#51574a', '#447c69', '#74c493', '#8e8c6d', '#e4bf80', '#e9d78e', '#e2975d', '#f19670'";
                            break;
                        case 8:
                            colores = "'#51574a', '#447c69', '#74c493', '#8e8c6d', '#e4bf80', '#e9d78e', '#e2975d', '#f19670', '#e16552'";
                            break;
                        case 9:
                            colores = "'#51574a', '#447c69', '#74c493', '#8e8c6d', '#e4bf80', '#e9d78e', '#e2975d', '#f19670', '#e16552', '#c94a53'";
                            break;
                    }                        
                    break;
                }else{
                    if(aux.getSiguiente() == null){
                        labels = labels + "'" + aux.repuesto.getNombre() + "'";
                        
                        data = data + String.valueOf(aux.repuesto.getPrecio());
                    }else{
                        labels = labels + "'" + aux.repuesto.getNombre() + "', ";
                    
                        data = data + String.valueOf(aux.repuesto.getPrecio()) + ", ";
                    }                                                                                
                }
                aux = aux.getSiguiente();
            }
            
            txt = txt + "<canvas id=\"bar-chart-horizontal\" width='800' height='450'></canvas>"
                    + "<script src = 'https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.5.0/Chart.min.js'></script>	"
                    + "<script>	new Chart(document.getElementById(\"bar-chart-horizontal\"), {    "
                    + "     type: 'bar',"
                    + "     data: {      "
                    + "         labels: [" + labels + "],      "
                    + "         datasets: [        "
                    + "         {          "
                    + "             label: \"Precio\",        "
                    + "             backgroundColor: [" + colores + "],          "
                    + "             data: [" + data + "]        "
                    + "         }      "
                    + "         ]    "
                    + "     },    "
                    + "     options: {      "
                    + "         legend: { display: false }, "
                    + "         title: {        "
                    + "             display: true,        "
                    + "             text: 'Precio de Repuestos'      }}});</script>";
            
            txt = txt+ "</body></html>";
            p.println(txt);
            p.close();
            
        } catch (Exception e) {
            System.out.println("Error");
        }
    }    
}
