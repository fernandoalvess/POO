package aulas.reuso.academico;

public class DemoAcademico {
    public static void main(String[] args) {
        RegistroAcademicoPosGraduacao reg1 = new RegistroAcademicoPosGraduacao("Fernando", "123456", "TI", "Título da Tese", "Orientador");
        System.out.println(reg1);

        RegistroAcademico regGrad = new RegistroAcademico("José", "65431", "TI");
        RegistroAcademicoPosGraduacao reg2 = new RegistroAcademicoPosGraduacao(regGrad, "Título da Tese", "Orientador");
        System.out.println(reg2);
    }
}
