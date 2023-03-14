package org.lessons.java.exceptions.books;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private final static String FILE_PATH = "./books.txt";
    public static void main (String[] args) throws IOException {

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

        scan.close();
        System.out.println(Arrays.toString(array));

        FileWriter myWriter = null;
        try {
            myWriter = new FileWriter(FILE_PATH, true);
            for (Book currentBook : array) {
                myWriter.write(currentBook.toString() + "\n" + "---------------" + "\n");
            }
        } catch (IOException e) {
            System.out.println("Non posso creare il file");
            System.out.println(e.getMessage());
        } finally {
            if (myWriter != null) {
                try {
                    myWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        Scanner fileScanner = null;
        try {
            fileScanner = new Scanner(new File(FILE_PATH));
            while (fileScanner.hasNext()) {
                String line = fileScanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if (fileScanner != null) {
                try {
                    fileScanner.close();
                } catch (IllegalStateException ise) {
                    ise.printStackTrace();
                }
            }
        }
    }
}
