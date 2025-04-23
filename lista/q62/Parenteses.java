package lista.q62;

import java.util.Stack;

public class Parenteses {
    public static boolean estaBalanceado(String expressao) {
        Stack<Character> pilha = new Stack<>();

        for (char c : expressao.toCharArray()) {
            if (c == '(') {
                pilha.push(c);
            } else if (c == ')') {
                if (pilha.isEmpty()) {
                    return false;
                }
                pilha.pop();
            }
        }
        return pilha.isEmpty();
    }

    public static void main(String[] args) {
        String[] exemplos = {"(()()()())", "(((())))", "(()((())()))", "((((((())", "(()()(()"};

        for (String exemplo : exemplos) {
            System.out.println(estaBalanceado(exemplo));
        }
    }
}
