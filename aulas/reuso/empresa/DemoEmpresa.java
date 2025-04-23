package aulas.reuso.empresa;

public class DemoEmpresa {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("José", "1234");
        System.out.println(p);

        Funcionario f = new Funcionario("Barbara", "12345", 2000.00F);
        System.out.println(f);

        ChefeDeDepartamento c = new ChefeDeDepartamento("Fernando", "123456", 10000.00F, "TI");
        System.out.println(c);
    }
}