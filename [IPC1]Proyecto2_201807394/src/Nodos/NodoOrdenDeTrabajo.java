
package Nodos;

import Clases.COrdenDeTrabajo;



public class NodoOrdenDeTrabajo {
    
    private NodoOrdenDeTrabajo siguiente;
    public COrdenDeTrabajo orden;

    public NodoOrdenDeTrabajo(COrdenDeTrabajo orden){
        this.orden = orden;
        setSiguiente(null);
    }
    
    public NodoOrdenDeTrabajo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoOrdenDeTrabajo siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
