package capitulo5arrays.exemplos;

import javax.swing.*;

public class BuscaEmArray {
    public static void main (String[] args) {
        String[] cores = {"Verde", "Vermelho", "Amarelo", "Azul", "Roxo", "Branco"};
        String cor = JOptionPane.showInputDialog(null, "Insira uma cor: ");
        String mensagem = "Cor não encontrada";
        boolean flag = false;
        for (int i = 0; i < cores.length && !flag; i++) {
            if (cor.equalsIgnoreCase(cores[i])) {
                mensagem = "Cor encontrada!";
                flag = true;
            }
        }
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
