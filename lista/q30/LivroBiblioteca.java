package lista.q30;

public class LivroBiblioteca extends Livro {
    private int numPaginas;

    public LivroBiblioteca(String titulo, String autor, int numPaginas) {
        super(titulo, autor);
        this.numPaginas = numPaginas;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    @Override
    public String toString() {
        return "LivroBiblioteca{" +
                "titulo='" + getTitulo() + '\'' +
                ", autor='" + getAutor() + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }

}
