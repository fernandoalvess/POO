package aulas.classes.igualdade;

public class DemoIgual {
    public static void main(String[] args) {
        if(Igual.ehIgual(2, 3)) {
            System.out.println("Inteiros iguais");
        } else {
            System.out.println("Inteiros diferentes");
        }

        if(Igual.ehIgual("UFERSA", "UERN")) {
            System.out.println("String's iguais");
        } else {
            System.out.println("String's diferentes");
        }

        if(Igual.ehIgual(2.0, 2.0)) {
            System.out.println("Double's iguais");
        } else {
            System.out.println("Double's diferentes");
        }
    }
}
