package aulas.colecoes.fila;
import java.util.PriorityQueue;

public class ExemploFila {
    public static void main(String[] args) {
        PriorityQueue<Double> fila = new PriorityQueue<>();
        fila.offer(5.5);
        fila.offer(4.5);
        fila.offer(3.5);
        fila.offer(2.5);
        fila.offer(1.5);

        System.out.println(fila);

        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
    }
}
