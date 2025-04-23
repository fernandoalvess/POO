package lista.q8;

public class DemoLampada {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        lampada.Acende();
        System.out.println(lampada.MostraEstado());
        lampada.Apaga();
        System.out.println(lampada.MostraEstado());
        lampada.Acende();
        System.out.println(lampada.MostraEstado());
        System.out.println(lampada.EstaLigada());
        System.out.println("Lampada foi acessa " + lampada.QuantasVezesFoiAcesa() + " vez");
    }
}
