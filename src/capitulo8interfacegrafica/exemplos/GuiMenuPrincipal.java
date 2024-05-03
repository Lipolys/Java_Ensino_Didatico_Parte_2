package capitulo8interfacegrafica.exemplos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GuiMenuPrincipal extends JFrame {
    private Container contentPane;
    private JMenuBar menuBar;
    private JMenu menuArquivo, menuExemplo;
    private JMenuItem miSair, miBotao;

    public GuiMenuPrincipal (){
        inicializarComponentes();
        definirEventos();
    }

    private void inicializarComponentes() {
        setTitle("Menu Principal");
        setBounds(0, 0, 800, 600);
        contentPane = getContentPane();
        menuBar = new JMenuBar();
        menuArquivo = new JMenu("Arquivo");
        menuExemplo = new JMenu("Exemplo");
        miSair = new JMenuItem("Sair");
        miSair.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
        miBotao = new JMenuItem();
        menuArquivo.add(miSair);
        menuExemplo.add(miBotao);
        menuBar.add(menuArquivo);
        menuBar.add(menuExemplo);
        setJMenuBar(menuBar);
    }

    private void definirEventos() {
        ActionListener sairListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        };
        ActionListener botaoListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                GuiBotao botao = new GuiBotao();
                contentPane.removeAll();
                contentPane.add(botao);
                contentPane.validate();
            }
        };
        miSair.addActionListener(sairListener);
        miBotao.addActionListener(botaoListener);
    }

    public static void abrir () {
        GuiMenuPrincipal frame = new GuiMenuPrincipal();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation((tela.width - frame.getSize().width) / 2, (tela.height - frame.getSize().height) / 2);
        frame.setVisible(true);
    }
}
