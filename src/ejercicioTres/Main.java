package ejercicioTres;

public class Main {
    public static void main(String[] args) {
        Estudiante primerEstudiante = new Estudiante();
        primerEstudiante.setNombre("Alfonso");
        primerEstudiante.setEdad(15);
        primerEstudiante.setCurso("4");

        Estudiante segundoEstudiante = new Estudiante("Edward", 17);

        Estudiante tercerEstudiante = new Estudiante("Carlos", 12, "7");

        System.out.println(primerEstudiante.toString());
        System.out.println(segundoEstudiante.toString());
        System.out.println(tercerEstudiante.toString());
    }
}
