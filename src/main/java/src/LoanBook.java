package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

public class LoanBook extends JFrame
{
    private String registerArq;
    private String idBook, idUser, loanDate, returnDate;

    JTextField fieldLoanDate = new JTextField(10);
    JTextField fieldReturnDate = new JTextField(10);
    JTextField fieldIdBook = new JTextField(10);
    JTextField fieldIdUser = new JTextField(10);

    JLabel textLoanDate = new JLabel("Data do Emprestimo: ");
    JLabel textReturnDate = new JLabel("Data da devolução: ");
    JLabel textIdBook = new JLabel("ID do livro: ");
    JLabel textIdUser = new JLabel("ID do Usuário: ");

    JButton buttonInput = new JButton("Finalizar");

    Font fonte = new Font("Arial", Font.BOLD, 20);
    public LoanBook() {
        // Config das janelas
        setLayout(null);
        setTitle("Sistema de Biblioteca");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        //Posições - pos horizontal, pos vertical, largura, altura
        textLoanDate.setBounds(100, 170, 120, 30);
        fieldLoanDate.setBounds(210, 170, 120, 30);

        textReturnDate.setBounds(100, 200, 120, 30);
        fieldReturnDate.setBounds(210, 200, 120, 30);

        textIdBook.setBounds(100, 230, 120, 30);
        fieldIdBook.setBounds(200, 230, 120, 30);

        textIdUser.setBounds(100, 230, 140, 30);
        fieldIdUser.setBounds(200, 230, 140, 30);

        buttonInput.setBounds(200, 350, 210, 30);

        add(textLoanDate);
        add(fieldLoanDate);
        add(textReturnDate);
        add(fieldReturnDate);
        add(textIdBook);
        add(fieldIdBook);
        add(textIdUser);
        add(fieldIdUser);
        add(buttonInput);

        //Ação do botão
        buttonInput.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setLoanDate(fieldLoanDate.getText());
                setReturnDate(fieldReturnDate.getText());
                setIdBook(fieldIdBook.getText());
                setIdUser(fieldIdUser.getText());
                register();
            }
        });
    }
        public void register()
        {
            registerArq = "/"+"/"+getLoanDate()+"/"+getReturnDate();
            if(DataManipulation.Write("/home/kamila/IdeaProjects/Biblioteca/src/main/java/Banco/LoanBook.txt", registerArq))
                System.out.println("deu ceto");
            else
                System.out.println("falhou");
            new Menu();
        }

    public String getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(String loanDate) {
        this.loanDate = loanDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public String getIdBook() {
        return idBook;
    }

    public void setIdBook(String idBook) {
        this.idBook = idBook;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }
}
