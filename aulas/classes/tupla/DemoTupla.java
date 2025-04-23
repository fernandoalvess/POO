package aulas.classes.tupla;

public class DemoTupla {
    public static void main(String[] args) {
        Tupla<Double, String> t1 = new Tupla<>(2.3, "TESTE");
        System.out.println("Tupla: " + t1.getPrimeiro() + ", " + t1.getSegundo());

        Tupla<Character, Integer> t2 = new Tupla<>('A', 4);
        System.out.println("Tupla: " + t2.getPrimeiro() + ", " + t2.getSegundo());
    }
}
