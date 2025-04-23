package aulas.colecoes.remocao;

import java.util.LinkedList;
import java.util.ListIterator;

public class RemoveLista {
    public static void main(String[] args) {
        LinkedList<String> listaCompleta = new LinkedList<>();
        LinkedList<String> listaRemocao = new LinkedList<>();

        listaCompleta.add("Verde");
        listaCompleta.add("Azul");
        listaCompleta.add("Amarelo");
        listaCompleta.add("Roxo");
        listaCompleta.add("Preto");
        listaCompleta.add("Branco");
        listaCompleta.add("Laranja");

        listaRemocao.add("Amarelo");
        listaRemocao.add("Roxo");
        listaRemocao.add("Branco");

        System.out.println("Lista completa: " + listaCompleta);
        System.out.println("Lista remoção: " + listaRemocao);

        removeLista(listaCompleta, listaRemocao);

        System.out.println("Lista completa após remoção: " + listaCompleta);
    }

    public static void removeLista(LinkedList<String> listaCompleta, LinkedList<String> listaRemocao) {
        ListIterator<String> itera = listaCompleta.listIterator();
        while (itera.hasNext()) {
            String elemento = itera.next();
            if (listaRemocao.contains(elemento)) {
                itera.remove();
                System.out.println("Elemento removido: " + elemento);
            }
        }
    }
}
