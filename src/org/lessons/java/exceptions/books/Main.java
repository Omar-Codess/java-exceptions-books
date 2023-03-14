package org.lessons.java.exceptions.books;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Quanti libri vuoi prendere? ");
        int booksNum = Integer.parseInt(scan.nextLine());

        Book[] array = new Book[booksNum];

        for (int i = 0; i < booksNum; i++) {

            System.out.println("Titolo: ");
            String title = scan.nextLine();
            System.out.println("Numero di pagine: ");
            int pagesNum = Integer.parseInt(scan.nextLine());
            System.out.println("Autore: ");
            String author = scan.nextLine();
            System.out.println("Editore: ");
            String editor = scan.nextLine();

            array[i] = new Book(title, pagesNum, author, editor);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("Libro " + (i + 1));
            System.out.println(array[i]);
        }
    }
}
