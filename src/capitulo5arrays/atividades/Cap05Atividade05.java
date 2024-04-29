package capitulo5arrays.atividades;

import javax.swing.*;

public class Cap05Atividade05 {
    public static void main (String[] args) {
        Object[] opcoes = {"1 - Entrada", "2 - Saída", "3 - Listar", "4 - Encerrar"};
        String[] placas = {"","","","","","","","","","",};
        boolean saida = false;
        int vaga;
        try {
            do {
                String opcao = (String) JOptionPane.showInputDialog(null,
                        "Selecione uma opção: ",
                        "Menu", JOptionPane.PLAIN_MESSAGE,
                        null,
                        opcoes,
                        "1 - Entrada");
                switch (opcao) {
                    case "1 - Entrada" -> {
                        vaga = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a vaga você está ocupando: "));
                        if (placas[vaga - 1].isBlank()) {
                            placas[vaga - 1] = JOptionPane.showInputDialog(null, "Insira a placa do seu veículo: ");
                        } else {
                            JOptionPane.showMessageDialog(null, "Esta vaga já está ocupada!");
                        }
                    }
                    case "2 - Saída" -> {
                        vaga = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a vaga que você está desocupando: "));
                        placas[vaga - 1] = "";
                    }
                    case "3 - Listar" -> {
                        String mensagem = "";
                        for (int i = 0; i < 10; i++) {
                            mensagem += "Vaga " + (i + 1) + ": " + placas[i] + "\n";
                        }
                        JOptionPane.showMessageDialog(null, mensagem, "Situacao", JOptionPane.INFORMATION_MESSAGE);
                    }
                    case "4 - Encerrar" -> saida = true;
                }
            } while (!saida);
        } catch (NullPointerException | NumberFormatException ignored) {

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: " + e);
        }
        System.exit(0);
    }
}
