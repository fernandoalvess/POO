package aulas.abstrata.financeiro;

public class DemoFinanceiro {
    public static void main(String[] args) {
        Assalariado func = new Assalariado("Fernando", "5461111179", 100000f);
        Fatura fatura = new Fatura(100.45f, 5);

        imprimirPagamento(func);
        imprimirPagamento(fatura);
    }

    public static void imprimirPagamento(Pagavel pagavel){
        System.out.println("Valor do pagamento: " + pagavel.obterValorPagamento());
    }
}
