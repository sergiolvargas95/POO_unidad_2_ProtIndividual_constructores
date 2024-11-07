package ejemploTiposDeConstructores.thisYsuper.usoThis;

import ejemploTiposDeConstructores.sobrecargaDeConstructores.Coche;

public class Main {
    public static void main(String[] args) {
        ejemploTiposDeConstructores.sobrecargaDeConstructores.Coche miCocheNuevo = new ejemploTiposDeConstructores.sobrecargaDeConstructores.Coche("Ford");
        ejemploTiposDeConstructores.sobrecargaDeConstructores.Coche miUltimoCoche = new Coche("Toyota", "Fortuner");

        System.out.println("La marca de mi coche nuevo es: " + miCocheNuevo.getMarca());
        System.out.println("La marca de mi ultimo coche es: " + miUltimoCoche.getMarca() + " y el modelo es: " + miUltimoCoche.getModelo());
    }
}
