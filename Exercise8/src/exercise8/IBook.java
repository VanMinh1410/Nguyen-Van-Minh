
package exercise8;

public interface IBook {
    public abstract class Book{
    public abstract double calculatePrice();
    public abstract void displayDetails();
    public abstract void addBook(Book book);
    public abstract boolean updateBookById(String id);
    }
    
}
