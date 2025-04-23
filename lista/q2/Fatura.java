package lista.q2;

class Fatura {
    int numeroIdentificacao;
    String descricao;
    int quantidadeComprada;
    double preco;

    Fatura(int ident, String desc, int quant, double p) {
        numeroIdentificacao = ident;
        descricao = desc;
        quantidadeComprada = quant;
        preco = p;

        if (quantidadeComprada < 0) {
            quantidadeComprada = 0;
        }

        if (preco < 0) {
            preco = 0.0;
        }
    }

    double calculaTotal(){
        return quantidadeComprada * preco;
    }


}
