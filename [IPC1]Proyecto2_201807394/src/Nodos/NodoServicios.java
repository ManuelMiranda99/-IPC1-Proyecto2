
package Nodos;

import Clases.CServicios;



public class NodoServicios {
    
    private NodoServicios siguiente;
    public CServicios servicios;

    public NodoServicios(CServicios servicios){
        setSiguiente(null);
        this.servicios  = servicios;
    }
    
    public NodoServicios getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoServicios siguiente) {
        this.siguiente = siguiente;
    }    
    
}
