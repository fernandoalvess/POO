package lista.q12;

public class Generico <T>{
    public T primeiro;
    public T segundo;
    public T terceiro;

    Generico(T primeiro, T segundo, T terceiro) {
        this.primeiro = primeiro;
        this.segundo = segundo;
        this.terceiro = terceiro;
    }

    public int igual() {
        if (primeiro.equals(segundo) && segundo.equals(terceiro)) {
            return 3;
        } else if (primeiro.equals(segundo) || segundo.equals(terceiro) || primeiro.equals(terceiro)) {
            return 2;
        } else {
            return 0;
        }
    }

    public void imprimeDados(){
        System.out.println("Primeiro: " + primeiro);
        System.out.println("Segundo: " + segundo);
        System.out.println("Terceiro: " + terceiro);
    }


}
