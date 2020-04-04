
package Clases;


public class COrdenDeTrabajo {
    
    int id, precioT, idMecanico, idServicio;
    String auto, cliente, servicio, fecha, empleado, estado, tipoC, idCliente;
    /*
        Estado solo puede tomar los valores ColaDeEspera, EnServicio, Listo, Pagado
    */
    public COrdenDeTrabajo(int id, int precio, String auto, 
            String cliente, String servicio, String fecha, 
            String empleado, String estado, String tipo, String idCliente, int idMecanico, int idServicio){
        this.id = id;
        this.precioT = precio;
        this.auto = auto;
        this.cliente = cliente;
        this.servicio = servicio; 
              
        this.fecha = fecha;
        this.empleado = empleado;
        this.estado = estado;
        this.tipoC = tipo;
        this.idCliente = idCliente;
        this.idMecanico = idMecanico;
        this.idServicio = idServicio;
    }

    public int getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

    
    
    public int getIdMecanico() {
        return idMecanico;
    }

    public void setIdMecanico(int idMecanico) {
        this.idMecanico = idMecanico;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getTipoC() {
        return tipoC;
    }

    public void setTipoC(String tipoC) {
        this.tipoC = tipoC;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrecioT() {
        return precioT;
    }

    public void setPrecioT(int precioT) {
        this.precioT = precioT;
    }

    public String getAuto() {
        return auto;
    }

    public void setAuto(String auto) {
        this.auto = auto;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
        
}
