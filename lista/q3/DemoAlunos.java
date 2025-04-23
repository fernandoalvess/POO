package lista.q3;

public class DemoAlunos {
    public static void main(String[] args) {
        Alunos a1 = new Alunos(123, "João", 5, 6, 7);
        Alunos a2 = new Alunos(456, "Maria", 3, 4, 5);
        Alunos a3 = new Alunos(789, "José", 1, 2, 3);

        System.out.println("Aluno: " + a1.nome + " - Matrícula: " + a1.matricula);
        System.out.println("Média: " + a1.media());
        System.out.println("Precisa na Prova Final: " + a1.provaFinal());
        System.out.println();

        System.out.println("Aluno: " + a2.nome + " - Matrícula: " + a2.matricula);
        System.out.println("Média: " + a2.media());
        System.out.println("Preicsa na Prova Final: " + a2.provaFinal());
        System.out.println();

        System.out.println("Aluno: " + a3.nome + " - Matrícula: " + a3.matricula);
        System.out.println("Média: " + a3.media());
        System.out.println("Precisa na Prova Final: " + a3.provaFinal());
        System.out.println();
    }
}
