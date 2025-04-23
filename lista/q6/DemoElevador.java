package lista.q6;

public class DemoElevador {
    public static void main(String[] args) {
        Elevador elevador = new Elevador(6, 8);

        elevador.Entra();
        elevador.Sobe();
        elevador.Sai();
        elevador.Sobe();
        elevador.Entra();
        elevador.Desce();
        elevador.Entra();
        elevador.Desce();
        elevador.Sai();
        elevador.Sai();
    }
}
