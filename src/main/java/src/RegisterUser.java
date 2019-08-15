package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterUser extends JFrame
{
    private String registerArq;
    private String nameUser, institution, numberBook, fines;
    private static int sequence = 1, idUser;

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
        textUser.setBounds(100,200,120,30);
        fieldUser.setBounds(210,200,120,30);

        textInstitution.setBounds(100,230,120,30);
        fieldInstitution.setBounds(200,230,120,30);

        buttonInput.setBounds(200,350,210,30);

        add(textUser);
        add(fieldUser);
        add(textInstitution);
        add(fieldInstitution);
        add(buttonInput);
        //Ação do botão
        buttonInput.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setNameUser(fieldUser.getText());
                setIdUser(sequence++);
                setInstitution(fieldInstitution.getText());
                register();
            }
        });
    }
    public void register()
    {
        registerArq = "/"+getNameUser()+"/"+getInstitution()+"/"+"/"+"/";
        if(DataManipulation.Write("/home/kamila/IdeaProjects/Biblioteca/src/main/java/Banco/RegisterUser.txt", registerArq))
            System.out.println("deu ceto");
        else
            System.out.println("falhou");
        new Menu();
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

    public String getNumberBook() {
        return numberBook;
    }

    public void setNumberBook(String numberBook) {
        this.numberBook = numberBook;
    }

    public String getFines() {
        return fines;
    }

    public void setFines(String fines) {
        this.fines = fines;
    }


}
