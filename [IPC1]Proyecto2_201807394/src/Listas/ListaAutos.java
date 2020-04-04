
package Listas;

import Clases.CAutos;
import Nodos.NodoAutos;



public class ListaAutos {
    
    private NodoAutos cabeza;

    public ListaAutos(){
        setCabeza(null);
    }
    
    public void insertar(CAutos auto){
        NodoAutos nuevo = new NodoAutos(auto);
        if(cabeza==null){
            cabeza = nuevo;
            cabeza.setSiguiente(cabeza);
        }else{
            NodoAutos aux = cabeza;
            while(aux.getSiguiente() != cabeza){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
            nuevo.setSiguiente(cabeza);
        }
    }
    
    public NodoAutos buscar(String placa){
        if(cabeza != null){
            NodoAutos aux = cabeza;
            do{
                aux = aux.getSiguiente();
            }while(aux != cabeza && !aux.auto.getPlaca().equals(placa));
            return aux;
        }
        return null;
    }
    
    public void eliminar(String placa){
        NodoAutos nodo_eliminar = buscar(placa);
        if(nodo_eliminar != null){
            NodoAutos aux = cabeza;
            while(aux.getSiguiente() != cabeza && aux.getSiguiente() != nodo_eliminar){
                aux = aux.getSiguiente();
            }
            if(aux.getSiguiente() != cabeza){
                aux.setSiguiente(nodo_eliminar.getSiguiente());                
            }
        }
    }
    
    public NodoAutos getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoAutos cabeza) {
        this.cabeza = cabeza;
    }
    
    
}
