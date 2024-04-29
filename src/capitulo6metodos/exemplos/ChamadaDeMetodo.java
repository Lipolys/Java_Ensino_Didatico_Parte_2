package capitulo6metodos.exemplos;

import javax.swing.*;

public class ChamadaDeMetodo {
    public static void main (String[] args) {
        String nome = EntradaDeDados.lerString("Insira seu nome: ");
        int idade = EntradaDeDados.lerInteiro(0, 150, "Insira sua idade: ");
        float altura = EntradaDeDados.letFloat(0, 2.5f, "Insira sua altura: ");
        double peso = EntradaDeDados.lerDouble(0, 300, "Insira seu peso: ");
        String opcao = (EntradaDeDados.SelecionarOpcaoBinaria("Você gosta de Java?")) ? "Eu também gosto de Java!" : "Sinto muito... Já experimentou C#?";
        JOptionPane.showMessageDialog(null, "Nome: " + nome +
                "\nIdade: " + idade +
                "\nAltura: " + altura +
                "\nPeso: " + peso +
                "\n" + opcao);
    }
}
