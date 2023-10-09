public class Main {
    public static void main(String[] args) {
        Bookstore bookstore = new Bookstore();

        // Sell a Fiction Book
        Bookstore.Book fictionBook = bookstore.sellBook("fiction");
        fictionBook.sell();

        // Sell a Non-Fiction Book
        Bookstore.Book nonFictionBook = bookstore.sellBook("non-fiction");
        nonFictionBook.sell();
    }
}