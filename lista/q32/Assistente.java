package lista.q32;

public class Assistente extends Funcionario {
    private int matricula;

    public Assistente(String nome, float salario, int matricula) {
        super(nome, salario);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return  super.toString() + ", Matricula: " + matricula;
    }
}
