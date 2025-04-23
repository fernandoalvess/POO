package lista.q32;

public class Tecnico extends Assistente {
    private float bonusSalarial;

    public Tecnico(String nome, float salario, int matricula, float bonusSalarial) {
        super(nome, salario, matricula);
        this.bonusSalarial = bonusSalarial;
    }

    public float ganhoAnual() {
        return (super.ganhoAnual() + bonusSalarial);
    }

    @Override
    public String toString() {
        return super.toString() + ", Bonus Salarial: " + bonusSalarial;
    }
}
