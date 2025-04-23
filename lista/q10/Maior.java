package lista.q10;

public class Maior {
    
    public static double maiorDe2(double n1, double n2) {
        return n1 > n2 ? n1 : n2;
    }
    
    public static double maiorDe3(double n1, double n2, double n3) {
        return maiorDe2(n1, maiorDe2(n2, n3));
    }

    public static double maiorDe4(double n1, double n2, double n3, double n4) {
        return maiorDe2(maiorDe3(n1, n2, n3), n4);
    }

    public static double maiorDe5(double n1, double n2, double n3, double n4, double n5) {
        return maiorDe2(maiorDe4(n1, n2, n3, n4), n5);
    }
}
