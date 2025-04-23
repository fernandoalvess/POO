package aulas.classes.pessoa;

public class Pessoa {
    private String nome;
    private float altura;

    public Pessoa(String nome, float altura) {
        this.nome = nome;
        this.altura = altura;
    }

    public String getNome() {
        return "Nome: " + nome;
    }

    public void setNome(String novoNome) {
        if(!novoNome.isEmpty()) {
            nome = novoNome;
        }
    }

    public float getAltura() {
        return 100*altura;
    }

    void setAltura(float novaAltura) {
        if(novaAltura > 1.2) {
            altura = novaAltura;
        }
    }

    public String toString() {
        return "Nome: " + nome + " Altura: " + altura;
    }

    
}
