package src;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserSituation extends JFrame implements ActionListener
{
    private int idInput;

    public void actionPerformed(ActionEvent e) {
        new UserSituation();
    }

    JLabel textId = new JLabel("Entre com o ID do Usuário: ");
    JTextField fieldId = new JTextField(10);
    JButton entradas = new JButton("Entrar");

    public UserSituation()
    {
        // Config das janelas
        setLayout(null);
        setTitle("Sistema de Biblioteca");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        //Posições - pos horizontal, pos vertical, largura, altura
        textId.setBounds(210,190,300,30);
        fieldId.setBounds(240,200,120,30);
        entradas.setBounds(200,250,210,30);

        add(textId);
        add(fieldId);
        add(entradas);
    }
}
