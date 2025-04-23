package lista.q3;

class Alunos {
    int matricula;
    String nome;
    double nota1;
    double nota2;
    double notaTrabalho;
    double mp, ef;

    Alunos(int mat, String n, double n1, double n2, double nt) {
        matricula = mat;
        nome = n;
        nota1 = n1;
        nota2 = n2;
        notaTrabalho = nt;
    }

    double media(){
        nota1 = nota1 * 2.5;
        nota2 = nota2 * 2.5;
        notaTrabalho = notaTrabalho * 2;
        mp = (nota1 + nota2 + notaTrabalho) / 7;
        return mp;
    }

    double provaFinal(){
        if (mp < 3 || mp >=7){
            return 0;
        } else {
            return ef = (5 * 10 - mp * 6) / 4;
        }
    }    
}
