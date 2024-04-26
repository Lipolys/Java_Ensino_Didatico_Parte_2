package Capitulo6_Metodos.Atividades;

import java.util.Arrays;
import java.util.Random;

public class Cap06Atividade05Metodo {
    public static int buscaValor (int[] array1, int[] array2, int valor) {
        boolean valor1, valor2;
        Arrays.sort(array1);
        Arrays.sort(array2);
        valor1 = (Arrays.binarySearch(array1, valor) >= 0);
        valor2 = (Arrays.binarySearch(array2, valor) >= 0);
        if (valor1 && valor2) {
            return 2;
        } else if (valor1 || valor2) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int[] geraArray (int tamanho) {
        Random gerador = new Random();
        int[] array = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            array[i] = gerador.nextInt(1001);
        }
        return array;
    }
}
