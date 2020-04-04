
package Clases;


public class CAutos {
    
    String Placa, Marca, Modelo, RutaImagen;
    public CAutos(String Placa, String Marca, String Modelo, String RutaImagen){
        this.Placa = Placa;
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.RutaImagen = RutaImagen;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getRutaImagen() {
        return RutaImagen;
    }

    public void setRutaImagen(String RutaImagen) {
        this.RutaImagen = RutaImagen;
    }
    
}
