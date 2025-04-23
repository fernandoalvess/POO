package lista.q60;

import java.util.LinkedList;

public class Caracteres {
    public static void main(String[] args) {
        LinkedList<Character> lista = new LinkedList<>();
        lista.add('a');
        lista.add('b');
        lista.add('c');
        lista.add('d');
        lista.add('e');
        lista.add('f');
        lista.add('g');
        lista.add('h');
        lista.add('i');
        lista.add('j');

        LinkedList<Character> listaInvertida = new LinkedList<>();
        for (int i = lista.size() - 1; i >= 0; i--) {
            listaInvertida.add(lista.get(i));
        }

        System.out.println("Lista original: " + lista);
        System.out.println("Lista invertida: " + listaInvertida);
    }
}
