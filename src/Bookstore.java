public class Bookstore {
    public Book sellBook(String bookType) {
        if (bookType.equalsIgnoreCase("fiction")) {
            return new FictionBook();
        } else if (bookType.equalsIgnoreCase("non-fiction")) {
            return new NonFictionBook();
        } else {
            throw new IllegalArgumentException("Invalid book type");
        }
    }

//  the Book interface
public interface Book {
    void sell();
}

// concrete book classes
public class FictionBook implements Book {
    @Override
    public void sell() {
        System.out.println("Selling Fiction Book");
    }
}

public class NonFictionBook implements Book {
    @Override
    public void sell() {
        System.out.println("Selling Non-Fiction Book");
    }
}}