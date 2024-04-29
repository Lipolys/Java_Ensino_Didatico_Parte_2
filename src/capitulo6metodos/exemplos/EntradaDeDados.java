package capitulo6metodos.exemplos;

import javax.swing.*;

public class EntradaDeDados {
    static String aux = "";
    static boolean flag = false;
    public static int lerInteiro (int minimo, int maximo, String mensagem) {
        int n = 0;
        flag = true;
        while (flag) {
            try {
                aux = JOptionPane.showInputDialog(null, mensagem);
                n = Integer.parseInt(aux);
                if (n < minimo || n > maximo) {
                    JOptionPane.showMessageDialog(null, "Insira um valor dentro da faixa permitida!\nMínimo: " + minimo + "\nMáximo: " + maximo);
                } else {
                    flag = false;
                }
            } catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Digite apenas valores numéricos condizentes com o tipo solicitado!!!\n" + e);
            } catch (NullPointerException ignored) {}
        }
        return n;
    }

    public static float letFloat (float minimo, float maximo, String mensagem) {
        float n = 0;
        flag = true;
        while (flag) {
            try {
                aux = JOptionPane.showInputDialog(null, mensagem);
                n = Float.parseFloat(aux);
                if (n < minimo || n > maximo) {
                    JOptionPane.showMessageDialog(null, "Insira um valor dentro da faixa permitida!\nMínimo: " + minimo + "\nMáximo: " + maximo);
                } else {
                    flag = false;
                }
            } catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Digite apenas valores numéricos condizentes com o tipo solicitado!!!\n" + e);
            } catch (NullPointerException ignored) {}
        }
        return n;
    }

    public static double lerDouble (double minimo, double maximo, String mensagem) {
        double n = 0;
        flag = true;
        while (flag) {
            try {
                aux = JOptionPane.showInputDialog(null, mensagem);
                n = Double.parseDouble(aux);
                if (n < minimo || n > maximo) {
                    JOptionPane.showMessageDialog(null, "Insira um valor dentro da faixa permitida!\nMínimo: " + minimo + "\nMáximo: " + maximo);
                } else {
                    flag = false;
                }
            } catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Digite apenas valores numéricos condizentes com o tipo solicitado!!!\n" + e);
            } catch (NullPointerException ignored) {}
        }
        return n;
    }

    public static String lerString (String mensagem) {
        return JOptionPane.showInputDialog(null, mensagem);
    }

    public static boolean SelecionarOpcaoBinaria (String mensagem) {
        Object[] opcoes = {"Sim", "Não"};
        String resposta = (String) JOptionPane.showInputDialog(null, mensagem, "Selecione uma opção:", JOptionPane.PLAIN_MESSAGE, null, opcoes, "Não");
        return (resposta.equals("Sim"));
    }
}
