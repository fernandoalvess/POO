package aulas.colecoes.mapa;

import java.util.TreeMap;

public class DemoMapa {
    public static void main(String[] args) {
        TreeMap<String, Integer> cont = new TreeMap<>();
        String texto = "Lorem ipsum dolor sit amet consectetur adipiscing elit Cras consequat libero sit amet mi aliquam sollicitudin Nulla libero lectus laoreet congue pulvinar at pharetra ut lorem Integer sed leo ut urna finibus porttitor Nulla ornare ac ex ac consectetur Sed porta turpis id iaculis aliquam ex massa consectetur elit eu tristique ex eros dapibus eros Etiam rhoncus enim et tellus commodo lobortis pulvinar eget nisl Class aptent taciti sociosqu ad litora torquent per conubia nostra per inceptos himenaeos Sed cursus a lorem nec feugiat";
        String[] palavras = texto.split(" ");

        for (String palavra : palavras) {
            String  palavraMin = palavra.toLowerCase();
            if (!cont.containsKey(palavraMin)) {
                cont.put(palavraMin, 1);
            } else {
                int valor = cont.get(palavraMin);
                cont.put(palavraMin, valor + 1);
            }
        }

        for (String palavra : cont.keySet()) {
            System.out.println(palavra + ": " + cont.get(palavra));
            
        }
    }
}
