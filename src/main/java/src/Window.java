/*package src;
public class Window {
    public static void main(String[] args) {
        String nome1 = "Thiago";
        String nome2 = "Varallo";
        String nome3 = "Palmeira";
        String nome[] = new String[3];
        nome[0] = nome1;
        nome[1] = nome2;
        nome[2] = nome3;
        String tudo = "";
        int i;
        for(i = 0 ; i < 3 ; i++) {
            //tudo += nome[i].concat(" ");
            tudo += nome[i]+"\n";
        }
        System.out.println("Nome Completo: "+tudo);
    }
}
*/
package src;
import java.awt.*;
import javax.swing.*;

public class Window extends JFrame{

    //define a tabela como tendo 3 colunas
    String[] coluna = {"Nome", "Cidade", "Estado"};

    //os dados que serão exibidos na tabela
    //a tabela possuirá o cabeçalho e 4 linhas
    String[][] dados = {{"Eduardo Jorge", "Salvador", "Bahia"},
            {"Gustavo Neves", "Caetité", "Bahia"},
            {"Tarcísio Araújo", "Mutuípe", "Bahia"},
            {"Rafael", "Campinas", "São Paulo"}};
    //Passe os arrays como parâmetro no construtor
    //e o JTable define o seu modelo de acordo o
    //array de coluna e o de dados
    private JTable listEstados = new JTable(dados, coluna);
    private JScrollPane scrollpane = new JScrollPane(listEstados);

    public Window(){
        super("JTABLE");

        this.getContentPane().add(scrollpane);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(310, 150);
        this.setVisible(true);

    }

    public static void main(String[] args){
        Window exemplo = new Window();
    }
}