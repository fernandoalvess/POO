package aulas.classes.unidades;

public class DemoCoversao {
    public static void main(String[] args) {
        System.out.println("3.5 polegadas = " + CoversaoUnidade.polegadasParaCentimetro(3.5f) + " centímetros");
        System.out.println("3.5 pes = " + CoversaoUnidade.pesParaCentimetro(3.5f) + " centímetros");
        System.out.println("3.5 milhas = " + CoversaoUnidade.milhasParaKm(3.5f) + " centímetros");
        
    }
}
