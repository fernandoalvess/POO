package lista.q8;

import lista.q7.Contador;

public class Lampada {
    private boolean estadoLampada = false;

    Contador contador = new Contador(0);

    public void Acende(){
        estadoLampada = true;
        contador.Incrementar();
    }

    public void Apaga(){
        estadoLampada = false;
    }

    public String MostraEstado(){
        return estadoLampada ? "A lampada esta acesa" : "A lampada esta apagada";
    }

    public boolean EstaLigada(){
        if (estadoLampada) {
            return true;
        } else {
            return false;
        }
    }
    
    public int QuantasVezesFoiAcesa(){
        return contador.Imprimir();
    }
}
