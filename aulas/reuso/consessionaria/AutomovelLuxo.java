package aulas.reuso.consessionaria;

public class AutomovelLuxo extends AutomovelBasico{
    private boolean arCondicionado;
    private boolean direcaoHidraulica;
    
    public AutomovelLuxo(String modelo, int ano, String cor, boolean airbag, boolean radio, boolean arCondicionado, boolean direcaoHidraulica) {
        super(modelo, ano, cor, airbag, radio);
        this.arCondicionado = arCondicionado;
        this.direcaoHidraulica = direcaoHidraulica;
    }
    
    public float quantoCusta() {
        float custo = super.quantoCusta();
        if (arCondicionado) {
            custo += 15000;
        }
        if (direcaoHidraulica) {
            custo += 17000;
        }
        return custo;
    }

    @Override
    public String toString() {
        String res = "AutomovelLuxo [";
        res += "Ano=" + ano;
        res += " Modelo=" + modelo;
        res += " Cor=" + cor;
        res += " Airbag=" + (isAirbag()? "sim" : "não");
        res += " Radio=" + (isRadio()? "sim" : "não");
        res += " ArCondicionado=" + (arCondicionado? "sim" : "não");
        res += " DirecaoHidraulica=" + (direcaoHidraulica? "sim" : "não");
        res += "]";
        return res;
    }

    
}
