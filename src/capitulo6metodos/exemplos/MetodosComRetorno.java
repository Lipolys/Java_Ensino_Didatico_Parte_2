package capitulo6metodos.exemplos;

public class MetodosComRetorno {
    public static void main (String[] args) {
        System.out.println(MetodosComRetorno.somar(2, 3));
        System.out.println(MetodosComRetorno.mostrarPares(100));
        System.out.println(MetodosComRetorno.mostrarDiaPorExtenso(1));
        System.out.println(MetodosComRetorno.contarLetrasA("Banana"));
    }
    public static double somar (double a, double b) {
        return a + b;
    }

    public static String mostrarPares(int valor) {
        String retorno = "";
        for (int i = 0; i < valor; i = i +2) {
            retorno += i + ", ";
        }
        return retorno;
    }

    public static String mostrarDiaPorExtenso (int data) {
        String extenso;
        switch (data) {
            case 1: extenso = "Domingo"; break;
            case 2: extenso = "Segunda-feira"; break;
            case 3: extenso = "Terça-feira"; break;
            case 4: extenso = "Quarta-feira"; break;
            case 5: extenso = "Quinta-feira"; break;
            case 6: extenso = "Sexta-feira"; break;
            case 7: extenso = "Sábado"; break;
            default: extenso = "Dia não reconhecido";
        }
        return extenso;
    }

    public static int contarLetrasA (String palavra) {
        int quantidade = 0;
        palavra = palavra.toUpperCase();
        for (int i = 0; i < palavra.length(); i++) {
            if (palavra.charAt(i) == 'A') {
                quantidade++;
            }
        }
        return quantidade;
    }
}
