
package Nodos;

import Clases.CRepuestos;



public class NodoRepuestos {
    
    private NodoRepuestos siguiente;
    public CRepuestos repuesto;

    public NodoRepuestos(CRepuestos repuesto){
        setSiguiente(null);
        this.repuesto = repuesto;
    }
    
    public NodoRepuestos getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoRepuestos siguiente) {
        this.siguiente = siguiente;
    }
        
    
}
