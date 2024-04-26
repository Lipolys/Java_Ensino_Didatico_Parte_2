package Capitulo6_Metodos.Atividades;

import javax.swing.*;

public class Cap06Atividade03 {
    public static void main (String[] args) {
        String data = "26/04/2024";
        String dataTela = "Dia: " + Cap06Atividade03Metodo.getDia(data) + "\nMês: " + Cap06Atividade03Metodo.getMes(data) + "\nAno: " + Cap06Atividade03Metodo.getAno(data);
        JOptionPane.showMessageDialog(null, dataTela);
    }
}
