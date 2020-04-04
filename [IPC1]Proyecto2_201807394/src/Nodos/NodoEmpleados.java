
package Nodos;

import Clases.CEmpleados;



public class NodoEmpleados {
    
    private NodoEmpleados siguiente, anterior;
    public CEmpleados empleado;
    
    public NodoEmpleados(CEmpleados empleado){
        this.empleado = empleado;   
        setSiguiente(null);
        setAnterior(null);
    }

    public NodoEmpleados getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoEmpleados siguiente) {
        this.siguiente = siguiente;
    }

    public NodoEmpleados getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoEmpleados anterior) {
        this.anterior = anterior;
    }
    
    //Métodos para obtener la información de los empleados    
    
}
