package lista.q28;

public class Computador extends Equipamento {
    private String marcaProcessador;
    private String marcaPlacaVideo;

    public Computador() {
        super();
        this.marcaProcessador = "";
        this.marcaPlacaVideo = "";
    }

    public String getMarcaProcessador() {
        return marcaProcessador;
    }

    public void setMarcaProcessador(String marcaProcessador) {
        this.marcaProcessador = marcaProcessador;
    }

    public String getMarcaPlacaVideo() {
        return marcaPlacaVideo;
    }

    public void setMarcaPlacaVideo(String marcaPlacaVideo) {
        this.marcaPlacaVideo = marcaPlacaVideo;
    }

    @Override
    public String toString() {
        return super.toString() + "Computador{" +
                "marcaProcessador='" + marcaProcessador + '\'' +
                ", marcaPlacaVideo='" + marcaPlacaVideo + '\'' +
                '}';
    }

}
