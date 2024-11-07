package ejemploTiposDeConstructores.thisYsuper.usoSuper;

public class Main {
    public static void main(String[] args) {
        Coche miVehiculo = new Coche("Auto", "Ferrari");

        System.out.println("mi vehiculo es del tipo " + miVehiculo.getTipo() + " y la marca es " + miVehiculo.getMarca());
    }
}
