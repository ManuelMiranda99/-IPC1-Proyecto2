
package LogicaReportes;

import Nodos.NodoClientes;
import static ipc1.proyecto2_201807394.IPC1Proyecto2_201807394.listaClientes;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class ReporteClientes {
    
    int oro, normal, total;
    FileOutputStream archivo;
    PrintStream p;
    String txt;
    public String ruta;
    public void generarHTML(String ruta){
        this.ruta = ruta + "\\Clientes.html";
        try {
            archivo = new FileOutputStream(this.ruta);
            p = new PrintStream(archivo);
            txt = "<!DOCTYPE html><html><head>"
                    + "<style>table, th, td {  "
                    + "text-align: center;"
                    + " border: 1px solid black;"
                    + "  border-collapse: collapse;"
                    + "}</style>"
                    + "<title>ReporteClientes</title></head><body>";
            
            txt = txt + "<center><h1>Lista de Clientes</h1><br>"
                    + "</center><center><table style='width:100%'>"
                    + "<thead><tr><td><strong>ID</strong></td>"
                    + "<td><strong>Nombre</strong></td>"
                    + "<td><strong>Usuario</strong></td>"
                    + "<td><strong>Contraseña</strong></td>"
                    + "<td><strong>Tipo de Cliente</strong></td></tr></thead>"
                    + "<tbody>";
            
            //Llenado de la tabla
            NodoClientes aux = listaClientes.getCabeza();
            do{
                String tipo = aux.cliente.getTipo();
                if(tipo.equals("normal")){
                    tipo = "Normal";
                    normal += 1;
                }else if(tipo.equals("oro")){
                    tipo = "Oro";
                    oro += 1;
                }
                txt = txt + "<tr><td>" + aux.cliente.getId() + "</td><td>" + aux.cliente.getNombre() + "</td>"
                        + "<td>" + aux.cliente.getUser() + "</td>"
                        + "<td>" + aux.cliente.getPass() + "</td><td>" + tipo + "</td></tr>";
                aux = aux.getSiguiente();                
            }while(aux != listaClientes.getCabeza());            
            total = normal + oro;
            txt = txt + "</tbody></table></center><br><br><br>";
            
            txt = txt + "<canvas class='line-chart' width='800' height='450'></canvas>"
                    + "<script src = 'https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.5.0/Chart.min.js'></script>"
                    + "<script>"
                    + "var ctx = document.getElementsByClassName('line-chart');"
                    + "var chartGraph = new Chart(ctx, {"
                    + "	type: 'pie',"
                    + "	data: {			"
                    + "     labels: ['Oro', 'Normal'],"
                    + "     datasets: [{		"
                    + " 	label: 'Cantidad',"
                    + "		backgroundColor: [\"#FFFF00\", \"#0080FF\"],"
                    + "		data: [" + oro + ", " + normal + "],		"
                    + "     }],			"
                    + "}});</script>";
            
            txt = txt + "</body></html>";
            p.println(txt);
            p.close();
        } catch (Exception e) {
            System.out.println("Error");
        }        
    }    
    
}
