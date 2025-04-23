package aulas.abstrata.financeiro;

public class Assalariado  extends Empregado {
    private float salario;

    public Assalariado(String nome, String ctps, float salario){
        super(nome, ctps);
        this.salario = salario;
    }

    public float obterValorPagamento(){
        return salario;
    }

}
