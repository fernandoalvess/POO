package lista.q11;

public class DemoRegistroAcademico {
    public static void main(String[] args) {
        double mensalidade;
        RegistroAcademico michael = new RegistroAcademico();
        michael.inicializaRegistroAcademico("Michael", 3, 0.5);
        michael.imprimeRegistroAcademico();  
        mensalidade = michael.calculaMensalidade();
        System.out.println("Mensalidade 1: " + mensalidade);
        // michael.percentualDeCobranca = 0.75;
        mensalidade = michael.calculaMensalidade();
        System.out.println("Mensalidade 2: " + mensalidade);
        System.out.println('\n');

        RegistroAcademico joao = new RegistroAcademico();
        joao.inicializaRegistroAcademico("João", 2, 0.25);
        joao.imprimeRegistroAcademico();
        mensalidade = joao.calculaMensalidade();
        System.out.println("Mensalidade 1: " + mensalidade);
        System.out.println("Mensalidade 2: " + mensalidade);
        System.out.println('\n');


        RegistroAcademico roberto = new RegistroAcademico();
        roberto.inicializaRegistroAcademico("Roberto", 1, 0.75);
        roberto.imprimeRegistroAcademico();
        mensalidade = roberto.calculaMensalidade();
        System.out.println("Mensalidade 1: " + mensalidade);
        System.out.println("Mensalidade 2: " + mensalidade);

    }
}
