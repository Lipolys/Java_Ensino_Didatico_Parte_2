package Capitulo5_Arrays.Exemplos;

import java.util.Arrays;

public class OrdenacaoDeArrays {
    public static void main (String[] args) {
        String[] nomes = {"Lucas", "Fernando", "Jose", "Priscila", "Tereza", "Aipo"};
        float[] pontosFlutuantes = {1.3f, 0.3f, 4.53f, 88.9f, 6.453f, 56.44f, 9.4f};
        char[] vogais = {'u', 'e', 'o', 'a', 'i'};
        int [] notas = {9, 2, 6, 7, 5, 3, 4, 8, 1, 0};
        Arrays.sort(nomes);
        System.out.print("Nomes: ");
        for (String nome:nomes) {
            System.out.print(nome + ", ");
        }
        Arrays.sort(vogais);
        System.out.print("\nVogais: ");
        for (char vogal:vogais) {
            System.out.print(vogal + ", ");
        }
        Arrays.sort(notas);
        System.out.print("\nNotas: ");
        for (int nota:notas) {
            System.out.print(nota + ", ");
        }
        Arrays.sort(pontosFlutuantes);
        System.out.print("\nPontos Flutuantes: ");
        for (float pontosFlutuante:pontosFlutuantes) {
            System.out.print(pontosFlutuante + ", ");
        }
    }
}
