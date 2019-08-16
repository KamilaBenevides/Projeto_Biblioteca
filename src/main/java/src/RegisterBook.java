package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class RegisterBook extends JFrame{

    private String registerArq;
    private String nameBook, author, edition, publication, category, copies;
    private int sequence = 1, idBook;

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

    public RegisterBook()
    {
        // Config das janelas
        setLayout(null);
        setTitle("Sistema de Biblioteca");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        //Posições - pos horizontal, pos vertical, largura, altura
        textName.setBounds(100,80,120,30);
        fieldName.setBounds(210,80,120,30);

        textAuthor.setBounds(100,110,120,30);
        fieldAuthor.setBounds(210,110,120,30);

        textEdition.setBounds(150,140,120,30);
        fieldEdition.setBounds(210,140,120,30);

        textPublication.setBounds(100,170,120,30);
        fieldPublication.setBounds(210,170,120,30);

        textCategory.setBounds(100,200,120,30);
        fieldCategory.setBounds(210,200,120,30);

        textCopies.setBounds(100,230,120,30);
        fieldCopies.setBounds(200,230,120,30);

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
                setIdBook(sequence++);
                register();
            }
        });
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
