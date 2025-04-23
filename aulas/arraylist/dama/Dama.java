package aulas.arraylist.dama;

public class Dama {
    private static final int LINHAS = 8;
    private static final int COLUNAS = 8;
    private char[][] tabuleiro;

    public Dama() {
        tabuleiro = new char[LINHAS][COLUNAS];
        for (int l = 0; l < tabuleiro.length; l++) {
            for (int c = 0; c < tabuleiro[l].length; c++) {
                tabuleiro[l][c] = '.';
            }
        }
        //time 'o'
        for (int l = 0; l <=2; l++) {
            int comeco = (l % 2 == 0) ? 1 : 0;
            for (int c = comeco; c < tabuleiro[l].length; c+=2) {
                tabuleiro[l][c] = 'o';
            }
        }

        //time 'x'
        for (int l = 5; l <=7; l++) {
            int comeco = (l % 2 == 0) ? 1 : 0;
            for (int c = comeco; c < tabuleiro[l].length; c+=2) {
                tabuleiro[l][c] = 'x';
            }
        }
    }

    public String toString() {
        String rep ="";
        for (int l = 0; l < tabuleiro.length; l++) {
            for (int c = 0; c < tabuleiro[l].length; c++) {
                rep += tabuleiro[l][c] + "  ";
            }
            rep += "\n";
        }
        return rep;
    }
}
