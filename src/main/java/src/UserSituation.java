package src;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import static java.awt.SystemColor.menu;

public class UserSituation extends JFrame
{
    private String idInput;
    private String textTableUser, textTableLoan, textTableBook;
    String tableUser[][] = new String[50][5];
    String tableLoan[][] = new String[50][5];
    String tableBook[][] = new String[50][5];
    private int sizeText, j, k, linha, coluna;

    JLabel textId = new JLabel("Entre com o ID do Usuário: ");
    JTextField fieldId = new JTextField(10);
    JButton buttonInput = new JButton("Entrar");

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
        textId.setBounds(210,170,300,30);
        fieldId.setBounds(240,200,120,30);
        buttonInput.setBounds(200,250,210,30);

        add(textId);
        add(fieldId);
        add(buttonInput);
        //searchBD();
        //Ação do botão
        returnTextUser();
        returnTextLoan();
        returnTextBook();
        buttonInput.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setIdInput(fieldId.getText());
                windowUser(tableUser);
            }
        });
    }

    public void windowUser(String[][] tableUser)
    {
        String linesBook = "", linesFines;
        String idBookLoan[] = new String[50];
        String lines[][] = new String[50][2];
        String[] column = {"Títulos Pendêntes", "Multas Acumuladas"};
        int k = 0;

        //Usar as tabelas/matrizes tableLoan e tableUser

        JFrame window = new JFrame();

        int flag = 0, loop, i;
        for(loop = 1, i = 0 ; tableLoan[loop][1] != null ; loop++){//Loop para procurar o usuario na tabela de emprestimo e pegar o ID do livro
            //System.out.println("DEGUG: "+tableLoan[loop][1]);
            if(tableLoan[loop][1].equals(getIdInput())){
                idBookLoan[i] = tableLoan[loop][0];
                flag = 1;
                i++;
            }
        }
        if(flag == 1){ // PRECISA DE DUAS FLAGS UMA PARA OS TITULOS E OUTRA PARA AS MULTAS
            for(loop = 1 ; tableBook[loop][0] != null; loop++){//Loop para procurar o nome do livro
                for(i = 0 ; idBookLoan[i] != null ; i++) {
                    System.out.println("tableBook: "+tableBook[loop][0]+" idBookLoan: "+idBookLoan[i]);
                    if(tableBook[loop][0].equals(idBookLoan[i])) {
                        lines[k][0] = tableBook[loop][1];
                        //System.out.println("lines: "+lines[k][0]+" tableBook: "+tableBook[loop][1]);
                        k++;
                    }
                }
            }
            for(loop = 1 ; tableBook[loop][0] != null; loop++){//Loop para procurar a multa
                if(tableUser[loop][0].equals(getIdInput())) {
                    lines[0][1] = tableUser[loop][3];
                }
            }
        }
        else{
            lines[0][0] = "Sem livros emprestados";
            lines[0][1] = "Sem multas";
        }
        JButton buttonInput = new JButton("Finalizar");
        buttonInput.setBounds(200,350,210,30);
        JTable listEstados = new JTable(lines, column);
        JScrollPane scrollpane = new JScrollPane(listEstados);
        window.getContentPane().add(scrollpane);
        //Config das janelas
        window.setTitle("Sistema de Biblioteca");
        window.setSize(600, 500);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        //configuração de Layout
        window.setLayout(null);
        window.add(buttonInput);

        //Posições - pos horizontal, pos vertical, largura, altura


    }
    public void returnTextBook()
    {
        textTableBook = DataManipulation.Read("/home/kamila/IdeaProjects/Biblioteca/src/main/java/Banco/RegisterBook.txt");

        String aux[] = textTableBook.split("#");
        for(j = 0 ; j < aux.length ; j++) {
            tableBook[j] = aux[j].split("/");
        }
        //for(k = 1 ; k <= j ; k++) { System.out.println(Arrays.toString(tableBook[k])); }
    }
    public void returnTextUser()
    {
        textTableUser = DataManipulation.Read("/home/kamila/IdeaProjects/Biblioteca/src/main/java/Banco/RegisterUser.txt");

        String aux[] = textTableUser.split("#");
        for(j = 0 ; j < aux.length ; j++) {
            tableUser[j] = aux[j].split("/");
        }
        //for(k = 1 ; k <= j ; k++) {System.out.println(Arrays.toString(tableUser[k]));}
    }
    public void returnTextLoan()
    {
        textTableLoan = DataManipulation.Read("/home/kamila/IdeaProjects/Biblioteca/src/main/java/Banco/LoanBook.txt");

        String aux[] = textTableLoan.split("#");
        for(j = 0 ; j < aux.length ; j++) {
            tableLoan[j] = aux[j].split("/");
        }
        //for(k = 1 ; k <= j ; k++) { System.out.println(Arrays.toString(tableLoan[k])); }
    }

    public String getIdInput() {
        return idInput;
    }
    public void setIdInput(String idInput) {
        this.idInput = idInput;
    }
}
