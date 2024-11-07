package ejemploTiposDeConstructores.sobrecargaDeConstructores;

public class Coche {
    String marca;
    String modelo;

    //constructor por defecto
    public Coche() {
        this.marca = "Desconocida";
    }

    //constructor parametrizado
    public Coche(String marca) {
        this.marca = marca;
    }

    //constructor sobrecargado con dos parametros
    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
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
