package Capitulo5_Arrays.Atividades;

import java.util.Random;

public class Cap05Atividade04 {
    public static void main (String[] args) {
        int[] impar = new int[10], par = new int[10];
        int  indicePar = 0, indiceImpar = 0, numeroGerado;

        Random gerador = new Random();
        while (indicePar < 10) {
            numeroGerado = gerador.nextInt(20) + 1;
            if (numeroGerado % 2 == 0) {
                par[indicePar++] = numeroGerado;
            }
        }
        while (indiceImpar < 10) {
            numeroGerado = gerador.nextInt(20) + 1;
            if (!(numeroGerado % 2 == 0)) {
                impar[indiceImpar++] = numeroGerado;
            }
        }
        System.out.print("Array par: ");
        for (int j : par) {
            System.out.print(j + ", ");
        }
        System.out.print("\nArray impar: ");
        for (int j : impar) {
            System.out.print(j + ", ");
        }
    }
}
