package Capitulo5_Arrays.Exemplos;

import java.text.DecimalFormat;

public class CriandoArrays {
    public static void main (String[] args) {
        int[] numeros = new int[10];
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("000");
        for (int i = 0; i < 10; i++) {
            numeros[i] = (int) (Math.random() * 1000);
            System.out.println(df.format(numeros[i]));
        }
    }
}
