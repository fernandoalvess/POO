package lista.q29;

public class EventoHeranca extends DataHora {
    private String evento;

    public EventoHeranca(int dia, int mes, int ano, int hora, int minuto, String evento) {
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