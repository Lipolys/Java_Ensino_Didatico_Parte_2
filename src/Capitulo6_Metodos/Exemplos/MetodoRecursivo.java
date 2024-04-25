package Capitulo6_Metodos.Exemplos;

public class MetodoRecursivo {
    public static void main (String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + "! = " + calcularFatorial(i));
        }
    }

    public static long calcularFatorial(long num) {
        if (num <= 1) {
            return (1);
        } else {
            return (num * calcularFatorial(num - 1));
        }
    }
}
