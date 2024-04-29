package capitulo6metodos.exemplos;

public class MetodoSobrecarregado {
    public static void main (String[] args) {
        System.out.println("Área de um quadrado: " + calcularArea(2));
        System.out.println("Área de um retâgulo: " + calcularArea(2, 3));
        System.out.println("Área de um cubo: " + calcularArea(3, 2, 4));
    }

    public static double calcularArea (int x) {
        return Math.pow(x, 2);
    }

    public static double calcularArea (int x, int y) {
        return x * y;
    }

    public static double calcularArea (int x, int y, int z) {
        return x * y * z;
    }
}
