package tp9;

// Classe Book
public class Book implements IBook {
    private String title;
    private double price;

    public Book (String title, double price)
    {
        //TODO à compléter
        this.title = title;
        this.price = price;
    }
    // getters, setters, etc.
    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    //TODO à compléter

    public String preview() {
        // Simule l'affichage d'un aperçu du livre (indiquez par exemple "Preview of Clean Code: [First few lines of the book...]")
        return "Preview of " + title + ": Priced at " + price;
    }
}