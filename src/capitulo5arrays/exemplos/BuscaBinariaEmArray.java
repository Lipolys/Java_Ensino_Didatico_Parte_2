package capitulo5arrays.exemplos;

import javax.swing.*;
import java.util.Arrays;
//import java.util.Random;

public class BuscaBinariaEmArray {
    public static void main (String[] args) {
        int[] numeros = new int[10000];
        String mensagem = "Numero não encontrado!";
        boolean flag = false;
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 1000);
            /*Random random = new Random();
            numeros[i] = random.nextInt();*/
        }
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um número inteiro menor que 1000: "));
        for (int i = 0; i < numeros.length && !flag; i++) {
            if (numeros[i] == numero) {
                mensagem = "Numero encontrado na posição: " + i;
                flag = true;
            }
        }

        System.out.println(mensagem);

        Arrays.sort(numeros);
        mensagem = "Numero encontrado na nova posição: " + Arrays.binarySearch(numeros, numero);
        System.out.println(mensagem);
    }
}
