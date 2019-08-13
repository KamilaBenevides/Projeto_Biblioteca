package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoanBook extends JFrame implements ActionListener
{
    private String loanDate, returnDate;
    private int idBook, idUser;

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        new LoanBook();
    }

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
    public LoanBook()
    {
        // Config das janelas
        setLayout(null);
        setTitle("Sistema de Biblioteca");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        //Posições - pos horizontal, pos vertical, largura, altura
        textLoanDate.setBounds(100,170,120,30);
        fieldLoanDate.setBounds(210,170,120,30);

        textReturnDate.setBounds(100,200,120,30);
        fieldReturnDate.setBounds(210,200,120,30);

        textIdBook.setBounds(100,230,120,30);
        fieldIdBook.setBounds(200,230,120,30);

        textIdUser.setBounds(100,230,140,30);
        fieldIdUser.setBounds(200,230,140,30);

        buttonInput.setBounds(200,350,210,30);

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
                int n1 = Integer.parseInt(fieldIdBook.getText());
                setIdBook(n1);
                int n2 = Integer.parseInt(fieldIdUser.getText());
                setIdUser(n2);
            }
        });
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

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }
}
