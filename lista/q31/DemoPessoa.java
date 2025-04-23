package lista.q31;

public class DemoPessoa {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("João", 30);
        Politico pol = new Politico("José", 40, "PT");
        Governador gov = new Governador("Maria", 50, "PSDB", "SP");
        Prefeito pre = new Prefeito("Ana", 60, "PSOL", "São Paulo");

        System.out.println(p);
        System.out.println(pol);
        System.out.println(gov);
        System.out.println(pre);
    }
}
