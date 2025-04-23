package lista.q63;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class DemoConsultorio {
    public static void main(String[] args) {
        Queue<Paciente> filaPrioridade = new LinkedList<>();
        Queue<Paciente> filaNormal = new LinkedList<>();
        Random random = new Random();

        // int tempo = 0;
        int atendidos = 0;

        for (int i = 0; i < 20; i++) {
            int rg = 100000 + random.nextInt(900000);
            int idade = 18 + random.nextInt(83);

            Paciente paciente = new Paciente(rg, idade);

            if (paciente.getIdade() >= 60) {
                filaPrioridade.add(paciente);
            } else {
                filaNormal.add(paciente);
            }

            // tempo +=4;
        }

        while (atendidos < 20) {
            if (!filaPrioridade.isEmpty()) {
                System.out.println("Atendendo paciente prioritário: " + filaPrioridade.poll());
            } else if (!filaNormal.isEmpty()) {
                System.out.println("Atendendo paciente normal: " + filaNormal.poll());
            }

            atendidos++;
            // tempo += 5;
        }

        System.out.println("Todos atendidos!");

    }
}
