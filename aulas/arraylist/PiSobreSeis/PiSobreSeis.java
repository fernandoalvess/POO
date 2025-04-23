package aulas.arraylist.PiSobreSeis;

class PiSobreSeis {
    public static void main(String[] args) {
        double[] termosDaSerie = new double[1000000];
        for (int i = 0; i < termosDaSerie.length; i++) {
            termosDaSerie[i] = 1.0 / Math.pow(i + 1, 2);
        }

        for (int num = 10; num <= 1000000; num *= 10) {
            calculaEMostraSomatorio(termosDaSerie, num);
        }
    }

    public static void calculaEMostraSomatorio(double[] vetor, int num){
        double somatorio = 0.0;
        for (int i = 0; i < num; i++) {
            somatorio += vetor[i];
        }
        System.out.println("A soma dos " + num + " primeiros termos é " + somatorio);

    }

    
}