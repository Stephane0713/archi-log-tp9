package tp9.adapter;

import tp9.Book;

public class BookStoreAdapter implements IBookStore {

    // Attribut pour stocker l'instance de OldBookStore
    private OldBookStore oldBookStore;

    // Constructeur prenant une instance de OldBookStore
    public BookStoreAdapter(OldBookStore oldBookStore) {
        this.oldBookStore = oldBookStore;
    }

    // Implémentation de la méthode fetchBook de l'interface IBookStore
    @Override
    public Book fetchBook(String title) {
        // Utilisation de la méthode getBook de OldBookStore
        // pour récupérer un livre et le retourner
        return oldBookStore.getBook(title);
    }
}