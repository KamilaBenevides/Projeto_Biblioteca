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
import java.io.*;
import javax.swing.*;

public class Window{
    public static void main(String[] args) {
        File arquivo = new File("/home/kamila/IdeaProjects/Biblioteca/src/main/java/Banco/iduser.txt");
        try {
            if (!arquivo.exists()) {
                arquivo.createNewFile();
            }
            FileWriter fw = new FileWriter(arquivo, false);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("2"); //mudar isso
            bw.newLine();
            bw.close();
            fw.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}