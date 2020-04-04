
package Listas;

import Clases.COrdenDeTrabajo;
import Nodos.NodoOrdenDeTrabajo;



public class ListaOrdenDeTrabajo {
    
    private NodoOrdenDeTrabajo cabeza;

    public ListaOrdenDeTrabajo(){
        setCabeza(null);
    }
    
    public void insertar(COrdenDeTrabajo orden){
        NodoOrdenDeTrabajo nuevo = new NodoOrdenDeTrabajo(orden);
        if(cabeza==null){
            cabeza = nuevo;
        }else{
            NodoOrdenDeTrabajo aux = cabeza;
            while(aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
    }
    
    public NodoOrdenDeTrabajo buscar(int id){
        if(cabeza != null){
            NodoOrdenDeTrabajo aux = cabeza;
            while(aux != null && aux.orden.getId() != id){
                aux = aux.getSiguiente();
            }
            return aux;
        }
        return null;
    }
    
    public void eliminar(int id){
        NodoOrdenDeTrabajo nodo_eliminar = buscar(id);
        if(nodo_eliminar != null){
            NodoOrdenDeTrabajo aux = cabeza;
            while(aux.getSiguiente() != null && aux.getSiguiente() != nodo_eliminar){
                aux = aux.getSiguiente();
            }            
            if(aux.getSiguiente() != null){
                aux.setSiguiente(nodo_eliminar.getSiguiente());
            }
        }
    }
    
    public NodoOrdenDeTrabajo getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoOrdenDeTrabajo cabeza) {
        this.cabeza = cabeza;
    }
    
    
}
