package ejemploTiposDeConstructores.sobrecargaDeConstructores;

public class Main {
    public static void main(String[] args) {
        Coche miCocheAntiguo = new Coche();
        Coche miCocheNuevo = new Coche("Volkswagen");
        Coche miUltimoCoche = new Coche("Chevrolet", "Camaro ZL1 1LE 2017");

        System.out.println("La marca de mi coche antiguo es: " + miCocheAntiguo.getMarca());
        System.out.println("La marca de mi coche nuevo es: " + miCocheNuevo.getMarca());
        System.out.println("La marca de mi ultimo coche es: " + miUltimoCoche.getMarca() + " y el modelo es: " + miUltimoCoche.getModelo());
    }
}
