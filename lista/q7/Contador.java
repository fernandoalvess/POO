package lista.q7;


public class Contador {
    private int contar;


    public Contador(int contar) {
        this.contar = contar;
    }

    public void Zerar(){
        contar = 0;
    }

    public void Incrementar() {
        contar++;
    }

    public int Imprimir(){
        return contar;
    }
}
