package aulas.reuso.empresa;

public class Funcionario extends Pessoa{
    private float salario;

    public Funcionario(String nome, String identidade, float salario) {
        super(nome, identidade);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public String toString() {
        return super.toString() + ", Salário: " + salario;
    }
}
