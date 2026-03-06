package main;

import service.LibraryServiceImpl;

public class LibraryMain {

    public static void main(String[] args) {

        LibraryServiceImpl library = new LibraryServiceImpl();

        library.addBook(1, "Java Programming");
        library.addBook(2, "Data Structures");

        library.displayBooks();

        try {
            library.issueBook(1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        library.displayBooks();

        library.returnBook(1);

        library.displayBooks();
    }
}
