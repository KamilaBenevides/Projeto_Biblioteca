package src;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Janela extends JFrame implements ActionListener
    {
        Font fonte = new Font("verdana", Font.BOLD, 15);
        CadastroLivro cadastroLivro = new CadastroLivro();
        JButton jb = new JButton("Cadastrar Livro");
        JButton jb2 = new JButton("Emprestimo de Livro");
        JButton jbExit = new JButton("Sair");

        public Janela()
        {
            // layout para a janela
            setLayout(new FlowLayout());
            //onde o botão vai ser executado
            jb.addActionListener(cadastroLivro);
            jbExit.addActionListener(this);
            setLayout(null);

            //editar texto do botão
            jb.setFont(fonte);
            jb2.setFont(fonte);
            jbExit.setFont(fonte);

            //Posições - pos horizontal, pos vertical, largura, altura
            jb.setBounds(150,200,170,45);
            jb2.setBounds(150,100,240,45);
            jbExit.setBounds(150,300,100,30);
            getContentPane().add(jb);
            getContentPane().add(jb2);
            getContentPane().add(jbExit);

            // Config das janelas
            setTitle("Sistema de Biblioteca");
            setSize(600, 500);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
            setVisible(true);
        }
        public static void main(String[] args)
        {
            new Janela();
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == jbExit)
            {
                System.exit(0);
            }
        }
    }
