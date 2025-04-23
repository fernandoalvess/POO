package lista.q41;

import lista.q40.FiguraGeometrica;

public class Desenho {
    private FiguraGeometrica figura1;
    private int xFig1, yFig1;
    private FiguraGeometrica figura2;
    private int xFig2, yFig2;
    
    public Desenho(FiguraGeometrica figura1, int xFig1, int yFig1, FiguraGeometrica figura2, int xFig2, int yFig2) {
        this.figura1 = figura1;
        this.xFig1 = xFig1;
        this.yFig1 = yFig1;
        this.figura2 = figura2;
        this.xFig2 = xFig2;
        this.yFig2 = yFig2;
    }

    public void apresenta() {
        figura1.descricao();
        System.out.println("Coordenadas: (" + xFig1 + ", " + yFig1 + ")");
        figura2.descricao();
        System.out.println("Coordenadas: (" + xFig2 + ", " + yFig2 + ")");
    }

    
}
