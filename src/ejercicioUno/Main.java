package ejercicioUno;

public class Main {
    public static void main(String[] args) {
        Libro miPrimeroLibro = new Libro();
        miPrimeroLibro.setTitulo("Las Crónicas de Narnia: El león, la bruja y el armario");
        miPrimeroLibro.setAutor("C.S. Lewis");
        miPrimeroLibro.setNumeroPaginas(208);

        Libro miSegundoLibro = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 920);

        System.out.println(miPrimeroLibro.toString());
        System.out.println(miSegundoLibro.toString());
    }
}
