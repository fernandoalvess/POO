package lista.q1;

public class Corinthians {
    String nome;
    int jogos, vitorias, empates, derrotas;

    void times (String n, int j, int v, int e, int d){
        nome = n;
        jogos = j;
        vitorias = v;
        empates = e;
        derrotas = d;
    }

    int pontos(){
        return vitorias*3 + empates;
    }

    void imprimirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Jogos: " + jogos);
        System.out.println("Vitórias: " + vitorias);
        System.out.println("Empates: " + empates);
        System.out.println("Derrotas: " + derrotas);
        System.out.println("Pontos: " + pontos());
    }

}
