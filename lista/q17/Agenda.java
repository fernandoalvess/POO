package lista.q17;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<EntradaEmAgenda> agenda;

    public Agenda() {
        this.agenda = new ArrayList<>();
    }

    public void adicionarCompromisso(EntradaEmAgenda entrada) {
        agenda.add(entrada);
    }

    public void listaDia(int dia, int mes, int ano) {
        System.out.println("Compromisso no dia "+ dia + "/" + mes + "/" + ano + ":");
        for (EntradaEmAgenda entrada : agenda) {
            if (entrada.ehNoDia(dia, mes, ano)) {
                System.out.println(entrada);
            }
        }
    }

}
