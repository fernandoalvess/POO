package lista.q9;

public class Complexo {
    private int real;
    private int imaginario;

    Complexo(int real, int imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }

    Complexo(int real) {
        this.real = real;
        this.imaginario = 0;
    }

    Complexo() {
        this.real = 0;
        this.imaginario = 0;
    }

    public String toString() {
        return real + " + " + imaginario + "i";
    }

}
