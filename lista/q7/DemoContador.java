package lista.q7;

public class DemoContador {
    public static void main(String[] args) {
        Contador contarEvento = new Contador(5);
        System.out.println(contarEvento.Imprimir());
        contarEvento.Incrementar();
        System.out.println(contarEvento.Imprimir());
        contarEvento.Zerar();
        System.out.println(contarEvento.Imprimir());
    }
}
