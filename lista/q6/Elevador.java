package lista.q6;

public class Elevador {
    private int andarAtual;
    private int totalAndares;
    public  int capacidade;
    public  int pessoas;

    Elevador (int totalAndares, int capacidade) {
        this.capacidade = capacidade;
        this.totalAndares = totalAndares;
        this.andarAtual = 0;
    }

    public void Entra() {
        if (pessoas < capacidade) {
            pessoas++;
            System.out.println("Entrou uma pessoa. Total: " + pessoas);
        } else {
            System.out.println("Elevador cheio!");
        }
    }

    public void Sai() {
        if (pessoas > 0) {
            pessoas--;
            System.out.println("Saiu uma pessoa. Total: " + pessoas);
        } else {
            System.out.println("Elevador vazio!");
        }
    }

    public void Sobe() {
        if (andarAtual < totalAndares) {
            andarAtual++;
            System.out.println("Subindo...");
            System.out.println("Andar atual: " + andarAtual);
        } else {
            System.out.println("Elevador no último andar!");
        }
    }

    public void Desce() {
        if (andarAtual > 0) {
            andarAtual--;
            System.out.println("Descendo...");
            System.out.println("Andar atual: " + andarAtual);
        } else {
            System.out.println("Elevador no térrio!");
        }
    }
}
