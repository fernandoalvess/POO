package aulas.classes.circulo;

public class Circulo {
    private double raio;
    public static final double pi = 3.14159;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double perimetro(){
        return 2 * pi * raio;
    }
}
