package src;

public class CheckID {

    public CheckID(){

    }
    public static boolean checkedExistBook(String id) {
        String textTable;
        String table[][] = new String[50][5];
        int j;
        textTable = DataManipulation.Read("/home/kamila/IdeaProjects/Biblioteca/src/main/java/Banco/RegisterBook.txt");

        String aux[] = textTable.split("#");
        for (j = 0; j < aux.length; j++) {
            table[j] = aux[j].split("/");
        }
        // EM TABLE[J][0] ESTÃO MEUS IDs
        for(j = 0 ; table[j][0] != null ; j++){
            if(table[j][0].equals(id)){
                return true;
            }
        }
        return false;
    }
    public static boolean checkedExistUser(String id) {
        String textTable;
        String table[][] = new String[50][5];
        int j;
        textTable = DataManipulation.Read("/home/kamila/IdeaProjects/Biblioteca/src/main/java/Banco/RegisterUser.txt");

        String aux[] = textTable.split("#");
        for (j = 0; j < aux.length; j++) {
            table[j] = aux[j].split("/");
        }
        // EM TABLE[J][0] ESTÃO MEUS IDs
        for(j = 0 ; table[j][0] != null ; j++){
            if(table[j][0].equals(id)){
                return true;
            }
        }
        return false;
    }

}
//if(CheckID.checkedBook(Integer.toString(idUser)))