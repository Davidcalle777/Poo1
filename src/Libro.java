public class Libro {
    String isbn;
    String titulo;
    String autor;
    int numeroDePaginas;

    //creación metodo prestar libro
    public void prestar() {
        System.out.println("El libro " + titulo + " ha sido prestado.");
    }
    //creación metodo buscar Libro
    public void buscar() {
        System.out.println("Buscando el libro " + titulo + "...");
    }
}
