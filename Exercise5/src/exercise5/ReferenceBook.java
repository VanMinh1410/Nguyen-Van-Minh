package exercise5;

import java.util.Date;

public class ReferenceBook extends Book {
    private double tax;  
    private Date entryDate; 

    public ReferenceBook(String bookId, String publisher, Date entryDate, double unitPrice, double quantity, double tax) {
        super(bookId, publisher, entryDate, unitPrice, quantity); 
        this.tax = tax;
        this.entryDate = entryDate;
    }


    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }
    @Override
    public void displayBook() {
        super.displayBook(); 
        System.out.println(", Tax: " + tax);
    }
}
