package aulas.classes.circulo;

public class DemoCirculo {
    public static void main(String[] args) {
        System.out.println("PI: " + Circulo.pi);

        Circulo c1 = new Circulo(1.0);
        System.out.println("Perímetro do círculo: " + c1.perimetro());

        Circulo c2 = new Circulo(2.0);
        System.out.println("Perímetro do círculo: " + c2.perimetro());
    }
}
