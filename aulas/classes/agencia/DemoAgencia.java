package aulas.classes.agencia;

public class DemoAgencia {
    public static void main(String[] args) {
        System.out.println("Clientes atendidos: " + CaixaBanco.clientesAtendidos);

        CaixaBanco caixa1 = new CaixaBanco(1);
        CaixaBanco caixa2 = new CaixaBanco(2);
        CaixaBanco caixa3 = new CaixaBanco(3);
        CaixaBanco caixa4 = new CaixaBanco(4);
        CaixaBanco caixa5 = new CaixaBanco(5);
        caixa1.IniciaAtendimento();
        caixa2.IniciaAtendimento();
        caixa3.IniciaAtendimento();
        caixa4.IniciaAtendimento();
        caixa5.IniciaAtendimento();

        System.out.println("Clientes atendidos: " + CaixaBanco.clientesAtendidos);
    }
}
