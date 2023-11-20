package tp9.decorator;
import tp9.Book;

import java.time.LocalDate;

// Décorateur pour ajouter des fonctionnalités de bibliothèque
public class LibraryBookDecorator implements BookDecorator {
    private Book book;
    private boolean isLoaned; // prêt en cours ou non
    private LocalDate date; // date de prêt

    public LibraryBookDecorator(Book book) {
        this.book = book;
    }

    @Override
    public String getTitle() {
        return book.getTitle();
    }

    @Override
    public void setTitle(String title) {
        book.setTitle(title);
    }

    @Override
    public double getPrice() {
        return book.getPrice();
    }

    @Override
    public void setPrice(double price) {
        book.setPrice(price);
    }

    @Override
    public String preview() {
        return book.preview();
    }

    // définit un prêt. isLoaned de vient vrai, et on fournit la date du prêt
    public void loanOut(LocalDate dueDate) {
        date = dueDate;
        isLoaned = true;
    }

    // Le livre a été ramené, fin du prêt
    public void returnBook() {
        date = null;
        isLoaned = false;
    }

    public boolean isLoanedOut() {
        return isLoaned;
    }

    public LocalDate getDueDate() {
        return date;
    }

    public String toString ()
    {
        return book.getTitle() + (isLoanedOut() ? " has been loaned. Due date: " + getDueDate() : " is available for a loan.");
    }
}