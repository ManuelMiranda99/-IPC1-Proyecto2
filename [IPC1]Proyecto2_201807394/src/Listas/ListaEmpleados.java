
package Listas;

import Clases.CEmpleados;
import Nodos.NodoEmpleados;

public class ListaEmpleados {
    private NodoEmpleados cabeza;

    public ListaEmpleados(){
        setCabeza(null);
    }
    
    public void insertar(CEmpleados empleado){
        NodoEmpleados nuevo = new NodoEmpleados(empleado);
        if(cabeza==null){
            cabeza = nuevo;
        }else{
            NodoEmpleados aux = cabeza;
            while(aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }
            
            nuevo.setAnterior(aux);
            aux.setSiguiente(nuevo);
        }
    }
    
    public NodoEmpleados buscar(int id){
        if(cabeza != null){
            NodoEmpleados aux = cabeza;
            while(aux != null && aux.empleado.getId() != id){
                aux = aux.getSiguiente();
            }
            return aux;
        }
        return null;
    }
    
    public void eliminar(int id){
        NodoEmpleados nodo_eliminar = buscar(id);
        if(nodo_eliminar != null){
            NodoEmpleados aux = cabeza;
            while(aux.getSiguiente() != null && aux.getSiguiente() != nodo_eliminar){
                aux = aux.getSiguiente();
            }
            if(aux.getSiguiente() != null){
                aux.setSiguiente(nodo_eliminar.getSiguiente());
                if(nodo_eliminar.getSiguiente() != null){
                    nodo_eliminar.getSiguiente().setAnterior(aux);
                }
            }
        }
    }
    
    /*
    Los métodos para mostrar deben de ir en los mismos JFrames para poder
    insertar los datos en las tablas
    public void Mostrar(){
        NodoEmpleados aux = cabeza;
        while(aux != null){
            //Método para mostrar Datos de los nodos.
            aux = aux.getSiguiente();
        }
    }
    
    */
    
    public NodoEmpleados getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoEmpleados cabeza) {
        this.cabeza = cabeza;
    }
    
}
