package aulas.abstrata.controleUniversal;

public class DemoControle {
    public static void main(String[] args) {
        Barco barco = new Barco(10, 5.89f, "123hgo4");
        Carro carro = new Carro(5, 4, "ABC1234");
        Aviao aviao = new Aviao(100, "12ui34", "sdg-gol");

        System.out.println(barco);
        Controle.controlar(barco);

        System.out.println(carro);
        Controle.controlar(carro);

        System.out.println(aviao);
        Controle.controlar(aviao);

    }
}
