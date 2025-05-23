package aulas.abstrata.controleUniversal;

public class Carro extends Terrestre{
    private String placa;

    public Carro(int capacidade, int qntRodas, String placa) {
        super(capacidade, qntRodas);
        this.placa = placa;
    }

    public Carro(String placa) {
        super(5, 4);
        this.placa = placa;
    }

    public void moverFrente(){
        System.out.println("Carro movendo para frente");
    }

    @Override
    public String toString() {
        return super.toString() + ", Placa: " + placa;
    }
}
