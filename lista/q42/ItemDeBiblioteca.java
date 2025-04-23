package lista.q42;

public abstract interface ItemDeBiblioteca {
    int maximoDeDiasEmprestimo = 14;

    public boolean estaEmprestado();
    public boolean empresta();
    public boolean devolve();
    public String localizacao();
    public String descricao();

}
