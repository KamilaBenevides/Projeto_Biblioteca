package src;

public class Window
{

    public static void main(String[] args)
    {
        String nome1 = "Thiago";
        String nome2 = "Varallo";
        String nome3 = "Palmeira";
        String nome[] = new String[3];
        nome[0] = nome1;
        nome[1] = nome2;
        nome[2] = nome3;
        String tudo = "";
        int i;
        for(i = 0 ; i < 3 ; i++)
        {
            //tudo += nome[i].concat(" ");
            tudo += nome[i]+"\n";
        }

        System.out.println("Nome Completo: "+tudo);
    }
}