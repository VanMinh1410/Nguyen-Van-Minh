
package exercise5;
import java.util.ArrayList;
import java.util.Iterator;
public class BookList {

    private ArrayList<Book> bookList = new ArrayList<>();
    public void addBook(Book book){
        book.addBook();
         bookList.add(book);
        System.out.println("Added");
    }
    public Book findBookById(String id){
        for (Book book :bookList){
            if (book.getbookId().equals(id)){
                book.updateBook(id);
                return book;
            }
        }
        System.out.println("Not found ID:"+id);
        return null;
    }
       public void deleteBookById(String id) {
        Iterator<Book> iterator = bookList.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getbookId().equals(id)) {
                iterator.remove();
                System.out.println("Deleted ID: " + id);
                return;
            }
        }
    }
    public Book findBookByI(String id){
     for (Book book: bookList){
         if (book.getbookId().equals(id)){
           return book;  
         }
     }   
     System.out.println("Notfound ID: "+id);
     return null;
    }
    public void displayAllBooks(){
        if (bookList.isEmpty()){
            System.out.println("Emtry");
        }else{
            for (Book book : bookList){
                book.displayBook();
            }
        }
    }

    void updateBook(String updateId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void addBook(TextBook tb) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
