package lista.q28;

public class TestaEquipamento {
    public static void main(String[] args) {
        Equipamento equipamento = new Equipamento();
        Computador computador = new Computador();

        equipamento.setMarca("Dell");
        equipamento.liga();
        System.out.println(equipamento);

        computador.setMarca("Dell");
        computador.setMarcaProcessador("Intel");
        computador.setMarcaPlacaVideo("Nvidia");
        computador.liga();
        System.out.println(computador);
    }
}
