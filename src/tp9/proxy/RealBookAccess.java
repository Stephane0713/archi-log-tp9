package tp9.proxy;

import tp9.Book;

// Classe réelle
public class RealBookAccess implements BookAccess {
    private Book book;
    // Logic for reading the full book

    public RealBookAccess(Book book) {
        //TODO à compléter
        this.book = book;
    }

    public String read() {
        //TODO à compléter
        return "Reading book: " + book.getTitle();
    }

    public String preview() {
        //TODO à compléter
        return book.preview();
    }

}
