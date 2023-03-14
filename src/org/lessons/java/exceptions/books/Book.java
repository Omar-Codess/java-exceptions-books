package org.lessons.java.exceptions.books;

import java.util.Objects;

public class Book {
    //ATTRIBUTI
    private String title;
    private int pagesNum;
    private String author;
    private String editor;


    //COSTRUTTORE
    public Book(String title, int pagesNum, String author, String editor) throws RuntimeException {

        if (Objects.equals(title, "") || Objects.equals(author, "") || Objects.equals(editor, "")) throw new RuntimeException("Hai lasciato uno o più campi vuoti");
        if(pagesNum <= 0) throw new RuntimeException("Numero pagine non valido");

        this.title = title;
        this.pagesNum = pagesNum;
        this.author = author;
        this.editor = editor;
    }

    //GETTER E SETTER
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) throws RuntimeException {
        if (Objects.equals(title, "")) throw new RuntimeException("Non puoi lasciare questo campo vuoto.");
        this.title = title;
    }

    public int getPagesNum() {
        return pagesNum;
    }

    public void setPagesNum(int pagesNum) throws NumberFormatException {
        if (pagesNum <= 0) throw new RuntimeException("Numero di pagine non valido");
        this.pagesNum = pagesNum;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) throws RuntimeException {
        if (Objects.equals(author, "")) throw new RuntimeException("Non puoi lasciare questo campo vuoto.");
        this.author = author;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) throws RuntimeException{
        if (Objects.equals(editor, "")) throw new RuntimeException("Non puoi lasciare questo campo vuoto.");
        this.editor = editor;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pagesNum=" + pagesNum +
                ", author='" + author + '\'' +
                ", editor='" + editor + '\'' +
                '}';
    }
}
