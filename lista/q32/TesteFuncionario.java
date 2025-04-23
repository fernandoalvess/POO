package lista.q32;

public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("João", 1000);
        Assistente a1 = new Assistente("Maria", 2000, 123);
        Tecnico t1 = new Tecnico("José", 3000, 456, 500);
        Administrativo ad1 = new Administrativo("Ana", 4000, 789, "Noturno", 1000);

        System.out.println(f1);
        System.out.println(a1);
        System.out.println(t1 + ", Ganho Anual: " + t1.ganhoAnual());
        System.out.println(ad1 + ", Ganho Anual: " + ad1.ganhoAnual());
    }
}
