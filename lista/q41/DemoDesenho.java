package lista.q41;

import lista.q40.Circulo;
import lista.q40.Quadrado;
import lista.q40.Triangulo;

public class DemoDesenho {
    public static void main(String[] args) {
        Desenho desenho1 = new Desenho(new Circulo(), 2, 3, new Quadrado(), 5, 7);
        Desenho desenho2 = new Desenho(new Quadrado(), 1, 1, new Triangulo(), 4, 6);

        desenho1.apresenta();
        System.out.println();
        desenho2.apresenta();
    }
}
