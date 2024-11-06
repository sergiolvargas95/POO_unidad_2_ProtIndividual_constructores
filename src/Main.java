import ejercicioDos.CuentaBancaria;
import ejercicioTres.Estudiante;
import ejercicioUno.Libro;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Libro miLibro = new Libro();
        Estudiante nuevoEstudiante = new Estudiante();
        CuentaBancaria miCuentaBancaria = new CuentaBancaria();

        Scanner input = new Scanner(System.in);

        System.out.println("Por favor ingresar sus datos como estudiante.");
        System.out.println("Ingresar su nombre: ");
        nuevoEstudiante.setNombre(input.nextLine());

        System.out.println("Ingresar su edad: ");
        nuevoEstudiante.setEdad(input.nextInt());
        input.nextLine(); // Esta línea descarta el salto de línea residual

        System.out.println("Ingresar su curso: ");
        nuevoEstudiante.setCurso(input.nextLine());



        System.out.println("Por favor ingrese la información de su cuenta bancaria.");
        System.out.println("Ingresar su número de cuenta bancaria: ");
        miCuentaBancaria.setNumeroCuenta(input.nextLine());

        System.out.println("Ingresar valor del saldo total: ");
        miCuentaBancaria.setSaldo(input.nextDouble());
        input.nextLine(); // Limpiar el buffer de entrada después de nextDouble

        System.out.println("Ingresar su tipo de cuenta bancaria: ");
        miCuentaBancaria.setTipoCuenta(input.nextLine());

        System.out.println("Por favor ingresar la información del libro que quiere comprar");
        System.out.println("Ingresar el nombre del libro: ");
        miLibro.setTitulo(input.nextLine());

        System.out.println("Ingresar el autor del libro: ");
        miLibro.setAutor(input.nextLine());

        System.out.println("Ingresar el número de páginas del libro: ");
        miLibro.setNumeroPaginas(input.nextInt());

        input.close();

        System.out.println(miLibro.toString());
        System.out.println(miCuentaBancaria.toString());
        System.out.println(nuevoEstudiante.toString());
    }
}