package lista.q17;

public class DemoAgenda {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        agenda.adicionarCompromisso(new EntradaEmAgenda(20, 01, 04, 2025, "Meu aniversário!"));
        agenda.adicionarCompromisso(new EntradaEmAgenda(14, 01, 04, 2025, "Aula faculdade"));
        agenda.adicionarCompromisso(new EntradaEmAgenda(13, 02, 04, 2025, "Reunião!"));

        agenda.listaDia(01, 04, 2025);
    }
}
