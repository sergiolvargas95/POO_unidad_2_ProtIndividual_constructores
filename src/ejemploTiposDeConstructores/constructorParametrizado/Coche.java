package ejemploTiposDeConstructores.constructorParametrizado;

public class Coche {
    String marca;

    //constructor parametrizado
    public Coche(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
