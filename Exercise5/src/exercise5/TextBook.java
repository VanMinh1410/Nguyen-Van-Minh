
package exercise5;
import java.util.Date;
import java.util.Scanner;
public class TextBook extends Book {

    private String status;
    public TextBook(String bookId,String publisher,Date entryDate, double unitPrice,double quanTity,String status){
        super(bookId,publisher,entryDate,unitPrice,quanTity);
        this.status = status;
    }

    
    public String getStatus(){
        return status;
    }
    public void setStatus(String status) {  
        this.status = status;
    }
    @Override
    public void addBook(){
        Scanner scanner = new Scanner (System.in);
        super.addBook();
        System.out.print("Enter Status: ");
        setStatus(scanner.nextLine());
        System.out.println("TextBookadded successfully.");
    }
    public void updateBook(String id){
        if (getbookId().equals(id)){
            Scanner scanner = new Scanner (System.in);
            super.updateBook(id);
            System.out.print("Enter new Status.");
            setStatus(scanner.nextLine());
            System.out.println("ReferenceBook updated successflly");
                    
        }else{
            System.out.println("Not found ID"+id);
        }
        
    }
    public void displayBook(){
        super.displayBook();
        System.out.println("Status: "+getStatus());
    }
}
