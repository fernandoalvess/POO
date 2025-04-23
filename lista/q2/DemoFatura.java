package lista.q2;

public class DemoFatura {
    public static void main(String[] args){
        Fatura f1 = new Fatura(1, "Fatura 1", 10, 5.0);
        Fatura f2 = new Fatura(2, "Fatura 2", -10, -5.0);

        System.out.println("Fatura 1:");
        System.out.println("Número de identificação: " + f1.numeroIdentificacao);
        System.out.println("Descrição: " + f1.descricao);
        System.out.println("Quantidade comprada: " + f1.quantidadeComprada);
        System.out.println("Preço: " + f1.preco);
        System.out.println("Total: " + f1.calculaTotal());

        System.out.println("\nFatura 2:");
        System.out.println("Número de identificação: " + f2.numeroIdentificacao);
        System.out.println("Descrição: " + f2.descricao);
        System.out.println("Quantidade comprada: " + f2.quantidadeComprada);
        System.out.println("Preço: " + f2.preco);
        System.out.println("Total: " + f2.calculaTotal());
    }
}
