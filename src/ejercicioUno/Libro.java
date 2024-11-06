package ejercicioUno;

public class Libro {
    private String titulo;
    private String autor;
    private int numeroPaginas;

    //constructor por defecto
    public Libro() {}

    //constructor por parametros
    public Libro(String titulo, String autor, int numeroPaginas){
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString() {
        return "Libro { " + "\n" +
                "   titulo = " + titulo + ",\n" +
                "   autor = " + autor + ",\n" +
                "   numeroPaginas = " + numeroPaginas + ",\n" +
                "}";
    }
}
