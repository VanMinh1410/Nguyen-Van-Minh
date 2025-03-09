package exercise8;
import java.util.ArrayList;

class BookList {
    private ArrayList<Book> bookList;

    public BookList() { a
        this.bookList = new ArrayList<>();
    }

    public void addBook(Book book) {
        bookList.add(book);
        System.out.println("Book added successfully!");
    }

    public boolean updateBookById(String id) {
        for (Book book : bookList) {
            if (book.updateBookById(id)) {
                System.out.println("Book updated successfully!");
                return true;
            }
        }
        System.out.println("Book with ID " + id + " not found!");
        return false;
    }

    public boolean deleteBookById(String id) {
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getId().equals(id)) {
                bookList.remove(i);
                System.out.println("Book deleted successfully!");
                return true;
            }
        }
        System.out.println("Book with ID " + id + " not found!");
        return false;
    }

    public Book findBookById(String id) {
        for (Book book : bookList) {
            if (book.getId().equals(id)) {
                return book;
            }
        }
        System.out.println("Book with ID " + id + " not found!");
        return null;
    }

    public void displayAllBooks() {
        if (bookList.isEmpty()) {
            System.out.println("No books available!");
            return;
        }
        for (Book book : bookList) {
            book.displayDetails();
            System.out.println("--------------------");
        }
    }

    public Book findMostExpensiveBook() {
        if (bookList.isEmpty()) {
            System.out.println("No books available to find the most expensive one!");
            return null;
        }
        Book mostExpensive = bookList.get(0);
        for (Book book : bookList) {
            if (book.calculatePrice() > mostExpensive.calculatePrice()) {
                mostExpensive = book;
            }
        }
        return mostExpensive;
    }

    public void countBooks() {
        int textBookCount = 0;
        int referenceBookCount = 0;
        for (Book book : bookList) {
            if (book instanceof TextBook) {
                textBookCount++;
            } else if (book instanceof ReferenceBook) {
                referenceBookCount++;
            }
        }
        System.out.println("TextBook Count: " + textBookCount);
        System.out.println("ReferenceBook Count: " + referenceBookCount);
    }
}
