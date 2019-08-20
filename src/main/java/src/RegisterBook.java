package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

class RegisterBook extends JFrame{

    private String registerArq;
    private String nameBook, author, edition, publication, category, copies, idAux;
    private int idBook;


    JTextField fieldName = new JTextField(10);
    JTextField fieldAuthor = new JTextField(10);
    JTextField fieldEdition = new JTextField(10);
    JTextField fieldPublication = new JTextField(10);
    JTextField fieldCategory = new JTextField(10);
    JTextField fieldCopies = new JTextField(10);

    JLabel textName = new JLabel("Nome do Livro: ");
    JLabel textAuthor = new JLabel("Nome do Autor: ");
    JLabel textEdition = new JLabel("Edição: ");
    JLabel textPublication = new JLabel("Publicação: ");
    JLabel textCategory = new JLabel("Categoria: ");
    JLabel textCopies = new JLabel("Número de Exemplares: ");

    JButton buttonInput = new JButton("Finalizar");

    Font fonte = new Font("Arial", Font.BOLD, 20);

    public RegisterBook(){
        // Config das janelas
        setLayout(null);
        setTitle("Sistema de Biblioteca");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        //Posições - pos horizontal, pos vertical, largura, altura
        textName.setBounds(100,80,200,30);
        fieldName.setBounds(300,80,120,30);

        textAuthor.setBounds(100,110,200,30);
        fieldAuthor.setBounds(300,110,120,30);

        textEdition.setBounds(150,140,200,30);
        fieldEdition.setBounds(300,140,120,30);

        textPublication.setBounds(100,170,200,30);
        fieldPublication.setBounds(300,170,120,30);

        textCategory.setBounds(100,200,200,30);
        fieldCategory.setBounds(300,200,120,30);

        textCopies.setBounds(100,230,200,30);
        fieldCopies.setBounds(300,230,120,30);

        buttonInput.setBounds(200,350,210,30);

        add(textName);
        add(fieldName);
        add(textAuthor);
        add(fieldAuthor);
        add(textEdition);
        add(fieldEdition);
        add(textPublication);
        add(fieldPublication);
        add(textCategory);
        add(fieldCategory);
        add(textCopies);
        add(fieldCopies);
        add(buttonInput);
        idAux = DataManipulation.Read("/home/kamila/IdeaProjects/Biblioteca/src/main/java/Banco/idBook.txt");
        idBook = Integer.parseInt(idAux.substring(1,2));
        idBook++;

        //Ação do botão
        buttonInput.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setNameBook(fieldName.getText());
                setAuthor(fieldAuthor.getText());
                setEdition(fieldEdition.getText());
                setPublication(fieldPublication.getText());
                setCategory(fieldCategory.getText());
                setCopies(fieldCopies.getText());
                setIdBook(idBook);
                register();
            }
        });
        idAux = Integer.toString(idBook);
        DataManipulation.readID("/home/kamila/IdeaProjects/Biblioteca/src/main/java/Banco/idBook.txt", idAux);
    }
    public void register()
    {
        registerArq = getIdBook() +"/"+ getNameBook()+"/"+getAuthor()+"/"+getEdition()+"/"+getPublication()+"/"+getCategory()+"/"+getCopies();
        if(DataManipulation.Write("/home/kamila/IdeaProjects/Biblioteca/src/main/java/Banco/RegisterBook.txt", registerArq))
            System.out.println("deu ceto");
        else
            System.out.println("falhou");
        new Menu();
    }


    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getPublication() {
        return publication;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCopies() {
        return copies;
    }

    public void setCopies(String copies) {
        this.copies = copies;
    }

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }
}
