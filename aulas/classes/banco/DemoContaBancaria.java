package aulas.classes.banco;

import java.util.Scanner;

public class DemoContaBancaria {
    public static void main(String[] args) {
        String nome;
        float saldo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome:");
        nome = sc.nextLine();
        System.out.println("Digite o saldo:");
        saldo = sc.nextFloat();
        sc.close();

        ContaBancaria c1 = new ContaBancaria("Feranndo");
        System.out.println(c1);

        ContaBancaria c2 = new ContaBancaria(nome, saldo, true);
        System.out.println(c2);
    }
}
