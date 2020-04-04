
package ipc1.proyecto2_201807394;

import Clases.*;
import Interfaces.Login;
import Listas.*;



public class IPC1Proyecto2_201807394 {

    //Declaración de Variables publicas locales. Listas y contadores
    public static ListaEmpleados listaEmpleados = new ListaEmpleados();
    public static ListaRepuestos listaRepuestos = new ListaRepuestos();
    public static ListaServicios listaServicios = new ListaServicios();
    public static ListaClientes listaClientes = new ListaClientes();
    public static ListaOrdenDeTrabajo listaOrdenes = new ListaOrdenDeTrabajo();
    public static int empleados=0, repuestos=0, servicios=0, orden=0;
    
    public static void main(String[] args) {
        listaEmpleados.insertar(new CEmpleados(empleados, "Admin", "Administrador", "admin", "123"));
        empleados += 1;
        listaServicios.insertar(new CServicios(servicios, 0, "Diagnostico", "cualquiera", "cualquiera", null));
        servicios += 1;
        listaClientes.insertar(new CClientes("1", "Manuel", "Manu", "123"));
        Login inicio = new Login();
        inicio.setVisible(true);
    }
    
}
