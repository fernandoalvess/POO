package lista.q28;

public class Equipamento {
    private boolean ligado;
    private String marca;

    public Equipamento() {
        this.ligado = false;
        this.marca = "";
    }

    public void liga() {
        this.ligado = true;
    }

    public void desliga() {
        this.ligado = false;
    }

    public boolean estaLigado() {
        return this.ligado;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Equipamento{" +
                "ligado=" + ligado +
                ", marca='" + marca + '\'' +
                '}';
    }
}
