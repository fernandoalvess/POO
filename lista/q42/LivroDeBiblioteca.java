package lista.q42;

public class LivroDeBiblioteca extends Livro implements ItemDeBiblioteca {
    private boolean emprestado;

    public LivroDeBiblioteca(String titulo, String autor, int numeroDePaginas, int anoDaEdicao) {
        super(titulo, autor, numeroDePaginas, anoDaEdicao);
        this.emprestado = false;
    }

    public boolean estaEmprestado() {
        return emprestado;
    }

    public boolean empresta() {
        if (estaEmprestado()) {
            return false;
        }
        emprestado = true;
        return true;
    }

    public boolean devolve() {
        if (!estaEmprestado()) {
            return false;
        }
        emprestado = false;
        return true;
    }

    public String localizacao() {
        return "Local: Corredor 2 prateleira D";
    }

    public String descricao() {
        return qualTitulo();
    }

    public String toString() {
        return super.toString();
    }
}
