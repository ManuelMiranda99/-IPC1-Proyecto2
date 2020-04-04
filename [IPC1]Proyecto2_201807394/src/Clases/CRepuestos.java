
package Clases;

import javax.swing.JOptionPane;

public class CRepuestos {
    
    int id, existencias, precio, usos;
    String nombre, marca, modelo;
    public CRepuestos(int id, int existencias, int precio, 
            String nombre, String marca, String modelo){
        this.id = id;
        this.existencias = existencias;
        this.precio = precio;
        this.usos = 0;
        this.nombre = nombre;
        this.marca = marca;
        this.modelo = modelo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getExistencias() {
        return existencias;
    }

    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }
    
    public void setExistencias(){
        if(this.existencias <= 0){
            JOptionPane.showMessageDialog(null, "No hay existencias de un repuesto", "Taller", JOptionPane.WARNING_MESSAGE);
        }else{
            this.existencias -= 1;
        }
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
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
