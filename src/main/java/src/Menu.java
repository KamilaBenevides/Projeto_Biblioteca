package src;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    public class Menu extends JFrame implements ActionListener
    {
        RegisterBook cadastroLivro = new RegisterBook();
        RegisterUser registerUser = new RegisterUser();
        LoanBook loanBook = new LoanBook();
        UserSituation userSituation = new UserSituation();
        Font fonte = new Font("verdana", Font.BOLD, 15);
        Font fonte2 = new Font("verdana", Font.BOLD, 40);
        JButton buttonUser = new JButton("Cadastrar Usuário");
        JButton buttonRegisterBook = new JButton("Cadastrar Livro");
        JButton buttonBorrowBook = new JButton("Emprestimo de Livro");
        JButton buttonSituation = new JButton("Ver situação do Usuário");
        JButton buttonExit = new JButton("Sair");

        public Menu()
        {
            // layout para a janela
            setLayout(new FlowLayout());

            //onde o botão vai ser executado
            buttonUser.addActionListener(registerUser);
            buttonRegisterBook.addActionListener(cadastroLivro);
            buttonBorrowBook.addActionListener(loanBook);
            buttonSituation.addActionListener(userSituation);
            buttonExit.addActionListener(this);

            //configuração de Layout
            setLayout(null);

            //editar texto do botão
            buttonUser.setFont(fonte);
            buttonBorrowBook.setFont(fonte);
            buttonRegisterBook.setFont(fonte);
            buttonSituation.setFont(fonte);
            buttonExit.setFont(fonte);

            //Posições - pos horizontal, pos vertical, largura, altura
            buttonUser.setBounds(180,80,240,45);
            buttonBorrowBook.setBounds(180,130,240,45);
            buttonRegisterBook.setBounds(180,180,240,45);
            buttonSituation.setBounds(180,230,240,45);
            buttonExit.setBounds(250,310,100,30);

            add(buttonUser);
            add(buttonBorrowBook);
            add(buttonRegisterBook);
            add(buttonSituation);
            add(buttonExit);

            // Config das janelas
            setTitle("Sistema de Biblioteca");
            setSize(600, 500);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
            setVisible(true);

        }
        public static void main(String[] args)
        {
            new Menu();
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == buttonExit)
            {
                System.exit(0);
            }
        }
    }
