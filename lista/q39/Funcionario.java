package lista.q39;

public class Funcionario {
    private String nome;
    private String cargo;
    private float salarioHora;

    public Funcionario(String nome) {
        this.nome = nome;
        cargo = "Bolsista";
        salarioHora = 2f;
    }

    public Funcionario(String nome, String cargo, float salarioHora) {
        this.nome = nome;
        this.cargo = cargo;
        this.salarioHora = salarioHora;
    }

    public float salarioMes() {
        return salarioHora * 220;
    }

    public String toString() {
        return "Nome: " + nome + "\nCargo: " + cargo + "\nSalário por mês: " + salarioMes();
    }
}
