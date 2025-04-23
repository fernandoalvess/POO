package lista.q12;

public class DemoGenerico {
    public static void main (String[] args) {
        Generico <Integer> g1 = new Generico<>(1, 1, 1);
        System.out.println("Total iguais: " + g1.igual());
        g1.imprimeDados();
    }
}
