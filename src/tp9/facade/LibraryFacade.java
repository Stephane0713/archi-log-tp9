package tp9.facade;

import tp9.Book;
import tp9.IBook;
import tp9.adapter.BookStoreAdapter;
import tp9.adapter.IBookStore;
import tp9.adapter.OldBookStore;
import tp9.decorator.LibraryBookDecorator;

// Facade pour simplifier l'accès client
public class LibraryFacade {
    private OldBookStore oldBookStore;
    private IBookStore bookStoreAdapter;
    private LibraryBookDecorator libraryBookDecorator;


    public LibraryFacade(OldBookStore oldBookStore) {
        this.oldBookStore = oldBookStore;
        this.bookStoreAdapter = new BookStoreAdapter(oldBookStore);
        this.libraryBookDecorator = new LibraryBookDecorator(new Book("Refactoring Guru Code", 14));
    }


    // Méthodes simplifiées pour l'accès client
    public IBook getBook(String title) {
        // Logique pour obtenir un aperçu du livre dans l'ancien système
        IBook book = oldBookStore.getBook(title);

        if (book == null) {
            // Logique pour obtenir un aperçu du livre dans le nouveau système
            book = bookStoreAdapter.fetchBook(title);
        }
        return book ;
    }

    // Méthode qui renvoie un libraryBookDecorator
    public IBook libraryBook(String title) {
        // Obtenez le livre en fonction du titre (à partir de OldBookStore ou BookStoreAdapter)
        // Utilisons bookStoreAdapter pour obtenir le livre
        Book book = bookStoreAdapter.fetchBook(title);

        if (book != null) {
            // Si le livre est trouvé, créez un LibraryBookDecorator avec ce livre
            return new LibraryBookDecorator(book);
        } else {
            // Si le livre n'est pas trouvé, renvoyez null ou gérez le cas en conséquence
            return null;
        }
    }
}