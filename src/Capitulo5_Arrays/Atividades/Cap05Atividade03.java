package Capitulo5_Arrays.Atividades;

import java.util.Random;

public class Cap05Atividade03 {
    public static void main (String[] args) {
        int[][] pixels = new int[40][40];
        Random gerador = new Random();
        for (int i = 0; i < pixels.length; i++) {
            for (int j = 0; j < pixels[i].length; j++) {
                pixels[i][j] = gerador.nextInt(256);
            }
        }
        for (int[] pixel : pixels) {
            for (int i : pixel) {
                if (i < 10) System.out.print(i + "  | ");
                else if (i < 100) System.out.print(i + " | ");
                else if (i < 1000) System.out.print(i + "| ");
            }
            System.out.println();
        }
    }
}
