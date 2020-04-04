
package Listas;

import Clases.CClientes;
import Nodos.NodoClientes;



public class ListaClientes {
    
    private NodoClientes cabeza;

    public ListaClientes(){
        setCabeza(null);
    }
    
    public void insertar(CClientes cliente){
        NodoClientes nuevo = new NodoClientes(cliente);
        if(cabeza == null){
            cabeza = nuevo;
            cabeza.setSiguiente(cabeza);
            cabeza.setAnterior(cabeza);
        }else{
            NodoClientes aux = cabeza;
            while(aux.getSiguiente() != cabeza){
                aux = aux.getSiguiente();
            }
            nuevo.setAnterior(aux);
            aux.setSiguiente(nuevo);
            nuevo.setSiguiente(cabeza);
            cabeza.setAnterior(nuevo);
        }
    }
    
    public NodoClientes buscar(int id){
        if(cabeza != null){
            NodoClientes aux = cabeza;            
            do{
                aux = aux.getSiguiente();
            }while(aux != cabeza && aux.cliente.getIdI() != id);
            return aux;
        }
        return null;
    }
    
    public void eliminar(int id){
        NodoClientes nodo_eliminar = buscar(id);
        if(nodo_eliminar != null){
            NodoClientes aux = cabeza;
            while(aux.getSiguiente() != cabeza && aux.getSiguiente() != nodo_eliminar){
                aux = aux.getSiguiente();
            }
            if(aux.getSiguiente() != cabeza){
                aux.setSiguiente(nodo_eliminar.getSiguiente());
                if(nodo_eliminar.getSiguiente() != cabeza){
                    nodo_eliminar.getSiguiente().setAnterior(aux);
                }
            }
        }
    }
    
    public NodoClientes getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoClientes cabeza) {
        this.cabeza = cabeza;
    }    
    
}
