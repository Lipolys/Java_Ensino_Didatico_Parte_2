package capitulo6metodos.exemplos;

public class MetodosExternos {
    public static void main (String[] args) {
        MetodoSemRetorno.imprimirTexto("Imprimindo texto usando um método de outra classe");
        long soma = Math.round(MetodosComRetorno.somar(10, 20));
        System.out.println(MetodosComRetorno.mostrarDiaPorExtenso(5));
        System.out.println(MetodosComRetorno.contarLetrasA("Mancada"));
        System.out.println(soma);
    }
}
