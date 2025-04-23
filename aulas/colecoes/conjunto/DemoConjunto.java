package aulas.colecoes.conjunto;

import java.util.TreeSet;

public class DemoConjunto {
    public static void main (String[] args) {
        TreeSet<String> conjunto = new TreeSet<>();
        conjunto.add("Preto");
        conjunto.add("Branco");
        conjunto.add("Vermelho");
        conjunto.add("Azul");
        conjunto.add("Verde");
        conjunto.add("Amarelo");
        conjunto.add("Preto");
        System.out.println(conjunto);

        System.out.println(conjunto.headSet("Preto"));
        System.out.println(conjunto.tailSet("Preto"));
        System.out.println(conjunto.first());
        System.out.println(conjunto.last());
    }
}
