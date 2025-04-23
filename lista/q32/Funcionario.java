package lista.q32;

public class Funcionario {
    private String nome;
    private float salario;

    public Funcionario(String nome, float salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void aumentarSalario(float percentual) {
        salario += salario * percentual / 100;
    }

    public float ganhoAnual() {
        return (salario * 12) + salario;
    }

    @Override
    public String toString() {
        return "Funcionario| Nome: " + nome + ", Salario: " + salario;
    }
}
