package Capitulo6_Metodos.Exemplos;

public class MetodoSemRetorno {
    public static void main (String[] args) {
        imprimir();
        imprimirTexto("Ola");
        mostrarQuadrado(10);
        somar(10, 20);
        mostrarMaior(10, 20, 30);
        mostrarSextoPorExtenso('F');
    }
    public static void imprimir() {
        System.out.println("Aprendendo a linguagem Java");
    }

    public static void imprimirTexto (String texto) {
        System.out.println(texto);
    }

    public static void mostrarQuadrado (int x) {
        System.out.println(Math.pow(x, 2));
    }

    public static void somar (int x, int y) {
        System.out.println(x + y);
    }
     public static void mostrarMaior (int x, int y, int z) {
        System.out.println(Math.max(x, Math.max(y,z)));
     }

     public static void mostrarSextoPorExtenso (char sexo) {
        switch (sexo) {
            case 'F': System.out.println("Feminino"); break;
            case 'M': System.out.println("Masculino"); break;
            default: System.out.println("Sexo não listado");
        }
     }
}