package ejemploTiposDeConstructores.thisYsuper.usoThis;

public class Coche {
    String marca;
    String modelo;

    //constructor con un parámetro
    public Coche(String marca) {
        this.marca = marca;
    }

    //Llamada al constructor anterior usando this
    public Coche(String marca, String modelo) {
        this(marca);
        this.modelo = modelo;
    }
}
