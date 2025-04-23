package aulas.classes.evento;

public class EventoAcademico {
    private String nomeDoEvento;
    private String localDoEvento;
    private int numeroDeParticipantes;

    EventoAcademico(String n, String l, int p){
        nomeDoEvento = n;
        localDoEvento = l;
        if (p < 0){
            numeroDeParticipantes = 0;
        } else
        numeroDeParticipantes = p;

    }

    public void mostraEvento(){
        System.out.println("Nome: " + nomeDoEvento);
        System.out.println("Local: " + localDoEvento); 
        System.out.println("Número de participantes: " + numeroDeParticipantes);
    }
}
