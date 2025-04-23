package lista.q17;

public class EntradaEmAgenda {
    private int hora, dia, mes, ano;
    private String descricao;

    public EntradaEmAgenda(int hora, int dia, int mes, int ano, String descricao) {
        this.hora = hora;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.descricao = descricao;
    }

    public String toString() {
        return "Data: " + dia + "/" + mes + "/" + ano + " Hora: " + hora + "h | Descricao: " + descricao;
    }

    public boolean ehNoDia (int dia, int mes, int ano) {
        return this.dia == dia && this.mes == mes && this.ano == ano;
    }
    
}
