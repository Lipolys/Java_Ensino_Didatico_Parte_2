package capitulo8interfacegrafica.exemplos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GuiLogin extends JFrame {
    private JTextField tfLogin;
    private JPasswordField psSenha;
    private JLabel lbLogin;
    private JLabel lbSenha;
    private JButton btLogar;
    private JButton btCancelar;
    private static GuiLogin frame;

    public GuiLogin () {
        inicializarComponentes();
        definirEventos();
    }

    private void inicializarComponentes() {

        setTitle("Login do Sistema");
        setBounds(0, 0, 250, 200);
        setLayout(null);
        tfLogin = new JTextField(5);
        psSenha = new JPasswordField(5);
        lbLogin = new JLabel("Login: ");
        lbSenha = new JLabel("Senha: ");
        btCancelar = new JButton("Cancelar");
        btLogar = new JButton("Entrar");
        tfLogin.setBounds(100, 30, 120, 25);
        lbLogin.setBounds(30, 30, 80, 25);
        psSenha.setBounds(100, 75, 120, 25);
        lbSenha.setBounds(30, 75, 80, 25);
        btLogar.setBounds(125, 120, 100, 25);
        btCancelar.setBounds(20, 120, 100, 25);

        add(tfLogin);
        add(lbLogin);
        add(psSenha);
        add(lbSenha);
        add(btLogar);
        add(btCancelar);
    }

    private void definirEventos () {
        ActionListener logarListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String senha =  String.valueOf(psSenha.getPassword());
                String login = String.valueOf(tfLogin.getText());
                if (login.equals("Java8") && senha.equals("Java8")){
                    frame.setVisible(false);
                    GuiMenuPrincipal.abrir();
                } else {
                    JOptionPane.showMessageDialog(null, "Login ou senha incorretos!");
                }
            }
        };
        ActionListener cancelarListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        };
        btLogar.addActionListener(logarListener);
        btCancelar.addActionListener(cancelarListener);
    }

    public static void main (String[] args) {
        Runnable lancador = new Runnable() {
            @Override
            public void run() {
                frame = new GuiLogin();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
                frame.setLocation((tela.width - frame.getSize().width) / 2, (tela.height - frame.getSize().height) / 2);
                frame.setVisible(true);
            }
        };
        SwingUtilities.invokeLater(lancador);
    }
}
