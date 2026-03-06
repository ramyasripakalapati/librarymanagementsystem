package service;

import model.Book;
import exception.BookNotFoundException;
import java.util.ArrayList;

public class LibraryServiceImpl implements LibraryService {

    ArrayList<Book> books = new ArrayList<>();

    public void addBook(int id, String title) {
        books.add(new Book(id, title));
        System.out.println("Book added successfully");
    }

    public void issueBook(int id) throws BookNotFoundException {

        for(Book b : books) {
            if(b.getId() == id) {
                if(!b.isIssued()) {
                    b.setIssued(true);
                    System.out.println("Book issued");
                    return;
                } else {
                    System.out.println("Book already issued");
                    return;
                }
            }
        }

        throw new BookNotFoundException("Book not found");
    }

    public void returnBook(int id) {

        for(Book b : books) {
            if(b.getId() == id) {
                b.setIssued(false);
                System.out.println("Book returned");
                return;
            }
        }
    }

    public void displayBooks() {

        for(Book b : books) {
            System.out.println(b.getId() + " " + b.getTitle() + " Issued:" + b.isIssued());
        }
    }
}
