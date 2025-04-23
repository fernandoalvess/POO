package lista.q29;

public class TesteEventos {
    public static void main(String[] args) {
        EventoDelegacao eventoDelegacao = new EventoDelegacao(16, 3, 2025, 14, 30, "Reunião de Projeto");
        EventoHeranca eventoHeranca = new EventoHeranca(17, 3, 2025, 10, 0, "Apresentação de Trabalho");

        System.out.println(eventoDelegacao);
        System.out.println(eventoHeranca);
    }
}