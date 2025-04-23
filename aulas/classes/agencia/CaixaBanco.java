package aulas.classes.agencia;

public class CaixaBanco {
    public static int clientesAtendidos = 0;
    private int numeroCaixa;

    public CaixaBanco(int numeroCaixa) {
        this.numeroCaixa = numeroCaixa;
    }

    public void IniciaAtendimento() {
        clientesAtendidos++;
        System.out.println("Caixa " + numeroCaixa + " atendeu o clinte " + clientesAtendidos);
    }

    
}
