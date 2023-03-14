package org.lessons.java.exceptions.books;

import java.util.Arrays;
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
            int pagesNum = 0;
            try {
                pagesNum = Integer.parseInt(scan.nextLine());
            } catch (NumberFormatException e){

            }
            System.out.println("Autore: ");
            String author = scan.nextLine();
            System.out.println("Editore: ");
            String editor = scan.nextLine();

            try {
                array[i] = new Book(title, pagesNum, author, editor);
            } catch (IllegalArgumentException e){
                e.printStackTrace();
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
