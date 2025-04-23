package aulas.reuso.consessionaria;

public class DemoAutomoveis {
    public static void main(String[] args) {
        AutomovelLuxo carro = new AutomovelLuxo("Ferrari", 2015, "vermelho", true, true, true, true);
        System.out.println(carro);
        System.out.println("Custo: " + carro.quantoCusta());
    }
}
