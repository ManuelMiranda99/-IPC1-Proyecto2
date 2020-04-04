
package Nodos;

import Clases.CAutos;



public class NodoAutos {
    
    public CAutos auto;
    private NodoAutos siguiente;

    public NodoAutos(CAutos auto){
        this.auto = auto;
        setSiguiente(null);
        
    }
    
    public NodoAutos getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoAutos siguiente) {
        this.siguiente = siguiente;
    }
    
    //Métodso para obtener los datos de autos
    
}
