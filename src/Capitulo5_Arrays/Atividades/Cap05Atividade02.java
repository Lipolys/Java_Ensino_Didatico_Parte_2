package Capitulo5_Arrays.Atividades;

import javax.swing.*;
import java.util.Random;

public class Cap05Atividade02 {
    public static void main (String[] args) {
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        Random sorteador = new Random();
        JOptionPane.showMessageDialog(null, "Mês sorteado: " + meses[sorteador.nextInt(12)]);
    }
}
