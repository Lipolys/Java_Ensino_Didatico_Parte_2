package capitulo7orientacaoaobjetos.exemplos;

import javax.swing.*;

public class UsaPessoaPolimorfa {
    public static void main (String[] args) {
        Pessoa pessoa;
        int tipo = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um valor de 1 a 4"));
        pessoa = switch (tipo) {
            case 1 -> new Pessoa();
            case 2 -> new PessoaFisica();
            case 3 -> new PessoaJuridica();
            case 4 -> new Funcionario();
            default -> null;
        };
        pessoa.mostraClasse();
    }
}
