package capitulo6metodos.atividades;

import javax.swing.*;

public class Cap06Atividade01 {
    public static void main (String[] args) {
        while(true) {
            int mes = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um mês válido entre 1 e 12"));
            int idioma = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um idioma!\n1 para Português.\n2 para Inglês"));
            JOptionPane.showMessageDialog(null, Cap06Atividade01Metodo.getMesPorExtenso(mes, idioma));
        }
    }
}
