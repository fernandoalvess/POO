package lista.q11;

public class RegistroAcademico {
    public String nome;
    public static int matricula;
    private int codigoCurso;
    private double percentualDeCobranca;

    public void inicializaRegistroAcademico(String n, int cod, double perc) {
        nome = n;
        codigoCurso = cod;
        percentualDeCobranca = perc;
        numeroDeMatriculas();
    }

    public double calculaMensalidade() {
        return 100 * codigoCurso * percentualDeCobranca;
    }

    public static int numeroDeMatriculas() {
        return matricula++;
    }

    public void imprimeRegistroAcademico() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Código do curso: " + codigoCurso);
        System.out.println("Percentual de cobrança: " + percentualDeCobranca);
    }
}