package ejemploTiposDeConstructores.constructorPorDefecto;

public class Main {
    public static void main(String[] args) {
        Coche miCoche = new Coche();

        System.out.println("La marca de mi coche es: " + miCoche.getMarca());

        miCoche.setMarca("BMW");

        System.out.println("La marca de mi coche es: " + miCoche.getMarca());
    }
}
