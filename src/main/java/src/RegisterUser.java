package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterUser extends JFrame implements ActionListener
{
    private String nameUser, institution;
    private int idUser, numberBook;
    private double fines;

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        new RegisterUser();
    }

    JTextField fieldUser = new JTextField(10);
    JTextField fieldId = new JTextField(10);
    JTextField fieldInstitution = new JTextField(10);

    JLabel textUser = new JLabel("Nome do Usuário: ");
    JLabel textId = new JLabel("ID do usuário: ");
    JLabel textInstitution = new JLabel("Instituição: ");

    JButton buttonInput = new JButton("Finalizar");

    Font fonte = new Font("Arial", Font.BOLD, 20);

    public RegisterUser()
    {
        // Config das janelas
        setLayout(null);
        setTitle("Sistema de Biblioteca");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        //Posições - pos horizontal, pos vertical, largura, altura
        textUser.setBounds(100,170,120,30);
        fieldUser.setBounds(210,170,120,30);

        textId.setBounds(100,200,120,30);
        fieldId.setBounds(210,200,120,30);

        textInstitution.setBounds(100,230,120,30);
        fieldInstitution.setBounds(200,230,120,30);

        buttonInput.setBounds(200,350,210,30);

        add(textUser);
        add(fieldUser);
        add(textId);
        add(fieldId);
        add(textInstitution);
        add(fieldInstitution);
        add(buttonInput);
        //Ação do botão
        buttonInput.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setNameUser(fieldUser.getText());
                int n = Integer.parseInt(fieldId.getText());
                setIdUser(n);
                setInstitution(fieldInstitution.getText());
            }
        });
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getNumberBook() {
        return numberBook;
    }

    public void setNumberBook(int numberBook) {
        this.numberBook = numberBook;
    }

    public double getFines() {
        return fines;
    }

    public void setFines(double fines) {
        this.fines = fines;
    }


}
