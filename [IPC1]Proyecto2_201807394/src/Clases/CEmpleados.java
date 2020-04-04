
package Clases;


public class CEmpleados {
    int id;
    String nombre, rol, user, pass, ocupado;
    /*
        Rol tomara los valores de: Administrador, mecanico, receptorPagador
    */    
    public CEmpleados(int id, String nombre, String rol, String user, String pass){
        this.id = id;
        this.nombre = nombre;
        this.rol = rol;
        this.user = user;
        this.pass = pass;
        if(this.rol.equals("mecanico")){
            ocupado = "NO";
        }
    }

    public String getOcupado() {
        return ocupado;
    }

    public void setOcupado() {
        if(this.ocupado.equals("NO")){
            this.ocupado = "SI";
        }else{
            this.ocupado = "NO";
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
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
        
}
