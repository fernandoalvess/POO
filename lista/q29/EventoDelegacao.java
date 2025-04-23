package lista.q29;

public class EventoDelegacao extends DataHora {
    private String evento;

    public EventoDelegacao(int dia, int mes, int ano, int hora, int minuto, String evento) {
        super(dia, mes, ano, hora, minuto);
        this.evento = evento;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    @Override
    public String toString() {
        return "Evento: " + evento + ", Data e Hora: " + super.toString();
    }
}