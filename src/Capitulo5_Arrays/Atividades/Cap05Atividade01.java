package Capitulo5_Arrays.Atividades;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Cap05Atividade01 {
    public static void main (String[] args) {
        double[] notas = new double[5];
        String mensagemSaida = "";
        double media = 0;
        for (int i = 0; i < notas.length; i++) {
            notas[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a " + (i + 1) + "ª nota:"));
        }
        Arrays.parallelSort(notas);
        for (double nota:notas) {
            mensagemSaida += String.valueOf(nota) + "; ";
            media += nota;
        }
        media = media / notas.length;
        JOptionPane.showMessageDialog(null, "Notas: " + mensagemSaida + "\nMedia das notas: " + media);
    }
}
