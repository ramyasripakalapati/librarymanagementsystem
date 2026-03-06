package service;

public interface LibraryService {

    void addBook(int id, String title);

    void issueBook(int id) throws Exception;

    void returnBook(int id);

    void displayBooks();
}
