package lista.q21;

import java.util.Random;

public class Dado {
    public static void main(String[] args) {
        Random random = new Random();
        int[] frequencia = new int[13];

        int totalLancamento = 36000000;
        for (int i = 0; i < totalLancamento; i++) {
            int dado1 = 1 + random.nextInt(6);
            int dado2 = 1 + random.nextInt(6);
            frequencia[dado1 + dado2]++;
        }

        System.out.printf("Soma\tFrequência\tPercentual%n");
        for (int i = 2; i < frequencia.length; i++) {
            double percentual = (frequencia[i] / (double) totalLancamento) * 100;
            System.out.printf("%d\t%d\t\t%.2f%%%n", i, frequencia[i], percentual);
        }

    }
}
