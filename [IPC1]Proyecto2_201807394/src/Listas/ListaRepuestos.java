

package Listas;

import Clases.CRepuestos;
import Nodos.NodoRepuestos;

public class ListaRepuestos {
    
    private NodoRepuestos cabeza;
    public int t=0;
    public ListaRepuestos listaMC, listaMU;
    
    public ListaRepuestos(){
        setCabeza(null);
    }
    
    public void OrdenarMU(){
        listaMU = new ListaRepuestos();
        NodoRepuestos aux = cabeza;
        while(aux != null){
            
            NodoRepuestos in = new NodoRepuestos(aux.repuesto);
            
            if(listaMU.getCabeza() == null){
                listaMU.insertar(in.repuesto);
            }else if(in.repuesto.getUsos()> listaMU.getCabeza().repuesto.getUsos()){
                NodoRepuestos auxi = listaMU.getCabeza();
                NodoRepuestos temp = listaMU.getCabeza().getSiguiente();
                listaMU.setCabeza(in);
                listaMU.getCabeza().setSiguiente(auxi);
                listaMU.getCabeza().getSiguiente().setSiguiente(temp);
            }else{
                NodoRepuestos auxi = listaMU.getCabeza();
                
                while(auxi != null){
                    if(auxi.getSiguiente() == null){
                        listaMU.insertar(in.repuesto);
                        break;
                    }else{
                        if(in.repuesto.getUsos() > auxi.getSiguiente().repuesto.getUsos()){
                            NodoRepuestos temp = auxi.getSiguiente();
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
    
    public void OrdenarMC(){
        listaMC = new ListaRepuestos();
        NodoRepuestos aux = cabeza;
        while(aux != null){
            
            NodoRepuestos in = new NodoRepuestos(aux.repuesto);
            
            if(listaMC.getCabeza() == null){
                listaMC.insertar(in.repuesto);
            }else if(in.repuesto.getPrecio() > listaMC.getCabeza().repuesto.getPrecio()){
                NodoRepuestos auxi = listaMC.getCabeza();
                NodoRepuestos temp = listaMC.getCabeza().getSiguiente();
                listaMC.setCabeza(in);
                listaMC.getCabeza().setSiguiente(auxi);
                listaMC.getCabeza().getSiguiente().setSiguiente(temp);
            }else{
                NodoRepuestos auxi = listaMC.getCabeza();
                
                while(auxi != null){
                    if(auxi.getSiguiente() == null){
                        listaMC.insertar(in.repuesto);
                        break;
                    }else{
                        if(in.repuesto.getPrecio() > auxi.getSiguiente().repuesto.getPrecio()){
                            NodoRepuestos temp = auxi.getSiguiente();
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
    
    public void insertar(CRepuestos repuestos){
        NodoRepuestos nuevo = new NodoRepuestos(repuestos);
        if(cabeza==null){
            cabeza = nuevo;            
            t += 1;
        }else{
            NodoRepuestos aux = cabeza;
            while(aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
            t += 1;
        }
    }
    
    public NodoRepuestos buscar(int id){
        if(cabeza != null){
            NodoRepuestos aux = cabeza;
            while(aux != null && aux.repuesto.getId() != id){
                aux = aux.getSiguiente();
            }
            return aux;
        }
        return null;
    }
    
    public void eliminar(int id){
        NodoRepuestos nodo_eliminar = buscar(id);
        if(nodo_eliminar != null){
            NodoRepuestos aux = cabeza;
            while(aux.getSiguiente() != null && aux.getSiguiente() != nodo_eliminar){
                aux = aux.getSiguiente();
            }            
            if(aux.getSiguiente() != null){
                aux.setSiguiente(nodo_eliminar.getSiguiente());
            }
            t -= 1;
        }
    }
    
    public void Vaciar(){
        setCabeza(null);
        t=0;
    }

    public NodoRepuestos getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoRepuestos cabeza) {
        this.cabeza = cabeza;
    }
    
}
