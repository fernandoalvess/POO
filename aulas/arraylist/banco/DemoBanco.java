package aulas.arraylist.banco;

import java.util.Scanner;

public class DemoBanco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Extrato extrato = new Extrato();

        int opcao;
        float valor;
        boolean terminar = false;

    do {
        System.out.println("0 - Depositar");
        System.out.println("1 - Sacar");
        System.out.println("2 - Ver extrato");
        System.out.println("3 - Sair");
        System.out.print("Digite a opção desejada: ");
        opcao = sc.nextInt();

        switch (opcao) {
            case 0:
                System.out.print("Digite o valor a ser depositado: ");
                valor = sc.nextFloat();
                extrato.transacao(valor);
                break;
            case 1:
                System.out.print("Digite o valor para saque: ");
                valor = sc.nextFloat();
                extrato.transacao(-valor);  
                break;
            case 2:
                extrato.verExtrato();
                break;
            case 3:
                System.out.println("Encerrando a sessão");
                terminar = true;
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    } while (!terminar);
        sc.close();
    }
}
