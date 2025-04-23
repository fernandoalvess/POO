package lista.q30;

public class LivroLivraria extends Livro {
    private double preco;

    public LivroLivraria(String titulo, String autor, double preco) {
        super(titulo, autor);
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "LivroLivraria{" +
                "titulo='" + getTitulo() + '\'' +
                ", autor='" + getAutor() + '\'' +
                ", preco=" + preco +
                '}';
    }
    
}
