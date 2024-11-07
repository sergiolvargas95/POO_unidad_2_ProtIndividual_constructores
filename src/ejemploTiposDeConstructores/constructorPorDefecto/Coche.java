package ejemploTiposDeConstructores.constructorPorDefecto;

public class Coche {
    String marca;

    //constructor por defecto
    public Coche() {
        marca = "Desconocida";
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
