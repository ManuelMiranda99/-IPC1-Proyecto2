
package Clases;

import Listas.ListaAutos;


public class CClientes {
    
    String id, nombre, user, pass, tipo;
    int usos;
    /*
        Tipo solo puede ser Normal y Oro. Oro despues de pagar 3 veces
    */
    //Lista de Autos. Agregar lista en constructor
    public ListaAutos lista;
    public CClientes(String id, String nombre, String user, String pass){
        this.id = id;
        this.nombre = nombre;
        this.user = user;
        this.pass = pass;
        this.usos = 0;
        this.tipo = "normal";
        this.lista = new ListaAutos();
    }
    
    public int getIdI(){
        int idi = Integer.parseInt(id);
        return idi;
    }

    public CClientes(String id, String nombre, String user, String pass, String tipo, ListaAutos lista) {
        this.id = id;
        this.nombre = nombre;
        this.user = user;
        this.pass = pass;
        this.tipo = tipo;
        this.lista = lista;
        this.usos = 0;
    }
    
    
    
    public void usoCliente(){
        this.usos += 1;
        if(this.usos == 3){
            this.tipo = "oro";
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
