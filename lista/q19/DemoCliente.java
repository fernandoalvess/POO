package lista.q19;

import java.util.Scanner;
import java.util.ArrayList;

public class DemoCliente {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Cliente> clientes = new ArrayList<>();

        while (true) {
            System.out.println("Informe o ID do cliente: ");
            int id = scanner.nextInt();
            if(id < 0) {
                break;
            }
            System.out.println("Informe o nome do cliente: ");
            String nome = scanner.next();
            System.out.println("Informe a idade do cliente: ");
            int idade = scanner.nextInt();
            System.out.println("Informe o telefone do cliente: ");
            String telefone = scanner.next();

            clientes.add(new Cliente(id, nome, idade, telefone));
        }

        System.out.println("Clientes cadastrados: ");
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }

        scanner.close();
    }
}
