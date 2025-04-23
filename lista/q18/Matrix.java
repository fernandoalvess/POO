package lista.q18;

public class Matrix {
    private static final int linha = 2;
    private static final int coluna = 2;
    private float[][] matrix;

    public Matrix() {
        matrix = new float[linha][coluna];
        float valor = 1.5f;

        for (int l = 0; l < matrix.length; l++) {
            for (int c = 0; c < matrix[l].length; c++) {
                matrix[l][c] = valor;
                valor = valor + 1.0f;
            }
        }
    }

    public float calculaDeterminante() {
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }

    public String toString() {
        String rep ="";
        for (int l = 0; l < matrix.length; l++) {
            for (int c = 0; c < matrix[l].length; c++) {
                rep += matrix[l][c] + "  ";
            }
            rep += "\n";
        }
        return rep;
    }

    
}
