package lista.q61;

import java.util.Map;
import java.util.TreeMap;

public class ContarLetras {
    public static void main(String[] args) {
        String texto = "HELLO THERE";
        Map<Character, Integer> letras = new TreeMap<>();
        for (char c : texto.toCharArray()) {
            if (Character.isLetter(c)) {
                c = Character.toLowerCase(c);
                letras.put(c, letras.getOrDefault(c, 0) + 1);
            }
        }
        for (Map.Entry<Character, Integer> letra : letras.entrySet()) {
            System.out.println(letra.getKey() + ": " + letra.getValue());
        }
    }
}
