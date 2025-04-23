package lista.q20;

public class Produto {
    public static int produto(int... numeros) {
        int produto = 1;
        for (int numero : numeros) {
            produto *= numero;
        }
        return produto;
    }
}
