package aulas.reuso.consessionaria;

public class AutomovelBasico extends Automovel {
    private boolean airbag;
    private boolean radio;

    public AutomovelBasico(String modelo, int ano, String cor, boolean airbag, boolean radio) {
        super(modelo, ano, cor);
        this.airbag = airbag;
        this.radio = radio;
    }
    
    public float quantoCusta() {
        float custo = super.quantoCusta();
        if (airbag) {
            custo += 10000;
        }
        if (radio) {
            custo += 3000;
        }
        return custo;
    }

    public boolean isAirbag() {
        return airbag;
    }

    public boolean isRadio() {
        return radio;
    }
}
