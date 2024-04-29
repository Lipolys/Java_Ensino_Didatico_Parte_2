package capitulo6metodos.exemplos;

import java.util.Arrays;

public class MetodosComArray {

    /**
     * Recebe um array de numeros reais e retorno o maior deles.
     * Deve ter pelo menos um valor no array, caso contrário gerará um erro
     *
     * @param numeros = os numeros a serem comparados
     * @return = o maior número
     */
    public static double buscarMaior (double[] numeros) {
        double maior = numeros[0];
        for (double numero : numeros) {
            maior = Math.max(maior, numero);
        }
        return maior;
    }

    /**
     * Recebe um array de palavras e retorna ordenados em ordem alfabética
     *
     * @param palavras = as palavras a serem comparadas
     * @return = o array ordenado
     */
    public static String[] ordenarPalavras (String[] palavras) {
        Arrays.sort(palavras);
        return palavras;
    }
}
