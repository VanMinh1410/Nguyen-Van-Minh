
package exercise4;
import java.util.Date;
public abstract class Person implements IPerson {
    private String id;
    String fullName;
    private Date dateOfbirtDate;
    private Date bookBorrowDate;
    private Date bookReturnDate;

    public Person(String id, String fullName, Date dateOfbirtDate, Date bookBorrowDate, Date bookReturnDate) {
        this.id = id;
        this.fullName = fullName;
        this.dateOfbirtDate = dateOfbirtDate;
        this.bookBorrowDate = bookBorrowDate;
        this.bookReturnDate = bookReturnDate;
        
    }
    public boolean isBookOverdue(){
        long diff = bookReturnDate.getTime()- bookBorrowDate.getTime();
        long days = diff / (1000*60*60*24);
        return days >=30;
        
    }
    public abstract void addPerson();
    public abstract void updateBook();
    public abstract void displayInfo();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getDateOfbirtDate() {
        return dateOfbirtDate;
    }

    public void setDateOfbirtDate(Date dateOfbirtDate) {
        this.dateOfbirtDate = dateOfbirtDate;
    }

    public Date getBookBorrowDate() {
        return bookBorrowDate;
    }

    public void setBookBorrowDate(Date bookBorrowDate) {
        this.bookBorrowDate = bookBorrowDate;
    }

    public Date getBookReturnDate() {
        return bookReturnDate;
    }

    public void setBookReturnDate(Date bookReturnDate) {
        this.bookReturnDate = bookReturnDate;
    }
    
}
