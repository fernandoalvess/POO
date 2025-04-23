package aulas.colecoes.cores;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DemoCores {
    public static void main(String[] args) {
        ArrayList<String> cores = new ArrayList<>(Arrays.asList("Vermelho", "Verde", "Azul"));
        System.out.println(cores);

        cores.add("Branco");
        System.out.println(cores);

        cores.addAll(Arrays.asList("Amarelo", "Preto"));
        System.out.println(cores);

        Collections.sort(cores);
        System.out.println(cores);

        buscaAlvo(cores, "Vermelho");
        buscaAlvo(cores, "Cinza");
    }

    public static void buscaAlvo(ArrayList<String> lista, String alvo) {
        if (lista.contains(alvo)) {
            int pocisao = Collections.binarySearch(lista, alvo);
            System.out.println("Encontrado: " + alvo + ", na posição: " + pocisao);
        } else {
            System.out.println("Não encontrado: " + alvo);
        }

    }
}
