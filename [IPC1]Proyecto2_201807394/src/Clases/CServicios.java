
package Clases;

import Listas.ListaRepuestos;
import Nodos.NodoRepuestos;


public class CServicios {
    
    int id, precioManoDeObra, precioTotal, usos;
    String nombre, marca, modelo;
    //Lista de Repuestos para el servicio dado. Agregar la lista en el constructor
    public ListaRepuestos lista;
    public CServicios(int id, int precioManoDeObra, String nombre, String marca, String modelo, ListaRepuestos lista){
        this.id = id;
        this.precioManoDeObra = precioManoDeObra;
        this.precioTotal = 0;
        
        if(lista!= null){
            NodoRepuestos aux = lista.getCabeza();
            while(aux!=null){
                this.precioTotal += aux.repuesto.getPrecio();
                aux = aux.getSiguiente();
            }
        }
        
        this.usos = 0;
        this.nombre = nombre;
        this.marca = marca;
        this.modelo = modelo;
        this.lista = lista;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrecioManoDeObra() {
        return precioManoDeObra;
    }

    public void setPrecioManoDeObra(int precioManoDeObra) {
        this.precioManoDeObra = precioManoDeObra;
    }

    public int getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(int precioTotal) {
        this.precioTotal = precioTotal;
    }

    public int getUsos() {
        return usos;
    }

    public void setUsos() {
        usos += 1;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
}
