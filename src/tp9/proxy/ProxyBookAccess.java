package tp9.proxy;

import tp9.Book;

// Classe proxy
public class ProxyBookAccess implements BookAccess {
    private RealBookAccess realBookAccess;
    private boolean hasPurchased;
    // Logic for controlling access based on hasPurchased

    public ProxyBookAccess(Book book) {
        //TODO à compléter
        this.realBookAccess = new RealBookAccess(book);
        this.hasPurchased = false;
    }

    public void purchase() {
        this.hasPurchased = true;
    }

    public String read() {
        // Dans un Proxy, si le livre a été acheté, on autorise la lecture, sinon on indique à l'utilisateur qu'il doit acheter le livre
        //TODO à compléter
        if (hasPurchased) {
            return realBookAccess.read(); // Lecture du contenu si le livre est acheté
        } else {
            return "Please purchase the book to read."; // Message si le livre n'est pas acheté
        }
    }

    public String preview() {
        //TODO à compléter
        return realBookAccess.preview();
    }

}