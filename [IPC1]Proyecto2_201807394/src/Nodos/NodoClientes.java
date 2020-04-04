
package Nodos;

import Clases.CClientes;

public class NodoClientes {
    
    private NodoClientes anterior, siguiente;
    public CClientes cliente;
    
    public NodoClientes(CClientes cliente){
        this.cliente = cliente;
        setSiguiente(null);
        setAnterior(null);
    }

    public NodoClientes getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoClientes anterior) {
        this.anterior = anterior;
    }

    public NodoClientes getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoClientes siguiente) {
        this.siguiente = siguiente;
    }
    
}
