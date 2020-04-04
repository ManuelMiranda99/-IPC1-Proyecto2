
package Listas;

import Clases.CServicios;
import Nodos.NodoServicios;



public class ListaServicios {
    
    private NodoServicios cabeza;
    public ListaServicios listaMU;

    public ListaServicios(){
        setCabeza(null);
    }
    
    public void OrdenarMU(){
        listaMU = new ListaServicios();
        NodoServicios aux = cabeza;
        while(aux != null){
            
            NodoServicios in = new NodoServicios(aux.servicios);
            
            if(listaMU.getCabeza() == null){
                listaMU.insertar(in.servicios);
            }else if(in.servicios.getUsos() > listaMU.getCabeza().servicios.getUsos()){
                NodoServicios auxi = listaMU.getCabeza();
                NodoServicios temp = listaMU.getCabeza().getSiguiente();
                listaMU.setCabeza(in);
                listaMU.getCabeza().setSiguiente(auxi);
                listaMU.getCabeza().getSiguiente().setSiguiente(temp);
            }else{
                NodoServicios auxi = listaMU.getCabeza();
                
                while(auxi != null){
                    if(auxi.getSiguiente() == null){
                        listaMU.insertar(in.servicios);
                        break;
                    }else{
                        if(in.servicios.getUsos() > auxi.getSiguiente().servicios.getUsos()){
                            NodoServicios temp = auxi.getSiguiente();
                            auxi.setSiguiente(in);
                            auxi.getSiguiente().setSiguiente(temp);
                            break;
                        }
                    }                        
                    auxi = auxi.getSiguiente();
                }
            }
            
            aux = aux.getSiguiente();
        }
    }
    
    public void insertar(CServicios servicios){
        NodoServicios nuevo = new NodoServicios(servicios);
        if(cabeza==null){
            cabeza = nuevo;
        }else{
            NodoServicios aux = cabeza;
            while(aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
    }
    
    public NodoServicios buscar(int id){
        if(cabeza != null){
            NodoServicios aux = cabeza;
            while(aux != null && aux.servicios.getId() != id){
                aux = aux.getSiguiente();
            }
            return aux;
        }
        return null;
    }
    
    public void eliminar(int id){
        NodoServicios nodo_eliminar = buscar(id);
        if(nodo_eliminar != null){
            NodoServicios aux = cabeza;
            while(aux.getSiguiente() != null && aux.getSiguiente() != nodo_eliminar){
                aux = aux.getSiguiente();
            }            
            if(aux.getSiguiente() != null){
                aux.setSiguiente(nodo_eliminar.getSiguiente());
            }
        }
    }
    
    public NodoServicios getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoServicios cabeza) {
        this.cabeza = cabeza;
    }
        
}
