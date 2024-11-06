package ejercicioDos;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria primeraCuentaBancaria = new CuentaBancaria();
        System.out.println("Número de Cuenta: " + primeraCuentaBancaria.getNumeroCuenta());
        System.out.println("Saldo: " + primeraCuentaBancaria.getSaldo());
        System.out.println("Tipo de Cuenta: " + primeraCuentaBancaria.getTipoCuenta());

        System.out.println("-------------------------------------------");
        CuentaBancaria segundaCuentaBancaria = new CuentaBancaria("2382340325492", "Ahorros");
        System.out.println("Número de Cuenta: " + segundaCuentaBancaria.getNumeroCuenta());
        System.out.println("Saldo: " + segundaCuentaBancaria.getSaldo());
        System.out.println("Tipo de Cuenta: " + segundaCuentaBancaria.getTipoCuenta());

        System.out.println("-------------------------------------------");
        CuentaBancaria terceraCuentaBancaria = new CuentaBancaria("9876543210", 1500.75, "Corriente");
        System.out.println("Número de Cuenta: " + terceraCuentaBancaria.getNumeroCuenta());
        System.out.println("Saldo: " + terceraCuentaBancaria.getSaldo());
        System.out.println("Tipo de Cuenta: " + terceraCuentaBancaria.getTipoCuenta());
    }
}
