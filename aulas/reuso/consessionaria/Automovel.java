package aulas.reuso.consessionaria;

public class Automovel {
    protected String modelo;
    protected int ano;
    protected String cor;

    public Automovel(String modelo, int ano, String cor) {
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

    public float quantoCusta() {
        return ano < 2010 ? 60000 : 90000;
    }
}
