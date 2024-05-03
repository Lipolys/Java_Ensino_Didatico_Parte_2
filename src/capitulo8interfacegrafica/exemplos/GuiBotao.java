package capitulo8interfacegrafica.exemplos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

public class GuiBotao extends JPanel {
    private JButton btMensagem, btTeimoso;
    private ImageIcon imagem;
    private Random sorteador = new Random();

    public GuiBotao () {
        inicializarComponentes();
        definirEventos();
    }

    private void inicializarComponentes() {
        setLayout(null);
        imagem = new ImageIcon("java.jpg");
        btMensagem = new JButton("Olá!");
        btMensagem.setBounds(50, 20, 140, 38);
        btTeimoso = new JButton("Tchau!");
        btTeimoso.setBounds(50, 70, 100, 25);
        btMensagem.setToolTipText("Clique aqui para ver a mensagem!");
        add(btMensagem);
        add(btTeimoso);
    }

    private void definirEventos() {
        ActionListener botao1Listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null, "Botão Mensagem");
            }
        };
        ActionListener botao2Listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null, "Botão Teimoso");
            }
        };

        MouseListener mouseListener = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {}
            @Override
            public void mousePressed(MouseEvent mouseEvent) {}
            @Override
            public void mouseReleased(MouseEvent mouseEvent) {}
            @Override
            public void mouseEntered(MouseEvent mouseEvent) {
                btTeimoso.setBounds(sorteador.nextInt(200), sorteador.nextInt(200), sorteador.nextInt(200) ,sorteador.nextInt(200));
            }
            @Override
            public void mouseExited(MouseEvent mouseEvent) {}
        };

        btMensagem.addActionListener(botao1Listener);
        btTeimoso.addActionListener(botao2Listener);
        btTeimoso.addMouseListener(mouseListener);
    }
}
