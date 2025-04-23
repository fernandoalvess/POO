package aulas.arraylist.pascal;

import java.util.Scanner;

public class Pascal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nLinhas, coluna;

        System.out.print("Digite o número de linhas do triângulo de Pascal: ");
        nLinhas = sc.nextInt();
        int[][] triang = new int[nLinhas][];

        for (int l = 0; l < nLinhas; l++) {
            coluna = l + 2;
            triang[l] = new int[coluna];
            triang[l][0] = 1;
            triang[l][coluna -1] = 1;
            for (int c = 1; c < triang[l].length - 1; c++) {
                triang[l][c] = triang[l - 1][c] + triang[l - 1][c - 1];
            }
        }

        for (int l = 0; l < triang.length; l++) {
            for (int c = 0; c < triang[l].length; c++) {
                System.out.print(triang[l][c] + " ");
            }
            System.out.println();
        }

        sc.close();

    }
}
