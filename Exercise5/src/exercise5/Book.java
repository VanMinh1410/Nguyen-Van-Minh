
package exercise5;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public abstract class Book implements IBook {
    private String bookId;
    private String publisher;
    private Date entryDate;
    private double unitPrice;
    private double quanTity;

    public Book(String bookId, String publisher, Date entryDate, double unitPrice, double quantity) {
        this.bookId = bookId;
        this.publisher = publisher;
        this.entryDate = entryDate;
        this.unitPrice = unitPrice;
        this.quanTity = quantity;
    }

    public String getbookId() {
        return bookId;
    }

    public void setbookId(String bookId) {
        this.bookId = bookId;
    }

    public String getpublisher() {
        return publisher;
    }

    public void setpublisher(String publisher) {
        this.publisher = publisher;
    }

    public Date getentryDate() {
        return entryDate;
    }

    public void setentryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public double getunitPrice() {
        return unitPrice;
    }

    public void setunitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getquanTity() {
        return quanTity;
    }

    public void setquanTity(double quanTity) {
        this.quanTity = quanTity;
    }

    public void addBook() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter publisher: ");
            setpublisher(scanner.nextLine());
            System.out.print("Enter price: ");
            setunitPrice (scanner.nextDouble());
            System.out.print("Enter quanTity: ");
            setquanTity (scanner.nextDouble());
            scanner.nextLine();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/mm//yyyy");
            System.out.print("Enter entryDate: ");
            String entryDateString = scanner.nextLine();
            setentryDate(sdf.parse(entryDateString));
        }
        catch (ParseException e){
            System.out.println(e);
        }
    }
    public void updateBook(String id){
        if (this.bookId.equals(id)){
            try{
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter publisher: ");
            setpublisher(scanner.nextLine());
            System.out.print("Enter price: ");
            setunitPrice (scanner.nextDouble());
            System.out.print("Enter quanTity: ");
            setquanTity (scanner.nextDouble());
            scanner.nextLine();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/mm//yyyy");
            System.out.print("Enter entryDate: ");
            String entryDateString = scanner.nextLine();
            setentryDate(sdf.parse(entryDateString));
        }
        catch (ParseException e){
            System.out.println(e);  
            }
        }
    }
    public void displayBook(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy.");
        System.out.println("ID:"+getbookId()+",publisher: "+ getpublisher()+",entryDate: "+sdf.format(entryDate)+",unitPrice:"+getunitPrice()+",quanTity: "+getquanTity());
    }
}
  

