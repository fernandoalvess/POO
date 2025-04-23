package lista.q39;

public class DemoFuncionario {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("João");
        Funcionario f2 = new Funcionario("Fernando", "Egenheiro de Software", 50f);

        System.out.println(f1);
        System.out.println();
        System.out.println(f2);
    }
}
