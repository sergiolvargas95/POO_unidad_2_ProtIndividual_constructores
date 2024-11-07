package ejemploTiposDeConstructores.thisYsuper.usoSuper;

public class Coche extends Vehiculo {
    String marca;

    //Llama al constructor de la clase base usando super
    public Coche(String tipo, String marca) {
        super(tipo);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
