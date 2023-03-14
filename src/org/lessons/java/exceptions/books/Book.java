package org.lessons.java.exceptions.books;

public class Book {
    //ATTRIBUTI
    private String title;
    private int pagesNum;
    private String author;
    private String editor;


    //COSTRUTTORE
    public Book(String title, int pagesNum, String author, String editor) {
        this.title = title;
        this.pagesNum = pagesNum;
        this.author = author;
        this.editor = editor;
    }

    //GETTER E SETTER
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPagesNum() {
        return pagesNum;
    }

    public void setPagesNum(int pagesNum) {
        this.pagesNum = pagesNum;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
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
