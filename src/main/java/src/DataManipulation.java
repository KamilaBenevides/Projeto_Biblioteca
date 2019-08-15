package src;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DataManipulation
{
    public static String Read(String Banco) {

        File file = new File(Banco);
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String st, result = "";
        while (true) {
            try {
                st = br.readLine();
                if(st == null)break;
                result += "#"+st;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //System.out.println(result);
        return result;
    }

    public static boolean Write(String Banco, String text)
    {
        try {
            FileWriter arq = new FileWriter(Banco, true);
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.println(text);
            gravarArq.close();
            return true;
        }catch (IOException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
