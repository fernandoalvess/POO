package lista.q32;

public class Administrativo extends Assistente {
    private String turno;
    private float adicionalNoturno;

    public Administrativo(String nome, float salario, int matricula, String turno, float adicionalNoturno) {
        super(nome, salario, matricula);
        this.turno = turno;
        this.adicionalNoturno = adicionalNoturno;
    }

    public float ganhoAnual() {
        float salario = super.ganhoAnual();
        if (turno.equals("Noturno")) {
            return salario + (adicionalNoturno * 12);
        }
        return salario;
    }

    @Override
    public String toString() {
        return super.toString() + ", Turno: " + turno + ", Adicional Noturno: " + adicionalNoturno;
    }

}
